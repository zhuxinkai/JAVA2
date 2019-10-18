public class DemoAuto {
    public static void main(String [] args){
//包装类的自动

        Integer I1 = 1;
        System.out.println(I1);
        if(I1.getClass().equals(Integer.class)){
            System.out.println("I1是一个整数包装类");

        }

        int I2 = I1;
        System.out.print(I2);







    }
}
