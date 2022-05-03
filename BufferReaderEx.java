import java.io.*;

public class BufferReaderEx {
    public static void main(String[] args) {
        try{    //예외처리

            //콘솔에서 입력받을 경우
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            //파일에서 입력받을 경우
            FileReader fr = new FileReader("BufferReaderEx.java");
            BufferedReader br_f = new BufferedReader(fr);

            //String 리턴이므로 int로 형변환
            int num = Integer.parseInt(br.readLine());
            br.close();

            //파일 한줄한줄 읽어서 출력
            String line = "";
            for(int i=1; (line = br_f.readLine()) != null; i++){
                System.out.println(line);
            }
        }catch (IOException e){ // 스트림, 파일 및 디렉터리를 사용하여 정보에 액세스하는 동안 throw된 예외에 대한 기본 클래스
            e.printStackTrace();    //에러의 발생근원을 찾아 단계별로 에러출력
            System.out.println(e.getMessage()); //에러의 원인을 간단하게 출력
        }

    }
}
