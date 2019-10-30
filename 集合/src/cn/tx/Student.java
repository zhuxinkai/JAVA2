package cn.tx;
    //对Student 类变成Comparable 接口的实现类时，需要加泛型，不然在实现compareTo方法时，如果
    //直接使用Student 对象的话。将无法识别
public class Student implements Comparable<Student> {
    //私有化的属性，应该定影在主方法的外面。
    //其余的get ,set , toString ,构造器的Generate都可以生成。
    private  Integer idnumber;
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

    public Student(Integer idnumber, String name, Integer age, char gender, float lfq) {
        this.idnumber = idnumber;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.lfq = lfq;
    }



    @Override
    public int compareTo(Student o) {
        int val = this.idnumber - o.idnumber;
        if(val == 0){
            val = this.name.compareTo(o.name);
            if(val == 0){
                val = this.age - o.age;

            }


        }
     return val;}

    @Override
    public int hashCode() {
        return 1;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Student){
            if(this.age == ((Student) obj).age &&
            this.name != null && ((Student) obj).name != null &&
            this.name.equals(((Student) obj).name)&&
            this.gender == ((Student) obj).gender &&
                    this.lfq == ((Student) obj).lfq && this.idnumber == ((Student) obj).idnumber) {
            return true;
            }else{
    return false;
            }




        }else{return false;
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "idnumber=" + idnumber +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", lfq=" + lfq +
                '}';
    }
}

class ChildStudent extends Student{


    public ChildStudent(Integer idnumber, String name, Integer age, char gender, float lfq) {
        super(idnumber, name, age, gender, lfq);
    }
}
