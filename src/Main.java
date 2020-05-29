import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Timer;

public class Main {
    public static void main(String[] args) throws ParseException {

        Timer timer = new Timer();
        Task tsk = new Task();
        tsk.Name = "Task1";
        tsk.Description = "Task1 Description";

        int repeating = 1;
        String datestring = "2020/05/28 23:32:08";
        SimpleDateFormat format = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date date = format.parse(datestring);
        Schedules schdls = new Schedules(date, repeating);
        ArrayList<Schedules> schedules = new ArrayList<>();
        schedules.add(schdls);
        tsk.setSchedules(schedules);

        ArrayList<Schedules> schArr = tsk.getSchedules();
        for (int i =0 ; i<schArr.size(); i++){
            Schedules sch = schArr.get(i);
            Date dt = sch.getDate();
            Date currentDate = new Date();
            int repeat = sch.getRepeatInMinutes()*60000;
            if (currentDate.compareTo(dt) == 0){
                timer.scheduleAtFixedRate(tsk,dt,repeat);
            }
        }
    }
}

