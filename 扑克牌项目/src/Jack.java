public class Jack {
    private String color;
    private Integer no;

    public static void main (String [] args){



    }

    public Jack(String color, Integer no) {
        this.color = color;
        this.no = no;
    }

    @Override
    public String toString() {
        return "Jack{" +
                "color='" + color + '\'' +
                ", no=" + no +
                '}';
    }

    public String getColor() {
        return color;
    }

    public Integer getNo() {
        return no;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setNo(Integer no) {
        this.no = no;
    }



}
