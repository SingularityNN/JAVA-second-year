package MyCollection;
import java.util.Collection;

public class Main {
    public static void main(String[] args) throws Exception {
        MyArrCollection c = new MyArrCollection();

        c.Add(10);
        c.Add(20);

        MyIterator itr = c.iter();
        while(itr.HasNext()){
            int next = itr.Next();
            System.out.println(next + " ");
        }


        itr = c.iter();
        int sum = 0;
        while(itr.HasNext()){
            int next = itr.Next();
            sum += next;
        }
        System.out.println("Sum " + sum);

    }
}
