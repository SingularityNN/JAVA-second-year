package Clock;

public class Main {
    public static void main(String[] args) throws NTException {

        Shop shop = new Shop();
        shop.addClock(14, 30, "Rolex", 500000);
        shop.addClockSec(3, 11, 41, "Xiaomi", 14500);
        shop.addClockSec(5, 4, 11, "Xiaomi", 16000);
        shop.addClock(1, 0, "AAA", 5000);
        shop.addClock(4, 30, "Rolex", 50000);
        shop.addClockSec(5, 4, 0, "Rolex", 6000);


        shop.printStock();
        System.out.println("=====================================");

        shop.setGlobalTime(1, 2, 3);
        shop.printStock();
        System.out.println("=====================================");

        shop.printMostValuable();
        System.out.println("=====================================");

        shop.printSortedNames();
        System.out.println("=====================================");

        System.out.println(shop.GetMostFrequentName());
        System.out.println("=====================================");

    }
}
