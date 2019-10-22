package cn.tx;

public class Student {
    //私有化的属性，应该定影在主方法的外面。
    //其余的get ,set , toString ,构造器的Generate都可以生成。
    private String name;
    private Integer age;
    private char gender;
    private float lfq;
    public static void main (String [] args){



}

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public char getGender() {
        return gender;
    }

    public float getLfq() {
        return lfq;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public void setLfq(float lfq) {
        this.lfq = lfq;
    }



    public Student(String name, Integer age, char gender, float lfq) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.lfq = lfq;

    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", lfq=" + lfq +
                '}';
    }
}

class ChildStudent extends Student{


    public ChildStudent(String name, Integer age, char gender, float lfq) {
        super(name, age, gender, lfq);
    }
}
