import java.io.*;
import java.util.Scanner;

public class TesterTask{

    public static void copy(Scanner scanner, String fileName)throws FileNotFoundException{
        PrintWriter taskCopy = new PrintWriter(fileName);
        while (scanner.hasNextLine()){
            String[] parameters = scanner.nextLine().split(",");
            Task task = new Task(parameters[0],parameters[1],Boolean.parseBoolean(parameters[2]),Integer.parseInt(parameters[3]));
            
            //System.out.println(task);
            taskCopy.println(task);
           
        }
        taskCopy.close();
    }


    public static Task newTask(Scanner userScanner){
        System.out.println("What is the task?");
        String taskName = new String(userScanner.nextLine());
        taskName = new String(userScanner.nextLine());
        System.out.println("What is the due date?");
        String date = new String(userScanner.nextLine());
        System.out.println("is the task complete (enter true or false)?");
        String status = new String(userScanner.nextLine());
        System.out.println("What is the priority (1-5)?");
        int priority = userScanner.nextInt();
        while (priority > 5 || priority < 0){
            System.out.println("priority out of range");
            System.out.println("What is the priority (1-5)?");
            priority = userScanner.nextInt();
        }    
        Task task = new Task(taskName,date,Boolean.parseBoolean(status),priority);
        return task;
    }

    public static void clear(String fileName)throws FileNotFoundException{
        PrintWriter taskCopy = new PrintWriter(fileName);
        taskCopy.close();
    }

    public static Task taskUpdater(Scanner userScanner, Task task){
        System.out.println("What would you like to change?");
                System.out.println("\t 1. task name \n\t 2. task date");
                System.out.println("\t 3. task Status \n\t 4. task priority");
                int updateCommand = userScanner.nextInt();

                if (updateCommand == 1){
                    System.out.println("What is the task?");
                    String taskName = new String(userScanner.nextLine());
                    taskName = new String(userScanner.nextLine());
                    task.setDesc(taskName);
                }       
                
                if (updateCommand ==2){
                    System.out.println("What is the due date?");
                    String date = new String(userScanner.nextLine());
                    date = new String(userScanner.nextLine());
                    task.setDate(date);
                    
                }

                if (updateCommand == 3){
                    System.out.println("is the task complete (enter true or false)?");
                    String status = new String(userScanner.nextLine());
                    status = new String(userScanner.nextLine());
                    task.setStatus(Boolean.parseBoolean(status));
                }

                if (updateCommand == 4){
                    System.out.println("What is the priority (1-5)?");
                    int priority = userScanner.nextInt();
                    while (priority > 5 || priority < 0){
                        System.out.println("priority out of range");
                        System.out.println("What is the priority (1-5)?");
                        priority = userScanner.nextInt();
                    }    
                    task.setPriority(priority);
                    
                }
                return task;
                
    }

    public static void update(String fileName, Scanner userScanner) throws FileNotFoundException{
        File file = new File(fileName);
        Scanner scanner = new Scanner(file);
        File updateFile = new File("TaskUpdater.md");
        Scanner updateScanner = new Scanner(updateFile);
       
        
        PrintWriter update = new PrintWriter(updateFile);
    
        copy(scanner, "TaskUpdater.md");
        
        System.out.println("What task would you like to update?");
        int taskNum = userScanner.nextInt();

        for (int i = 0; i == taskNum -1  ; i++){
            updateScanner.nextLine();
        }

        String[] parameters = updateScanner.nextLine().split(",");
        Task task = new Task(parameters);
        int command = 0;
        
         PrintWriter updateCopy = new PrintWriter("TaskOut.md");
         while (command != 3){
            System.out.println("\n\t - " + task);
             System.out.println("\nwhat would you like to change?");
             System.out.println("\t 1. Update the task \n\t 2. Delete the task \n\t 3. Commit");
             command = userScanner.nextInt();
             if (command > 3 || command < 0){
                 System.out.println("sorry out of range");
                 command = userScanner.nextInt();
             } else if (command == 1){
                task = taskUpdater(userScanner, task);
                
             } else if (command == 2){
                 clear("taskUpdater.md");
                 command = 3;
             }
             updateScanner = new Scanner(updateFile);
                int i =0;
                System.out.println(taskNum);
                while (updateScanner.hasNextLine()){
                    if (i == taskNum){
                        updateCopy.println(task);
                    } else {
                        updateCopy.println(updateScanner.nextLine());
                    }
                    i++;
                    updateCopy.flush();
                }
                updateCopy.close();
        }
        
        
    }   


    public static void displayTasks(String fileName)throws FileNotFoundException{
        File file = new File(fileName);
        Scanner scanner = new Scanner(file);
        System.out.println("\nCurrent tasks: ");
        if (scanner.hasNextLine()){
            int i = 0;
            while (scanner.hasNextLine()){
                String[] parameters = scanner.nextLine().split(",");
                Task task = new Task(parameters[0],parameters[1],Boolean.parseBoolean(parameters[2]),Integer.parseInt(parameters[3]));
                
                System.out.println("\t" + i + ". " + task);
                i++;
            }
        } else {
            System.out.println("\t - No Tasks");
        }
        System.out.println("");

    }


    public static void main(String[] args)throws IOException, IndexOutOfBoundsException, ArrayIndexOutOfBoundsException {
        File file;
        Scanner scanner;
        Scanner userScanner;
        int command = 0;

        try{
            file = new File("TaskOut.md");
            File copyFile = new File("TaskCopy.md");
            userScanner = new Scanner(System.in);
            scanner = new Scanner(file);
            Scanner copy;
            
            
            copy(scanner,"TaskCopy.md");
            PrintWriter output = new PrintWriter("TaskOut.md");
            copy = new Scanner(copyFile);
            copy(copy, "TaskOut.md");

            while (command != 2){
                displayTasks("TaskOut.md");
                scanner = new Scanner(file);
                
                if (scanner.hasNextLine()){
                    System.out.println("What would you like to do?");
                    System.out.println("\t 1. Add new task\n \t 2. Quit \n \t 3. Clear all tasks \n \t 4. Update a task");
                    System.out.println("enter a number: (1-4)");
                    command = userScanner.nextInt();
                } else {
                    System.out.println("What would you like to do?");
                    System.out.println("\t 1. Add new task\n \t 2. Quit");
                    System.out.println("enter a number: (1-2)");
                    command = userScanner.nextInt();
                }

                
                if (command == 1){
                    output.println(newTask(userScanner));
                    output.flush();
                }

                if (command == 3){
                    clear("TaskOut.md");
                }

                if (command == 4){
                    update("TaskOut.md", userScanner);
                }
                
            }
            //output.close();
            
        } finally{
            System.out.println("done");
        }
        
    }
    
}