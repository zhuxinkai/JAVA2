package cn.tx;
import javafx.scene.chart.ScatterChart;

import java.util.Scanner;
//关于空指针和输入的字符进行判断。需要预先进行判断。暂时未进行解决。



public class DemoString6 {
    public static void main(String[] args) {

        String str1 = Person.firstUpper();

        //String str1 = "120446461316:kexin:20:1|430181982510164:liusha:35:2|43016464674936464:zhuyonghan:9:1";
        Person person = new Person();
        Person psarray[] = person.getResult(str1);

        Person.printArray(psarray);
         /*
        for (int i = 0; i < psarray.length; i++) {
            System.out.println(psarray[i].id);
            System.out.println(psarray[i].name);
            System.out.println(psarray[i].age);
            System.out.println(psarray[i].gender);

        }
          */

    }
}


class Person{

    private String id;
    private String gender;
    private String  age;
    private String name;
    public void setId(String id){
        this.id = id;

    }
    public  void setGender(String gender){
        this.gender = gender;

    }
    public void setAge(String age){
        this.age = age;
    }
    public void setName(String name){

        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id='" + id + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    public Person [] getResult(String str){
       // Person psarray [] = null ;
        String [] ps = str.split("\\|");
        Person psarray [] = new Person[ps.length];
        for (int i = 0; i < ps.length;i++){
            Person result1 =  new Person();
            String [] as = ps[i].split(":");

           result1.setId(as[0]);
           result1.setName(as[1]);
           result1.setAge(as[2]);
           result1.setGender(as[3]);


            psarray[i] = result1;

        }

    return psarray;
    }

    public static void printArray(Person psarray []){
        for (int i =0 ; i< psarray.length;i++){
             System.out.println(psarray[i]);
            //System.out.println(psarray[i].id);
            //System.out.println(psarray[i].name);
            //System.out.println(psarray[i].age);
            //System.out.println(psarray[i].gender);



        }


    }
/*
    public static void callMethod() {

        try {
            firstUpper();

        } catch (Exception e) {
            System.out.println("请输入字符");
            callMethod();


        }
    }

 */
    public static String firstUpper(){
        Scanner str = new Scanner(System.in);
        String str1 = str.nextLine();


        return str1;

    }




    }
