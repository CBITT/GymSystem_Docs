/**
 * Created by BangoCs on 11/28/2016.
 */
public enum DayOfClass {

    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;

    public String toString() {

        switch (this){

            case MONDAY: return "Monday";
            case TUESDAY: return "Tuesday";
            case WEDNESDAY: return "Wednesday";
            case THURSDAY: return "Thursday";
            case FRIDAY: return "Friday";
            case SATURDAY: return "Saturday";
            case SUNDAY: return "Sunday";
            default: return "unspecified";
        }
    }
}
