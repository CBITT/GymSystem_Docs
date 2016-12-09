import org.junit.Test;

import java.util.*;

/**
 * Created by BangoCs on 11/25/2016.
 */
public class InstructorBooking extends BookingGeneral{

public List instructors;

    public InstructorBooking(){

        instructors = new LinkedList();
    }

    public void addInstructor(String name, double pricePerClass, Sport sport, DayOfClass dayOfTraining){

       Instructor instructor = new Instructor(name,pricePerClass,sport,dayOfTraining);

        instructors.add(instructor);

    }
    public List bookInstructor(InstructorSpec spec){

        List availableInstructors = new LinkedList();


        for (Iterator it = instructors.iterator();it.hasNext();){
            Instructor instructor = (Instructor)it.next();

             InstructorSpec instructorSpec = instructor.getSpecs();

            if (spec.getSport()== instructorSpec.getSport() && spec.getDayOfClass() == instructorSpec.getDayOfClass())

                availableInstructors.add(instructor);

        }

         if (!availableInstructors.isEmpty()){
                 printAvailableInstructors(availableInstructors, spec);
         }
         else {
            System.out.println("Sorry, no Instructors available");
        }
        return availableInstructors;
    }

    private void printAvailableInstructors(List availableInstructors, InstructorSpec spec) {
        System.out.print("Available instructors "+availableInstructors.size()+" : \n\n");

        for (Iterator i = availableInstructors.iterator(); i.hasNext(); ) {
            Instructor instructor = (Instructor) i.next();


            System.out.println("Name: " +
                    instructor.getName()+ "\nPrice per session: €"+instructor.getPricePerClass()
                    + "\nSport: "+spec.getSport()+ "\nDay of training: "+ spec.getDayOfClass());
        }
    }

    @Override
    void generateRefNum() {
        Random random = new Random();
        int refNum = random.nextInt((9999999 - 1000000) + 1) + 1000000;
        referenceNum = refNum;
    }

    @Override
    int getReferenceNum() {
        return referenceNum;
    }
}



