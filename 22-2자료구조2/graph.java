import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // vertex 개수
        int vCnt = Integer.parseInt(sc.next());
        // num of edge
        int eCnt = Integer.parseInt(sc.next());
        ArrayList<ArrayList<Integer>> adLsit = new ArrayList<>();
        //dummy data 1
        adLsit.add(new<Integer> ArrayList());
        for(int i=0; i<vCnt; i++){
            adLsit.add(new<Integer> ArrayList());
        }
        for(int i=0; i<eCnt; i++){
            int v1 = sc.nextInt();
            int v2 = sc.nextInt();
            adLsit.get(v1).add(v2);
        }
    
        for(int i=1; i<=vCnt; i++){
            Iterator<Integer> iter = adLsit.get(i).iterator();
            System.out.println("["+i+"]:");
            while(iter.hasNext()){
                System.out.println(iter.next()+" ");
            }
            System.out.println();
        }
    }



}