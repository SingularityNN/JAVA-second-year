package Clock;

public class Shop {
    private Clock_Interface[] Stock;
    private Clock_Factory F;
    private int N;

    public Shop(){
        N = 1;
        Stock = new Clock_Interface[N];
        F = new Clock_2h_Factory();
    }
    public void Add(int num_of_hands, int H_h, int M_h, int S_h, String name, int value){
        if(num_of_hands == 2){
            F = new Clock_2h_Factory();
        }
        else if(num_of_hands == 3){
            F = new Clock_3h_Factory();
        }
        else{
            throw new RuntimeException("Incorrect number of hands");
        }


        Clock_Interface[] tmp = new Clock_Interface[N + 1];
        System.arraycopy(Stock, 0, tmp, 0, N);

        tmp[N - 1] = F.Create_Clock(H_h, M_h, S_h, name, value);
        Stock = tmp;

        N++;
    }

    public void Print_Stock(){
        for(int i = 0; i < N - 1; i++){
            Stock[i].Print_info();
        }
    }

    public void Print_Most_Valuable(){
        int max = 0;
        int ind = 0;
        for(int i = 0; i < N - 1; i++){
            if(Stock[i].Get_value() > max){
                max = Stock[i].Get_value();
                ind = i;
            }
        }
        Stock[ind].Print_info();
    }

    public void Set_Global_Time(int H_h, int M_h, int S_h){
        for(int i = 0; i < N - 1; i++){
            Stock[i].Set_time(H_h, M_h, S_h);
        }
    }
}
