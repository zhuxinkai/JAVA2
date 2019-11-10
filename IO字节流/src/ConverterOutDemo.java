import java.io.*;

public class ConverterOutDemo {

    public static void main (String [] args) throws IOException {
        BufferedReader br =  new BufferedReader(new FileReader("b.txt"));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String line;
        while((line = br.readLine()) != null){
            bw.write(line);
            bw.newLine();
            bw.flush();
        }


    }
}
