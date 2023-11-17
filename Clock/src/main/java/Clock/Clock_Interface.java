package Clock;

public interface Clock_Interface {
    void Set_time(Enum p, int value) throws NTException;
    void Move_time(Enum p, int value) throws NTException;
    void Set_name(String _name);
    void Set_price(int price);
    int Get_price();
    String Get_name();
    String toString();


}
