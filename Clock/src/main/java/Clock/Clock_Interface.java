package Clock;

public interface Clock_Interface {
    int Get_value();
    String Get_name();
    void Print_time();
    void Move_time(int minutes_plus, int hours_plus);
    void Print_info();

}
