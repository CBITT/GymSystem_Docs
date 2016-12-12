package OOAD;

/**
 * Created by Peter Mikulasko
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
