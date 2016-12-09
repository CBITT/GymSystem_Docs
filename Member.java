
package OOAD;

/**
 *
 * @author Peter Mikulasko
 */
public class Member extends Person {
    private String emergencyContact;
    private String membershipType = null;
    private String status = "Active";

    public Member(){}



    public Member(String name, String surname, int age, Gender gender,String emergencyContact, String membershipType, String status) {
        super(name,surname,age,gender);
        this.emergencyContact = emergencyContact;
        this.membershipType = membershipType;
        this.status = status;
    }



    public String getEmergencyContact() {
        return emergencyContact;
    }

    public void setEmergencyContact(String emergencyContact) {
        this.emergencyContact = emergencyContact;
    }

    public String getMembershipType() {
        return membershipType;
    }

    public void setMembershipType(String membershipType) {
        this.membershipType = membershipType;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }


    @Override
    public String toString() {
        return "Member Details:"
                +"\n" + super.toString() + ", "
                +"\n" + getEmergencyContact() + ", "
                +"\n" + getMembershipType() + ", "
                +"\n" + getStatus();
    }
}
