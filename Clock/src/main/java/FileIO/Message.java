package FileIO;

import java.io.Serializable;
import java.util.ArrayList;

public class Message implements Serializable { //Сериализация - алгоритм перевода данных в набор байтов
    int id = 0;
    String s;
    ArrayList<Integer> a = new ArrayList<>();
    transient String password = "123";

    public Message(int id, String s, String password){
        this.id = id;
        this.s = s;
        this.password = password;
        a.add(id+1);
        a.add(id+2);
    }

    @Override
    public String toString(){
        String res = "";
        res += "id " + id + "\n";
        res += "password " + password + "\n";
        res += "s " + s + "\n [";
        for(Integer integer : a){
            res += integer + " ";
        }
        res += "]\n";
        return res;
    }
}
