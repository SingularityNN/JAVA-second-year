package Clock;

public class Clock_Factory {
    public Clock Create(int H_h, int M_h, String name, int price){
        return new Clock(H_h, M_h, name, price);
    }

    public Clock_sec Create(int H_h, int M_h, int S_h, String name, int price){
        return new Clock_sec(H_h, M_h, S_h, name, price);
    }
}
