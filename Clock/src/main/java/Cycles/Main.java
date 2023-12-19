package Cycles;

public class Main {
   static double an(int n){
        return 1 + Math.pow(((double) -3 /5), n);
    }
    public static void main(String[] args){
        double z = 0;
        for (int i = 1; i < 2; i++){
            z += an(i);
        }
        System.out.println(z + "\n");
        z = 0;

        for (int i = 1; i < 3; i++){
            z += an(i);
        }
        System.out.println(z+ "\n");
        z = 0;

        for (int i = 1; i < 4; i++){
            z += an(i);
        }
        System.out.println(z+ "\n");
        z = 0;





        /*Fib_nums F = new Fib_nums();
        F.Print(6);

        Hunter H = new Hunter();
        H.Hunt(3, 3);*/



    }
}
