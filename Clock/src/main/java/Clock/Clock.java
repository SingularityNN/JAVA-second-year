package Clock;

public class Clock implements Clock_Interface {
    protected int Hour_hand;
    protected int Minute_hand;
    protected String name;
    protected int value;
    public Clock(){
    }
    public Clock(int H_h, int M_h, String name, int value){
        Set_time(H_h, M_h);
        Set_name(name);
        Set_value(value);
    }
    public void Set_time(int H_h, int M_h){
        if(H_h < 0 || M_h < 0){
            System.out.println("Отрицательный параметр времени");
            return;
        }
        else {
            this.Hour_hand = (H_h % 12) + (M_h / 12);
            this.Minute_hand = (M_h % 12);
        }
    }

    protected void Set_name(String name){
        this.name = name;
    }
    protected void Set_value(int value){
        this.value = value;
    }
    public void Move_time(int hours_plus, int minutes_plus){
        this.Minute_hand += minutes_plus;
        this.Hour_hand += hours_plus + (Minute_hand / 12);

        this.Hour_hand = this.Hour_hand % 12;
        this.Minute_hand = this.Minute_hand % 12;
    }
    public String Get_name(){
        return this.name;
    }
    public int Get_value(){
        return this.value;
    }
    public void Print_time(){
        System.out.println("H: " + this.Hour_hand + ", M: " + this.Minute_hand);
    }
    public void Print_info(){
        System.out.println("Марка: " + Get_name() + ", стоимость: " + Get_value());
        Print_time();
    }
}
