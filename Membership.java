/**
 * Created by BangoCs on 11/17/2016.
 */
public class Membership extends Member{

    String type;
    String period;
    int session;
    double price;
    String memberName;

    public Membership(String type, String period, int session, String memberName,double price){
        this.type = type;
        this.period = period;
        this.session = session;
        this.price = price;
        memberName = super.getMemberName();
    }
    public Membership(){
        setType(type);
        setPeriod(period);
        setSession(session);
        setPrice(price);
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setPeriod(String period) {
        this.period = period;
    }
    public void setSession(int session) {
        this.session = session;
    }
    public void setPrice(double price) {
        this.price = price;
    }

    public String getType(){
        return type;
    }
    public String getPeriod(){
        return period;
    }
    public double getPrice(){
        return price;
    }
    public int getSession(){
        return session;
    }

}
