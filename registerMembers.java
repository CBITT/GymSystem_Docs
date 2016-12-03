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
    private List members;
    
    public registerMembers(){
        members = new LinkedList();
    }
    
    public void addMember(String name, String surname, int age, String gender, String emergencyContact){
        Member member = new Member(name, surname, age, gender, emergencyContact);
        members.add(member);
    }
}
