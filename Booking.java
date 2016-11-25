import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by BangoCs on 11/25/2016.
 */
public class Booking {

private List instructors;

    public  Booking(){
        List<Instructor> instructors = new ArrayList<>();
    }

    public void addInspector(String name, double pricePerClass,String sport,String dayOfTraining){

       Instructor instructor = new Instructor(name,pricePerClass,sport,dayOfTraining);

        instructors.add(instructor);

    }
    public Instructor findInstrunctor(Instructor requestedInstructor){

        for (Iterator it = instructors.iterator();it.hasNext();){
            Instructor instructor = (Instructor)it.next();
            String name = requestedInstructor.getName();
            double pricePerClass = requestedInstructor.getPricePerClass();
            String sport = requestedInstructor.getSport();
            String dayOfTraining = requestedInstructor.getDayOfTraining();

            if (name.equals(instructor.getName()) && pricePerClass == instructor.getPricePerClass()
                    && sport.equals(instructor.getSport()) && dayOfTraining.equals(instructor.getDayOfTraining()))
            return instructor;


        }
        return null;
    }

}


