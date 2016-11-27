import java.util.ArrayList;
import java.util.Iterator;
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
    public Instructor bookInstrunctor(String sport, String dayOfTraining){

        for (Iterator it = instructors.iterator();it.hasNext();){
            Instructor instructor = (Instructor)it.next();

            if (sport.equals(instructor.getSport()) && dayOfTraining.equals(instructor.getDayOfTraining()))
            return instructor;


        }
        return null;
    }

}


