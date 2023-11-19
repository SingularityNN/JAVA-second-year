package Clock;

public class Clock implements Clock_Interface{
    protected int Hour_hand;
    protected int Minute_hand;
    protected String name;
    protected int price;
    public Clock(){
    }
    public Clock(int H_h, int M_h, String name, int price)throws NTException{
        if(H_h < 0 || M_h < 0)
            throw new NTException();
        Hour_hand = H_h;
        Minute_hand = M_h;
        setName(name);
        setPrice(price);
    }
    public void setTime(Enum p, int value) throws NTException{
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

    public void setName(String name){
        this.name = name;
    }

    public void setPrice(int price){
        this.price = price;
    }

    public String getName(){
        return this.name;
    }
    public int getPrice(){
        return this.price;
    }

    public String toString(){
        return "Марка: " + getName() + ", стоимость: " + getPrice() + "\n" + "H: " + this.Hour_hand + ", M: " + this.Minute_hand;
    }


    public void moveTime(Enum p, int value) throws NTException{
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
