package Clock;

public interface Clock_Factory {
    Clock_Interface Create_Clock(int H_h, int M_h, int S_h, String name, int value);
}
