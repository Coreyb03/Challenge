import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.nio.file.FileAlreadyExistsException;
import java.util.*;

public class Task{
    String desc;
    String dueDate;
    Boolean status;
    int priority = 0;

    public Task(String desc, String dueDate, Boolean status, int priority){
        this.desc = desc;
        this.dueDate = dueDate;
        this.status = status;
        this.priority = priority;
    }

    public Task(String[] parameters){
        this(parameters[0],parameters[1],
        Boolean.parseBoolean(parameters[2]),Integer.parseInt(parameters[3]));
    }
    public String toString() {
        return desc + "," + dueDate + "," + status + "," + priority;
    }

    public void setDesc(String desc){
        this.desc = desc;
    }

    public void setDate(String date){
        this.dueDate = date;
    }

    public void setStatus(Boolean status){
        this.status = status;
    }

    public void setPriority(int priority){
        this.priority = priority;
    }


    
}