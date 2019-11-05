import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderDemo3 {
    public static void main (String [] args) throws IOException {
        FileWriter fw = new FileWriter("read.txt");
        fw.write("dafsdkashdSDASDFASDFASFASDFASFASFWERQWETGGSBCZVZ/VZ/XCV?Z,.XCV/,ZX/V,fkashdfkashff");
        fw.close();


        FileReader fr = new FileReader("read.txt");
        char [] chs = new char[24];
        int len = -1;
        while((len =fr.read(chs)) != -1){
            System.out.println(new String(chs,0,len));




        }


    }
}
