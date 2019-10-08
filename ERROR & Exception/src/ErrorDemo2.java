public class ErrorDemo2 {
    int i = 0;
    int b =12;
    int a = 9;
    int tt = 123;

    public static void main (String[] args){


      System.out.println(devid(12,3));
     System.out.println("发生异常后面的代码执行情况");
     System.out.println("-----------------------------");



    }




    public static  int devid(int a,int i){
        int x = 0;
        try {
            x = a/i;
          System.out.println("如果发生异常，那么在try中异常语句后面的代买将不会执行了。");
        }catch (ArithmeticException e){
            System.out.println("the exception is 放生了，我要处理了");


        }
        System.out.println("发生异常，因为使用了try那么下面的代码还时会执行下去，如果没有try那么程序就会终止");
        return x;
    }

}
