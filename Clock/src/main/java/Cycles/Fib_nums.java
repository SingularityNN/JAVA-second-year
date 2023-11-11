package Cycles;


public class Fib_nums {
    private int N;
    public void Print(int N){
        int a = 1;
        int b = 1;
        int tmp = 0;
        if(N == 1)
            System.out.print("1");
        if(N == 2)
            System.out.print("1 1");
        else {
            System.out.print("1 1");
            for(int i = 1; i < N; i++){
                tmp = a + b;
                System.out.print(" " + tmp);
                a = b;
                b = tmp;

            }
        }
    }
}
