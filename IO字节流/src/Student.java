public class Student implements Comparable<Student> {
    String name;
    Integer age;



    public static void main (String [] args){

    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public int compareTo(Student o) {
        int num = -1;
        num = this.age - o.age;
        if(num == 0){
            num = this.name.compareTo(o.name);
        }
        return num;
    }
}
