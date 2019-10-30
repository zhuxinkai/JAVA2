package cn.set;

public class Emp {
    private Integer empNo;
    private String name;
    private Integer workyear;
    private char gender;



    public static void main (String [] args){



    }

    public Emp(Integer empNo, String name, Integer workyear, char gender) {
        this.empNo = empNo;
        this.name = name;
        this.workyear = workyear;
        this.gender = gender;
    }

    public Integer getEmpNo() {
        return empNo;
    }

    public String getName() {
        return name;
    }

    public Integer getWorkyear() {
        return workyear;
    }

    public char getGender() {
        return gender;
    }

    public void setEmpNo(Integer empNo) {
        this.empNo = empNo;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWorkyear(Integer workyear) {
        this.workyear = workyear;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "empNo=" + empNo +
                ", name='" + name + '\'' +
                ", workyear=" + workyear +
                ", gender=" + gender +
                '}';
    }


}
