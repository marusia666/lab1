package L1;

/**
 *
 * @author maria
 */
public abstract class Food implements Consumable, Nutritious {
    String name = null;
    String par1 = null;
    Double calories = null;
    public Food (String name) {  //конструктор
        this.name = name;
    }
    public boolean equals(Object arg0) {
        if (!(arg0 instanceof Food)) return false; // Шаг 1
        if (name==null || ((Food)arg0).name==null) return false; // Шаг 2
        return name.equals(((Food)arg0).name); // Шаг 3
    }
    public String toString() {
        return name;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
