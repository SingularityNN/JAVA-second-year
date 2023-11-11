package Clock;

public class Clock_3h_Factory implements Clock_Factory{
    @Override
    public Clock_Interface Create_Clock(int H_h, int M_h, int S_h, String name, int value){
        return new Clock_sec(H_h, M_h, S_h, name, value);
    }
}
