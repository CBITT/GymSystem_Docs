
package OOAD;

import java.util.Iterator;

/**
 *
 * @author Peter Mikulasko
 */
public class GymSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Member newMember = new Member();
        
        //registerMembers rM = new registerMembers();
        
        newMember.setName("Peter");
        newMember.setSurname("Mikulasko");
        newMember.setAge(11);
        newMember.setGender(Gender.MALE);
        newMember.setEmergencyContact("0123456");
        newMember.setMembershipType("none");
        newMember.setStatus("active");

        
        System.out.print(newMember.toString());

        registerMembers rM = new registerMembers();

        rM.addMember("Peter", "mikulasko", 11, Gender.MALE, "0123456", "none", "active");
        System.out.println("............");
        System.out.println("linklist");
        rM.displayAllMembers();





    }
    
}
