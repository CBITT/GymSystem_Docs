
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Helena
 */
public class BanMember{
    public static void main(String [] args){
        
        ArrayList<Member> allMembers = new ArrayList();
        
        Member mem1 = new Member(1 ,"Paul Riordan", 31, "Weights", 30);
       // System.out.print(mem1);
        
        Member mem2 = new Member(2,"Ayla Kendrick", 21, "Pool", 27);
        //System.out.print(mem2);
        
        Member mem3 = new Member(3,"Neil Sankar", 21, "Weights", 0);
        //System.out.print(mem3);
        allMembers.add(mem1);
        allMembers.add(mem2);
        allMembers.add(mem3);

    int IDSearch = Integer.parseInt(JOptionPane.showInputDialog("Please enter the ID number of the member you wish to search"));
    
    for(int i = 0; i < allMembers.size(); i++){
        if(IDSearch == (allMembers.get(i).getMemID())){
            JOptionPane.showMessageDialog(null, "Details of Member you have searched: \nID: " + allMembers.get(i).getMemID()
            + "\nName: " + allMembers.get(i).getName()
            + "\nAge: " + allMembers.get(i).getAge()
            + "\nMembership Type: " + allMembers.get(i).getMemType()
            + "\nRemaining days: " + allMembers.get(i).getMemCount()
            + "\nTimes reported: " + allMembers.get(i).getReportCount()
            + "\nBanned?: " + allMembers.get(i).getBanned());
            
            String report = JOptionPane.showInputDialog("Do you wish to report this member? y or n");
            
            if(report.equals("Y") || report.equals("y"))
                allMembers.get(i).setReportCount(3);
                JOptionPane.showMessageDialog(null, "\nTimes reported: " + allMembers.get(i).getReportCount());

                if(allMembers.get(i).getReportCount() == 3){
                    allMembers.get(i).setBanned(true);
                    JOptionPane.showMessageDialog(null, "\nBanned?: " + allMembers.get(i).getBanned());
                
               }
            

        }
        
    }
     
    }
}
