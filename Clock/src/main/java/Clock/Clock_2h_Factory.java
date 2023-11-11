package Clock;

public class Clock_2h_Factory implements Clock_Factory{
    @Override
    public Clock_Interface Create_Clock(int H_h, int M_h, int S_h, String name, int value){
        return new Clock(H_h, M_h, name, value);
    }
}
