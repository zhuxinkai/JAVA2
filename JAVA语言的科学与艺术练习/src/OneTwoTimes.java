import java.util.Scanner;

public class OneTwoTimes {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("请输入一元二次方程中的a值");
        int a = sc.nextInt();

        System.out.println("请输入一元二次方程中的b值");
        int b = sc.nextInt();

        System.out.println("请输入一元二次方程中的c值");
        int c = sc.nextInt();

        System.out.println("Enter coefficients for the quadratic equation:");
        System.out.println("a: "+ a);
        System.out.println("b: "+b);
        System.out.println("c: "+ c);

        double solution1 = (-b + Math.sqrt(b*b-4*a*c))/(2*a);
        double solution2 = (-b - Math.sqrt(b*b-4*a*c))/(2*a);
        System.out.println("The first solution is "+ solution1);
        System.out.println("The sencond solution is "+ solution2);

    }
}
