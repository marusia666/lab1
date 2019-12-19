package L1;

/**
 *
 * @author maria
 */
public class Tea extends Food {
    private Double calories = null;
    public Tea(String color) {
        super("Чай");
        par1 = color;
    }
    public boolean equals (Object arg0) {
        if (super.equals(arg0)) {
            if (!(arg0 instanceof Tea)) return false;
            return par1.equals(((Tea)arg0).par1);
        } else
            return false;
    }
    public void consume () {
        System.out.println(this + "выпит");
    }
    public Double calculateCalories() {
        if(par1.equals("черный")) {
            calories = 25.0;
        }
        else if(par1.equals("зеленый")) {
            calories = 22.0;
        }
        return calories;
    }
    public String getColor() {
        return par1;
    }
    public void setColor(String color) {
        this.par1 = color;
    }
    public String toString() {
        return super.toString() + "цвета '" +par1.toUpperCase() + "'";
    }    
}
