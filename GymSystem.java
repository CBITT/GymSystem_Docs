
package OOAD;

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
        
        registerMembers rM = new registerMembers();
        
        newMember.setName("Peter");
        newMember.setSurname("Mikulasko");
        newMember.setAge(27);
        newMember.setGender("MAle");
        newMember.setEmergencyContact("sdfdsf");

        
        System.out.print(newMember.toString());
    }
    
}
