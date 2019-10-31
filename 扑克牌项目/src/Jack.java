public class Jack {
    private String color;
    private String no;

    public static void main (String [] args){



    }

    public Jack(String color, String no) {
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

    public String getNo() {
        return no;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setNo(String no) {
        this.no = no;
    }



}
