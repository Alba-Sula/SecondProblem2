import java.util.Date;

public class Schedules {
    public Date date;
    public int repeatInMinutes;


    public Schedules(Date date, int repeatInMinutes) {
        this.date = date;
        this.repeatInMinutes = repeatInMinutes;
    }

    public Schedules() {
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getRepeatInMinutes() {
        return repeatInMinutes;
    }

    public void setRepeatInMinutes(int repeatInMinutes) {
        this.repeatInMinutes = repeatInMinutes;
    }
}
