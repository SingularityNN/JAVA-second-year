package Clock;

public interface Clock_Interface {
    void Set_time(int H_h, int M_h, int S_h) throws NTException;
    void Set_name(String _name);
    void Set_value(int _value);
    int Get_value();
    String Get_name();
    void Print_time();
    void Print_info();
    void Move_time(int minutes_plus, int hours_plus);


}
