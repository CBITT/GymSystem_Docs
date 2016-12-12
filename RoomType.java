
import java.util.Random;
import javax.swing.JOptionPane;

public enum RoomType {
    
    WEIGHTS, POOL, CARDIO;
    
Random r = new Random();    
int capacity = 30;
int min = 0;
int max = capacity;
int currCapacity = r.nextInt(max - min) + min;
//return currCapacity;

/*public static int roomSize(int capacity, int min, int max){
    

}*/

  
    public String toString(){
        switch(this){
            case WEIGHTS:               
        {
            int currCapacity = r.nextInt(max - min) + min;
            if(currCapacity == max){
                /*JOptionPane.showMessageDialog(null,"There are currently " + currCapacity + " people in the Weights room" +
                "The Weights room is full, please come back later");*/
                return "There are currently " + currCapacity + " people in the Weights room" +
                        "The Weights room is full, please come back later";
            }else
                return "There are currently " + currCapacity + " people in the Weights room" +
                        "Enjoy your workout";
        }
                
                
            case POOL:
            {
                int currCapacity = r.nextInt(max - min) + min;
                if(currCapacity == max){
                /*JOptionPane.showMessageDialog(null,"There are currently " + currCapacity + " people in the Weights room" +  
                                                   "The Weights room is full, please come back later");*/
                return "There are currently " + currCapacity + " people in the Pool room" +  
                                                   "The Pool room is full, please come back later";
                }else
                return "There are currently " + currCapacity + " people in the Pool room" +  
                                                   "Enjoy your workout";
            }
            
            case CARDIO:
            {
                int currCapacity = r.nextInt(max - min) + min;
                if(currCapacity == max){
                /*JOptionPane.showMessageDialog(null,"There are currently " + currCapacity + " people in the Weights room" +  
                                                   "The Weights room is full, please come back later");*/
                return "There are currently " + currCapacity + " people in the Cardio room" +  
                                                   "The Cardio room is full, please come back later";
                }else
                return "There are currently " + currCapacity + " people in the Cardio room" +  
                                                   "Enjoy your workout";
            }
                default: return "Unknown";
        }
    }
    
}
