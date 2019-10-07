import java.util.Scanner;

public class DemoStr {
    public static void main(String[] args){

    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
   Demo jj = new Demo();
   jj.printNum(str);

    }
}





class Demo{

    public static void printNum(String str){
        int Anum = 0;
        int anum = 0;
        int num = 0;

        for(int i = 0;i< str.length();i++){
            //利用charAt进行字符串的遍历。
            char c = str.charAt(i);
            if(c >= 'A' && c <= 'Z'){
                Anum ++;

            }else if(c >= 'a' && c <= 'z'){
                anum ++;


            }else if(c >= '0' && c <= '9'){
                num ++;
            }



        }

        System.out.println("字符串中大写字母的个数是"+Anum);
        System.out.println("字符串中小写字母的个数是"+anum);
        System.out.println("字符串中数字的个数是"+num);
    }



}
