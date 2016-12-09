import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by BangoCs on 12/9/2016.
 */
public class InstructorSpecTest {
    @Test(expected = IllegalArgumentException.class)
    public void checkSpecValueSport(){
        Sport.valueOf("Formula1");
    }

    @Test(expected = IllegalArgumentException.class)
    public void checkSpecValueDay(){
        DayOfClass.valueOf("HOLIDAY");
    }



}