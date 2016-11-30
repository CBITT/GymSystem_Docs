import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by BangoCs on 11/25/2016.
 */
public class Booking {

private List<Instructor> instructors;

    public  Booking(){
        //List<Instructor> instructors = new ArrayList<>();
        instructors = new ArrayList<>();
    }

    public void addInspector(String name, double pricePerClass,Sport sport,DayOfClass dayOfTraining){

       Instructor instructor = new Instructor(name,pricePerClass,sport,dayOfTraining);

        instructors.add(instructor);

    }
    public Instructor bookInstrunctor(Sport sport, DayOfClass dayOfTraining){

        for (Iterator it = instructors.iterator();it.hasNext();){
            Instructor instructor = (Instructor)it.next();

            if (sport.equals(instructor.getSpecs().getSport()) && dayOfTraining.equals(instructor.getSpecs().getDayOfClass()))
            return instructor;


        }
        return null;
    }

}


