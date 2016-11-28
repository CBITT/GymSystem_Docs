/**
 * Created by BangoCs on 11/28/2016.
 */
public class InstructorSpec {

    private Sport sport;
    private DayOfClass dayOfClass;

    public InstructorSpec(Sport sport, DayOfClass dayOfClass){
        this.sport = sport;
        this.dayOfClass = dayOfClass;
    }
    public Sport getSport(){
        return sport;
    }
    public DayOfClass getDayOfClass(){
        return dayOfClass;
    }

}
