package Clock;

public class Clock_sec extends Clock implements Clock_Interface{
    private int Second_Hand;

    public Clock_sec(){}
    @Override
    public void Set_time(int H_h, int M_h, int S_h){
        if(H_h < 0 || M_h < 0 || S_h < 0){
            throw new RuntimeException("Negative time parametr");
        }
        else {
            this.Hour_hand = (H_h % 12) + (M_h / 12);
            this.Minute_hand = (M_h % 12) + (S_h / 12);
            this.Second_Hand = (S_h % 12);
        }
    }
    public Clock_sec(int H_h, int M_h, int S_h, String name, int value){
        Set_time(H_h, M_h, S_h);
        Set_name(name);
        Set_value(value);
    }
    @Override
    public void Print_time(){
        System.out.println("H: " + this.Hour_hand + ", M: " + this.Minute_hand + ", S: " + this.Second_Hand);
    }
    public void Move_time(int hours_plus, int minutes_plus, int seconds_plus){
        this.Second_Hand += seconds_plus;
        this.Minute_hand += minutes_plus + (Second_Hand / 12);
        this.Hour_hand += hours_plus + (Minute_hand / 12);

        this.Hour_hand = this.Hour_hand % 12;
        this.Minute_hand = this.Minute_hand % 12;
        this.Second_Hand = this.Second_Hand % 12;
    }
}
