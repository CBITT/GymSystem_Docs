/**
 * Created by BangoCs on 11/25/2016.
 */
public class Instructor {
    private String name;
    private double pricePerClass;
   InstructorSpec specs;

public Instructor(String name, double pricePerClass, Sport sport, DayOfClass dayOfTraining){
    this.name.equals(name);
    this.pricePerClass = pricePerClass;
   this.specs = new InstructorSpec(sport,dayOfTraining);
}

public Instructor(){
    setName(name);
    setPricePerClass(pricePerClass);

}



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPricePerClass() {
        return pricePerClass;
    }

    public void setPricePerClass(double pricePerClass) {
        this.pricePerClass = pricePerClass;
    }

    public InstructorSpec getSpecs() {
        return specs;
    }


}
