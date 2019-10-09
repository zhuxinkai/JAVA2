package cn.tx;

public class DemoString6 {
    public static void main(String [] args){

       String str1 = "120446461316:kexin:20:1|430181982510164:liusha:35:2|43016464674936464:zhuyonghan:9:1";
       Person.getResult(str1);
    }




}


class Person{

    String id;
    String gender;
    String  age;
    String name;

    @Override
    public String toString() {
        return "Person{" +
                "id='" + id + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    public static void getResult(String str){
        String [] ps = str.split("\\|");
        for (int i = 0; i < ps.length;i++){
            Person result1 =  new Person();
            String [] as = ps[i].split(":");

            result1.id = as[0];
            result1.name = as[1];
            result1.age = as[2];
            result1.gender = as[3];

            System.out.println(result1.id);
            System.out.println(result1.name);
            System.out.println(result1.age);
            System.out.println(result1.gender);
        }


    }


}
