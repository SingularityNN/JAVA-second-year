package MyCollection;
//основная задача - говорить о том, как нам работать с данными
public interface MyCollection {
    void Add(int a)throws Exception;
    MyIterator iter();
}
