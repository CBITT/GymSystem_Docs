
package OOAD;

/**
 *
 * @author Peter Mikulasko
 */
public class Member {
    private String name;
    private String surname;
    private int age;
    private String gender;
    private String emergencyContact;
    
    public Member(){    
    }
    
    public Member(String name, String surname, int age, String gender, String emergencyContact) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.gender = gender;
        this.emergencyContact = emergencyContact;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age <= 0 || age > 150)
            throw new IllegalArgumentException("Age is not valid"); 
        this.age = age;
    }

    public String getGender(){ return gender; }

    public void setGender(String gender) { this.gender = gender; }

    public String getEmergencyContact() { return emergencyContact; }

    public void setEmergencyContact(String emergencyContact) { this.emergencyContact = emergencyContact; }

    @Override
    public String toString() {        
        return "Member Details:" +"\n" + getName() + ", "
                +"\n" + getSurname() + ", "
                +"\n" + getAge() + ", "
                +"\n" + getGender() + ", "
                +"\n" + getEmergencyContact();
    }
    
    
}
