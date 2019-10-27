import java.util.Date;

public class Pressure {

    int upPressure;
    int downPressure;
    int pulse;
    boolean tachycardia;
    Date date;

    public Pressure(int upPressure, int downPressure, int pulse, boolean tachycardia, Date date) {
        this.upPressure = upPressure;
        this.downPressure = downPressure;
        this.pulse = pulse;
        this.tachycardia = tachycardia;
        this.date = date;
    }
}
