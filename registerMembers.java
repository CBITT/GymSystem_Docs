/**
 * Created by Peter Mikulasko
 */
package OOAD;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Peter Mikulasko
 */
public class registerMembers {
    private List<Member> members;
    
    public registerMembers(){

        members = new LinkedList<>();
    }
    
    public void addMember(String name, String surname, int age, Gender gender, String emergencyContact, String membershipType, String status){
        Member member = new Member(name, surname, age, gender, emergencyContact, membershipType, status);
        members.add(member);
    }

    public void displayAllMembers(){
     for(Member member: members)
     {
         System.out.println(member);
     }
    }


}
