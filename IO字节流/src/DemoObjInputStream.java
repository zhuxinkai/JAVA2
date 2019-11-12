import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class DemoObjInputStream {
    public static void main (String [] args){
        writerStream();
        readerStream();


    }
    public static void writerStream(){
        ObjectOutputStream oos = null;
        ArrayList<Student> als = new ArrayList<Student>();


        try {
            oos = new ObjectOutputStream(new FileOutputStream("stream.txt"));
            Student std1 = new Student();
            std1.setName("朱鑫凯");
            std1.setAge(37);
            Student std2 = new Student();
            std2.setAge(26);
            std2.setName("朱勇涵");
            Student std3 = new Student();
            std3.setName("刘莎");
            std3.setAge(36);
            als.add(std1);
            als.add(std2);
            als.add(std3);

            oos.writeObject(als);






        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if(oos != null){
                try {
                    oos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }


    }






    public static void readerStream(){
        ObjectInputStream ooi = null;
        ArrayList<Student> als = new ArrayList<Student>();

        try {
            ooi = new ObjectInputStream(new FileInputStream("stream.txt"));
            try {
                als = (ArrayList<Student>)ooi.readObject();
                for(Student std: als){
                    System.out.println(std);
                }


            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if(ooi != null){
                try {
                    ooi.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }


    }



}
