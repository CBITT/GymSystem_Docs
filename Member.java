import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class Member{
    
    int memID = 0;
    String name;
    int age;
    String memType;
    int memCount;
    int reportCount = 0;
    boolean banned = false;
    
    /*I have added reportCount and the boolean banned in order to implement a
    banning feature for the members class.
    */
    
    List members = new ArrayList();
    
    public int getMemID(){
        return memID;
    }
    
    public String getName(){
        return name;
    }
    
    
    public int getAge(){
        return age;
    }
    
    public String getMemType(){
        return memType;
    }
    
    public int getMemCount(){
        return memCount;
    }
    
    public int getReportCount(){
        return reportCount;
    }
    
    public boolean getBanned(){
        return banned;
    }
    
    public void setMemID(int memID){
        this.memID = memID;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public void setAge(int age){
        this.age = age;
    }
    
    public void setMemType(String memType){
        /*if(memType != "Weights" || memType != "Pool" || memType != "Cardio" || memType != "Combo")
            System.out.print("Error - Invalid Membership");
        else*/
        this.memType = memType;
    }
    
    public void setMemCount(int memCount){
        this.memCount = memCount;
    }
    
    /*public void setReportCount(int reportCount){
        this.reportCount = reportCount;
    }
    
    public void setBanned(boolean banned){
            this.banned = banned;
            if(reportCount == 3){
            this.banned = true;
            JOptionPane.showMessageDialog(null, "You have been banned from the gym");
        }
    }*/
    
    public Member(int memID, String name, int age, String memType, int memCount){
        int num = 1;
        this.memID = num;
        setName(name);
        setAge(age);
        setMemType(memType);
        setMemCount(memCount);
        num++;
    }
    
    public String toString(){
        return "Member ID: " + getMemID() +
               "\nMember Name: " + getName() +
               "\nMember Age: " + getAge() +
               "\nMembership: " + getMemType() +
               "\nRemaining Membership: " + getMemCount();
    }


    
    
    
    
}