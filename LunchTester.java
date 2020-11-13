public class LunchTester{
    public static void main(String[] args) {
        LunchAccount randy = new LunchAccount("Randy", "1234");
        
        System.out.println(randy.getBalance());
        randy.addBalance(20.57);
        System.out.println(randy.getBalance());
        
        System.out.println(randy.buyFood(9.99));
        System.out.println(randy.buyFood(99.99));

        randy.addBalance(90.42);
        System.out.println(randy.getBalance());

    }
}