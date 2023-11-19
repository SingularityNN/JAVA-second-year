package Clock;

public class Clock_Factory {
    public Clock create(int H_h, int M_h, String name, int price)throws NTException{
        return new Clock(H_h, M_h, name, price);
    }

    public Clock_sec create(int H_h, int M_h, int S_h, String name, int price)throws NTException{
        return new Clock_sec(H_h, M_h, S_h, name, price);
    }
}
