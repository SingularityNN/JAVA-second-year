package MyCollection;
//позволяет обойти коллекцию
public interface MyIterator {
    boolean HasNext();
    int Next()throws Exception;
}
