package Clock;

public interface Clock_Interface {
    void setTime(Enum p, int value) throws NTException;
    void moveTime(Enum p, int value) throws NTException;
    void setName(String _name);
    void setPrice(int price);
    int getPrice();
    String getName();
    String toString();


}
