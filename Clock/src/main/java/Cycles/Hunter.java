package Cycles;
import java.lang.Math;
//генерация случайного кол-ва здоровья
//поиск самого живучего
public class Hunter {
    private int N;
    private int k;

    public void Hunt(int N, int k){
        System.out.println("\n" + "ХП:");
        int cnt = 0;
        int[] animals;
        animals = new int[N];
        for(int i = 0; i < N; i++){
            animals[i] = (int) (1 + Math.random() * 10);
            System.out.print(animals[i] + " ");
        }

        System.out.println("\n" + "Порядок:");

        while(cnt < N){
            int IndOfMax = 0;
            for(int i = 0; i < N; i++){
                if(animals[IndOfMax] < animals[i])
                    IndOfMax = i;
            }

            animals[IndOfMax] -= k;
            if(animals[IndOfMax] < 1){
                cnt++;
                System.out.print(IndOfMax + 1 + " ");
            }
        }
    }
}
