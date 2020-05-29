import java.util.ArrayList;
import java.util.Date;
import java.util.TimerTask;


public class Task extends TimerTask {
    public String Name;
    public String Description;
    public ArrayList<Schedules> Scheduls;

    public Task(String name, String description, ArrayList<Schedules> schedules) {
        Name = name;
        Description = description;
        Scheduls = schedules;
    }

    public Task() {
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public ArrayList<Schedules> getSchedules() {
        return Scheduls;
    }

    public void setSchedules(ArrayList<Schedules> schedules) {
        Scheduls = schedules;
    }

    @Override
    public void run() {
        System.out.println("Running the " + getName()+ " task");
    }
}
