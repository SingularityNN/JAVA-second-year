package Clock;
import java.util.*;

public class Shop implements Iterable<Clock_Interface> {
    private final List<Clock_Interface> Stock;

    @Override
    public Iterator<Clock_Interface> iterator(){
        return Stock.iterator();
    }



    public Shop(){
        Stock = new ArrayList<>();
    }

    public void addClock(Clock_Interface cl)throws NTException{
        Stock.add(cl);
    }

    public void printStock(){
        Iterator<Clock_Interface> itr = iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }

    public Clock_Interface getMostValuable(){
        Clock_Interface res = null;

        ArrayList<Integer> values = new ArrayList<>();
        Iterator<Clock_Interface> itr = iterator();

        while (itr.hasNext()){
            int next = itr.next().getPrice();
            values.add(next);
        }

        Collections.sort(values);
        Iterator<Clock_Interface> itr2 = iterator();

        while (itr2.hasNext()){
            Clock_Interface next = itr2.next();
            if(next.getPrice() == values.get(values.size()-1)){
                res = next;
                break;
            }
        }
        return res;
    }

    public void setGlobalTime(int H_h, int M_h, int S_h) throws NTException {
        Iterator<Clock_Interface> itr = iterator();
        while(itr.hasNext()){
            Clock_Interface next = itr.next();
            next.setTime(Enum.HOURS, H_h);
            next.setTime(Enum.MINUTES, M_h);
            next.setTime(Enum.SECONDS, S_h);
        }
    }

    public void printSortedNames(){
        ArrayList<String> str = new ArrayList<>();
        Iterator<Clock_Interface> itr2 = Stock.iterator();

        while(itr2.hasNext()){
            String next = itr2.next().getName();
            if(!str.contains(next)){
                str.add(next);
            }
        }

        Collections.sort(str);

        Iterator<String> itr1 = str.iterator();
        while (itr1.hasNext())
            System.out.println(itr1.next());
    }

    public String GetMostFrequentName(){
        Set<String> uniqueNames = new HashSet<>();
        ArrayList<String> names = new ArrayList<>();
        Iterator<Clock_Interface> itr2 = Stock.iterator();

        while(itr2.hasNext()){
            names.add(itr2.next().getName());
        }

        uniqueNames.addAll(names);

        Iterator<String> itr1 = uniqueNames.iterator();
        int max = 0;
        String res = "";

        while (itr1.hasNext()){
            String next = itr1.next();
            if(Collections.frequency(names, next) > max){
                max = Collections.frequency(names, next);
                res = next;
            }

        }
        return res;
    }



}

    /*int max = 0;
    Clock_Interface res = null;

    Iterator<Clock_Interface> itr = iterator();
        while(itr.hasNext()){
                Clock_Interface next = itr.next();
                if(next.getPrice() > max){
                max = next.getPrice();
                res = next;
                }
                }
                assert res != null;
                return res;*/