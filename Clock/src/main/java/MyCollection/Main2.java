package MyCollection;

import java.util.ArrayList;
import java.util.Iterator;

public class Main2 {
    public static void main(String[] args) throws Exception {
        ArrayList<Integer> arr = new ArrayList<>(); //не указывается тип потому что вычисляется автоматически
        arr.add(10);
        arr.add(20);


        Iterator<Integer> itr = arr.iterator();
        while(itr.hasNext()){
            Integer next = itr.next();
            System.out.println(next);
        }


        System.out.println("#######");
        for (Integer next : arr){
            System.out.println(next);
        }



    }
}
