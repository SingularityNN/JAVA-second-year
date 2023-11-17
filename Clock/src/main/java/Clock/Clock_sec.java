package Clock;

public class Clock_sec extends Clock implements Clock_Interface{
    private int Second_Hand;

    public Clock_sec(){
        super();
    }

    public Clock_sec(int H_h, int M_h, int S_h, String name, int price){
        super(H_h, M_h, name, price);
        this.Second_Hand = S_h;
    }

    @Override
    public void Set_time(Enum p, int value) throws NTException{
        if(value < 0)
            throw new NTException();
        if(p == Enum.SECONDS)
            this.Second_Hand = value;
        else
            super.Set_time(p, value);
    }
    @Override
    public int Get_price(){
        return super.Get_price();
    }

    @Override
    public String Get_name(){
        return super.Get_name();
    }

    @Override
    public String toString(){
        return "Марка: " + Get_name() + ", стоимость: " + Get_price() + "\n" + "H: " + this.Hour_hand + ", M: " + this.Minute_hand + ", S: " + this.Second_Hand;
    }

    @Override
    public void Move_time(Enum p, int value) throws NTException{
        if(value < 0)
            throw new NTException();
        if(p == Enum.SECONDS){
            this.Second_Hand += value;
            this.Minute_hand += this.Second_Hand / 60;
            this.Hour_hand += this.Minute_hand / 60;

            this.Second_Hand %= 60;
            this.Minute_hand %= 60;
            this.Hour_hand %= 12;
        }
        else
            super.Move_time(p, value);
    }





}
