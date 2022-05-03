import java.io.*;

public class BufferedWriterEx {
    public static void main(String[] args) throws IOException{
        BufferedWriter bw = new BufferedWriter(new FileWriter("bufferedWriter.txt"));
        bw.write("hello\n");
        bw.newLine();
        bw.write("bufferedWriter");
        bw.flush(); //남아있는 데이터 모두 출력
        bw.close();
    }
}
