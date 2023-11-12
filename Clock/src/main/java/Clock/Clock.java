package Clock;

public class Clock implements Clock_Interface {
    protected int Hour_hand;
    protected int Minute_hand;
    protected String name;
    protected int value;
    public Clock(){
    }
    public Clock(int H_h, int M_h, String name, int value){
        try {
            Set_time(H_h, M_h, 0);
        }
        catch (NTException ex){
            System.out.println(ex);
        }
        Set_name(name);
        Set_value(value);
    }
    @Override
    public void Set_time(int H_h, int M_h, int S_h) throws NTException{
        if(H_h < 0 || M_h < 0){
            throw new NTException();
        }
        else {
            this.Hour_hand = (H_h % 12) + (M_h / 12);
            this.Minute_hand = (M_h % 12);
        }
    }
    @Override
    public void Set_name(String name){
        this.name = name;
    }
    @Override
    public void Set_value(int value){
        this.value = value;
    }
    @Override
    public void Move_time(int hours_plus, int minutes_plus){
        this.Minute_hand += minutes_plus;
        this.Hour_hand += hours_plus + (Minute_hand / 12);

        this.Hour_hand = this.Hour_hand % 12;
        this.Minute_hand = this.Minute_hand % 12;
    }
    @Override
    public String Get_name(){
        return this.name;
    }
    @Override
    public int Get_value(){
        return this.value;
    }
    @Override
    public void Print_time(){
        System.out.println("H: " + this.Hour_hand + ", M: " + this.Minute_hand);
    }
    @Override
    public void Print_info(){
        System.out.println("Марка: " + Get_name() + ", стоимость: " + Get_value());
        Print_time();
    }
}
