package Clock;
import java.util.*;

public class Shop implements Iterable<Clock_Interface>{
    private List<Clock_Interface> Stock = new ArrayList<>();
    private Clock_Factory F;
    private int N;

    @Override
    public Iterator<Clock_Interface> iterator(){
        return Stock.iterator();
    }



    public void Print_Stock(){

    }

    public void Print_Most_Valuable(){
        int max = 0;
        int ind = 0;
        for(int i = 0; i < N - 1; i++){
            if(Stock[i].Get_price() > max){
                max = Stock[i].Get_price();
                ind = i;
            }
        }
        Stock[ind].toS;
    }

    public void Set_Global_Time(int H_h, int M_h, int S_h){
        for(int i = 0; i < N - 1; i++){
            try {
                Stock[i].Set_time(H_h, M_h, S_h);
            }
            catch (NTException ex){
                System.out.println(ex);
            }

        }
    }
}
