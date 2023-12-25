package FileIO;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main
{
    static public void saveArray(ArrayList<Integer> a)
    {
        try{
            FileOutputStream fos = new FileOutputStream("array.txt");
            DataOutputStream dos = new DataOutputStream(fos);
            for(int i = 0; i < a.size(); i++){dos.writeUTF(a.get(i) + "\n");}
        }
        catch (FileNotFoundException ex) {
            System.out.println("Ошибка записи тип 1");
        }
        catch (IOException ex){
            System.out.println("Ошибка записи тип 2");
        }
    }

    static public ArrayList<Integer> loadArray()
    {
        ArrayList<Integer> res = new ArrayList<>();
        try{
            FileInputStream fis = new FileInputStream("array.txt");
            DataInputStream dis = new DataInputStream(fis);
            String s;
            while(dis.available() > 0){
                int i = Integer.parseInt(dis.readUTF().replace("\n", ""));
                res.add(i);
            }
        }
        catch (FileNotFoundException ex){
            System.out.println("Ошибка чтения тип 1");
        }
        catch (IOException ex){
            System.out.println("Ошибка чтения тип 2");
        }
        return res;
    }

    //Можно использовать другой декоратор - сканер, чтобы не парсить int
    static public ArrayList<Integer> loadArrayScanner(){
        ArrayList<Integer> res = new ArrayList<>();
        try{
            Scanner scanner = new Scanner(new FileInputStream("array.txt"));
            while (scanner.hasNext()){
                res.add(scanner.nextInt());
            }
        }
        catch (FileNotFoundException ex){
            System.out.println("Ошибка чтения тип 1");
        }
        return res;
    }



    public static void main(String[] args){
        Message m = new Message(10, "Hello", "321");
        System.out.println(m);

        //Сохраняем объект в бинарном виде в файл
        try{
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("message.bin")); //ObjectOutputStream может использовать алгоритм сериализации
            oos.writeObject(m);
        }
        catch (IOException ex){
            System.out.println("Ошибка записи тип 1");
        }

        //Восстанавливаем объект из файла
        try{
            Message rm;
            ObjectInputStream oos = new ObjectInputStream(new FileInputStream("message.bin"));
            rm = (Message) oos.readObject();
            System.out.println(rm);
        }
        catch (IOException ex){
            System.out.println("Ошибка чтения тип 1");
        }
        catch (ClassNotFoundException ex){
            System.out.println("Ошибка чтения тип 2");
        }
    }
}
