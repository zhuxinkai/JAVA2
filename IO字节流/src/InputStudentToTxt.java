import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.TreeSet;

public class InputStudentToTxt {
    public static void main (String [] args) throws IOException {
        int times;
        //建立一个TreeSet 集合类。 TreeSet 可以对集合类的对象进行compare方法的排序。在建立集合时，指定泛型为 Student类.
        TreeSet<Student> studenlist = new TreeSet<Student>();
        // Scanner 对象化的过程中，输入System.in;
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您需要输入几个学生信息");
        //如果是输入整数类型，则使用方法 nextInt();
        times = sc.nextInt();
        for (int i = 0; i<times; i++){
            //循环输入
            Scanner sc1 = new Scanner(System.in);
            Student xuesheng = new Student();
            System.out.println("请输入学生年龄");
            xuesheng.setAge(sc1.nextInt()) ;
            System.out.println("请输入学生姓名");
            xuesheng.setName(sc1.next());
            //xuesheng.setName(sc1.nextLine()); 这个nextLine 为啥无法达成。
            studenlist.add(xuesheng);
        }
        //建立对象fileWriter
        FileWriter bw = new FileWriter("student.txt");
        //建立buffer写对象。
        BufferedWriter bwb = new BufferedWriter(bw);
        for (Student s : studenlist){
            //调用bufferedwriter 写方法，字符串。
            bwb.write(s.getAge().toString()+"------------"+s.getName()+"\r\n");


        }
        bwb.close();



    }
}
