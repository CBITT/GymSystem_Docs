/**
 * Created by BangoCs on 11/28/2016.
 */
public enum Sport {

    TRX, AEROBICS, SPINNING, SWIMMING, WEIGHTS, YOGA, PILATES, FITBALL;

    public String toString(){
        switch (this){
            case TRX: return "trx";
            case SPINNING: return "spinning";
            case SWIMMING: return "swimming";
            case WEIGHTS: return "weights";
            case YOGA: return "yoga";
            case PILATES: return "pilates";
            case FITBALL: return "fitball";
            case AEROBICS: return "aerobics";
            default: return "unspecified";
        }
    }
}
