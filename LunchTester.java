public class LunchTester{
    public static void main(String[] args) {
        LunchAccount randy = new LunchAccount();
        
        System.out.println(randy.getBalance());
        randy.addBalance(19.57);
        System.out.println(randy.getBalance()); //39.57
        
        System.out.println(randy.buyFood(9.99));
        System.out.println(randy.buyFood(99.99)); //denied

        System.out.println(randy.getBalance());
        randy.addBalance(90.42);
        System.out.println(randy.getBalance());

        System.out.println(randy.getId());

        LunchAccount sandy = new LunchAccount(70.00);
        System.out.println(sandy.getId());

        System.out.println(randy.buyFood(21.50));
        System.out.println(randy.buyFood(3.50));
        System.out.println(randy.getTotalLunchs()); //3
        System.out.println(randy.getTotalMoneySpent()); //34.99

        sandy.addBalance(10.00);
        System.out.println(sandy.getBalance());//100.00

    }
}