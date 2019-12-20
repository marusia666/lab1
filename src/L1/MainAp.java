package L1;
import javafx.beans.binding.ObjectBinding;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.Comparator;

/**
 *
 * @author maria
 */
public class MainAp {
    @SuppressWarnings("unchecked")
    public static void main(String[] args) throws Exception {
        Food [] breakfast = new Food[20];
        int i = 0;
        for (String arg: args) {
            String[] parts = arg.split("/");
            if (parts[0].equals("Сыр")) {
                    breakfast[i] = new Cheese ();
                } else
                if (parts[0].equals("Яблоко")) {
                    breakfast[i] = new Apple (parts[1]);
                } else
                if (parts[0].equals("Чай")) {
                    breakfast[i] = new Tea (parts[1]);
                }
            i++;
        }
        for (String arg: args) {
            String[] parts = arg.split("/");
            if (parts[0].equals("-calories")) {
                int calories = 0;
                for (Food item: breakfast) {
                    if (item!=null) {
                        calories+=item.calculateCalories();
                    }
                    else break;
                }
                System.out.println("Общая калорийность завтрака: "+calories);
                System.out.println(" ");
                continue;
            }
            if (parts[0].equals("-sort")) {
                Arrays.sort(breakfast, new Comparator() {
                    public int compare(Object f1, Object f2) {
                        if (f1==null) return 1;
                        if (f2==null) return -1;
                        return (int) (((Food)f2).calculateCalories()-((Food)f1).calculateCalories());
                    }
                });
            }
            continue;
        }
        int eat_a1, eat_a2, eat_a3, eat_c, eat_tb, eat_tg;
        eat_a1=eat_a2=eat_a3=eat_c=eat_tb=eat_tg=0;
        for (Food item: breakfast) {
            if (item == null)
                break;
            if (item.name.equals("Яблоко")) {
                if (item.par1.equals("маленькое")) {
                    eat_a1++;
                }
                if (item.par1.equals("среднее")) {
                    eat_a2++;
                }
                if (item.par1.equals("большое")) {
                    eat_a3++;
                }
            }
            if (item.name.equals("Сыр")) {
               eat_c++; 
            }
            if (item.name.equals("Чай")) {
               if (item.par1.equals("черный")) {
                    eat_tb++;
                }
                if (item.par1.equals("зеленый")) {
                    eat_tg++;
                } 
            }  
        }
        System.out.println("Яблоко большое");
        System.out.println("");
        System.out.println("Съедено больших яблок "+eat_a3);
        System.out.println("Съедено средних яблок "+eat_a2);
        System.out.println("Съедено маленьких яблок "+eat_a1);
        System.out.println("Съедено кусков сыра "+eat_c);
        System.out.println("Выпито стаканов черного чая "+eat_tb);
        System.out.println("Выпито стаканов зеленого чая "+eat_tg);
        System.out.println("");
        System.out.println("Всего хорошего!");
        
    }
    
}
