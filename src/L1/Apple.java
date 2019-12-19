package L1;

/**
 *
 * @author maria
 */
public class Apple extends Food {
    private Double calories = null;
    public Apple(String size) {
        super("Яблоко");
        par1 = size;
    }
     public boolean equals (Object arg0) {
        if (super.equals(arg0)) {
            if (!(arg0 instanceof Apple)) return false;
            return par1.equals(((Apple)arg0).par1);
        } else
            return false;
    }
    public void consume () {
        System.out.println(this + "съедено");
    }
    public Double calculateCalories() {
        if(par1.equals("маленькое")) {
            calories = 15.0;
        }
        else if(par1.equals("среднее")) {
            calories = 20.0;
        }
        else if(par1.equals("большое")){
            calories = 25.0;
        }
        return calories;
    }
    public String getSize() {
        return par1;
    }
    public void setSize(String size) {
        this.par1 = size;
    }
    public String toString() {
        return super.toString() + "размера '" +par1.toUpperCase() + "'";
    }
}
