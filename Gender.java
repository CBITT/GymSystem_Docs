package OOAD;

/**
 * Created by Server on 03/12/2016.
 */
public enum Gender {
    MALE, FEMALE;


    public String toString(){

        switch (this){

            case MALE: return "Male";
            case FEMALE: return "Female";
            default: return "unspecified";
        }

    }
}
