package MyCollection;

public class MyArrCollection implements MyCollection{
    int cnt = 0;
    int[] arr = new int[10];


    @Override
    public void Add(int a) throws Exception{
        if(cnt > 10){
            throw new Exception("out of range");
        }

        arr[cnt] = a;
        cnt++;
    }

    @Override
    public MyIterator iter() {
        return new ArrayIterator(arr, cnt);
    }
}
