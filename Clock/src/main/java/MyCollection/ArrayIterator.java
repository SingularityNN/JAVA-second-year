package MyCollection;

public class ArrayIterator implements MyIterator{
    int[] a;
    int i = 0;
    int N;

    public ArrayIterator(int[] a, int n) {
        this.a = a;
        N = n;
    }

    @Override
    public boolean HasNext() {
        return i < N;
    }

    @Override
    public int Next() throws Exception{
        if(!HasNext()){
            throw new Exception("Out of range");
        }
        i++;
        return a[i - 1];
    }
}
