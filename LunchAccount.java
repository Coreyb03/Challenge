public class LunchAccount{
    private String id;
    private double balance;
    private double totalMoneySpent;
    private int totalLunchs;
    private int timesMoneyAdded;

    private static int studentCount = 0;

    public LunchAccount(double balance){
        this.studentCount += 1;
        this.id = Integer.toString(studentCount);
        this.balance = balance;
        if (studentCount < 100){
            this.balance += 20.0;
            this.timesMoneyAdded += 1;
        }
    }

    public LunchAccount(){
        this.balance = 0.0;
        this.studentCount += 1;
        this.id = Integer.toString(studentCount);
    }

    public double getBalance(){
        return this.balance;
    }

    public String getId(){
        while ((this.id).length() < 4){
            this.id = "0" + this.id;
        }
        return this.id;
        
    }

    public void addBalance(double money){
        this.balance = this.balance + money;
        if (studentCount < 100 && timesMoneyAdded == 0){
            this.balance += 20.0;
        }
        this.timesMoneyAdded += 1;
    }

    public int getTotalLunchs(){
        return this.totalLunchs;
    }

    public double getTotalMoneySpent(){
        return this.totalMoneySpent;
    }

    public String buyFood(double price){
        if (this.balance >= price){
            this.balance -= price;
            this.totalLunchs += 1;
            this.totalMoneySpent += price;
            return "Remaining balance: " + Double.toString(balance);
        } else {
            return "Transaction Denied";
        }
    }
}