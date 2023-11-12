package Clock;

public class NTException extends Exception{
    @Override
    public String toString() {
        return "Negative time parameter";
    }
}
