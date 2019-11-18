import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
     fibonacci();
    }
    public static void fibonacci(){
       // Scanner tn = new Scanner(System.in);
       // System.out.print("请输入数列的长度个数");
       // long n = tn.nextInt();
        for(long i = 1L; i<100; i++){
            long sum = 0L;
            sum += fid(i);
            System.out.println(sum);




        }



    }


    public static long fid(long i){
        if (i == 1 || i == 2){
            return 1;
        }else { return fid(i-1) + fid(i-2);
        }
    }
}
