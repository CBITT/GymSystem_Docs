/**
 * Created by BangoCs on 11/25/2016.
 */
public class Instructor {
    private String name;
    private double pricePerClass;
    private String sport;
    private String dayOfTraining;

public Instructor(String name, double pricePerClass, String sport, String dayOfTraining){
    this.name.equals(name);
    this.pricePerClass = pricePerClass;
    this.sport = sport;
    this.dayOfTraining.equals(dayOfTraining);
}

public Instructor(){
    setName(name);
    setPricePerClass(pricePerClass);
    setSport(sport);
    setDayOfTraining(dayOfTraining);
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

    public String getSport() {
        return sport;
    }

    public void setSport(String sport) {
        this.sport = sport;
    }

    public String getDayOfTraining() {
        return dayOfTraining;
    }

    public void setDayOfTraining(String dayOfTraining) {
        this.dayOfTraining = dayOfTraining;
    }


}
