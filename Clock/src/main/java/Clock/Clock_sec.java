package Clock;

public class Clock_sec extends Clock implements Clock_Interface{
    private int Second_Hand;

    public Clock_sec(){
        super();
    }

    public Clock_sec(int H_h, int M_h, int S_h, String name, int price)throws NTException{
        super(H_h, M_h, name, price);
        if(S_h < 0)
            throw new NTException();
        this.Second_Hand = S_h;
    }

    @Override
    public void setTime(Enum p, int value) throws NTException{
        if(value < 0)
            throw new NTException();
        if(p == Enum.SECONDS)
            this.Second_Hand = (value % 60);
        else
            super.setTime(p, value);
    }
    @Override
    public int getPrice(){
        return super.getPrice();
    }

    @Override
    public String getName(){
        return super.getName();
    }

    @Override
    public String toString(){
        return "Марка: " + this.getName() + ", стоимость: " + this.getPrice() + "\n" + "H: " + this.Hour_hand + ", M: " + this.Minute_hand + ", S: " + this.Second_Hand;
    }

    @Override
    public void moveTime(Enum p, int value) throws NTException{
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
            super.moveTime(p, value);
    }





}
