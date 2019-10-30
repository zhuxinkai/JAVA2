public class Person {
    private Integer idno;
    private String name;
    private Integer age;
    private float high;

    public static void main (String [] args){



    }

    public Person(Integer idno, String name, Integer age, float high) {
        this.idno = idno;
        this.name = name;
        this.age = age;
        this.high = high;
    }

    @Override
    public String toString() {
        return "Person{" +
                "idno=" + idno +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", high=" + high +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        Person df = (Person)obj;
        if(this.age == df.age && this.high == df.high &&
        this.idno == df.idno && this.name != null &&
        df.name != null && this.name.equals(df.name)){
            return true;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return 1;
    }

    public Integer getIdno() {
        return idno;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public float getHigh() {
        return high;
    }

    public void setIdno(Integer idno) {
        this.idno = idno;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setHigh(float high) {
        this.high = high;
    }
}
