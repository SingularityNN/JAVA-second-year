package Clock;

public class Main {
    public static void main(String[] args) throws NTException {
        Clock_Interface cl1 = new Clock(14, 30, "Rolex", 500000);
        Clock_Interface cl2 = new Clock_sec(3, 11, 41, "Xiaomi", 14500);
        Clock_Interface cl3 = new Clock_sec(5, 4, 11, "Xiaomi", 16000);
        Clock_Interface cl4 = new Clock(1, 0, "AAA", 5000);
        Clock_Interface cl5 = new Clock(4, 30, "Rolex", 50000);
        Clock_Interface cl6 = new Clock_sec(5, 4, 0, "Rolex", 6000);

        Shop shop = new Shop();
        shop.addClock(cl1);
        shop.addClock(cl2);
        shop.addClock(cl3);
        shop.addClock(cl4);
        shop.addClock(cl5);
        shop.addClock(cl6);
        shop.printStock();
        System.out.println("=====================================");

        shop.setGlobalTime(1, 2, 3);
        shop.printStock();
        System.out.println("=====================================");

        System.out.println(shop.getMostValuable().toString());
        System.out.println("=====================================");

        shop.printSortedNames();
        System.out.println("=====================================");

        System.out.println(shop.GetMostFrequentName());
        System.out.println("=====================================");

    }
}
