/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gymsystem;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Server
 */
public class registerMembers {
    private List members;
    
    public registerMembers(){
        members = new LinkedList();
    }
    
    public void addMember(String name, String surname, int age){
        Member member = new Member(name, surname, age);
        members.add(member);
    }
}
