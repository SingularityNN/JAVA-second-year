package Clock;

public class Clock implements Clock_Interface{
    protected int Hour_hand;
    protected int Minute_hand;
    protected String name;
    protected int price;
    public Clock(){
    }
    public Clock(int H_h, int M_h, String name, int price){
        Hour_hand = H_h;
        Minute_hand = M_h;
        Set_name(name);
        Set_price(price);
    }
    public void Set_time(Enum p, int value) throws NTException{
        if(value < 0)
            throw new NTException();

        switch (p){
            case HOURS:
                this.Hour_hand = (value % 12);
                break;

            case MINUTES:
                this.Minute_hand = (value % 60);
                break;

            case SECONDS:
                break;
        }
    }

    public void Set_name(String name){
        this.name = name;
    }

    public void Set_price(int price){
        this.price = price;
    }

    public String Get_name(){
        return this.name;
    }
    public int Get_price(){
        return this.price;
    }

    public String toString(){
        return "Марка: " + Get_name() + ", стоимость: " + Get_price() + "\n" + "H: " + this.Hour_hand + ", M: " + this.Minute_hand;
    }


    public void Move_time(Enum p, int value) throws NTException{
        if(value < 0)
            throw new NTException();

        switch (p){
            case HOURS:
                this.Hour_hand += value;
                this.Hour_hand %= 12;
                break;

            case MINUTES:
                this.Minute_hand += value;
                this.Hour_hand += Minute_hand / 60;
                this.Minute_hand %= 60;
                break;

            case SECONDS:
                break;
        }
    }



}
