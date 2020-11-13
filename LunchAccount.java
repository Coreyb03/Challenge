public class LunchAccount{
    private String name;
    private String id;
    private double balance;

    public LunchAccount(String name, String id, double balance){
        this.name = name;
        this.id = id;
        this.balance = balance;
    }

    public LunchAccount(String name, String id){
        this.name = name;
        this.id = id;
        this.balance = 0.0;
    }

    public double getBalance(){
        return this.balance;
    }

    public void addBalance(double money){
        this.balance =+ money;
    }

    public String buyFood(double price){
        if (this.balance >= price){
            this.balance -= price;
            return "Remaining balance: " + Double.toString(balance);
        } else {
            return "Transaction Denied";
        }
    }
}