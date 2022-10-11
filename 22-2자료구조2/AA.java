import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    
    //변수 선언
	static StringBuilder sb = new StringBuilder();
	static boolean[] check;
	static int[][] arr;
	
	static int node, line, start;
	
	static Queue<Integer> q = new LinkedList<>();

	public static void main(String[] args) throws IOException {
		
        //입력받기
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
        node = Integer.parseInt(st.nextToken());
		line = Integer.parseInt(st.nextToken());
		start= Integer.parseInt(st.nextToken()); 
		
		arr = new int[node+1][node+1]; //노드간 간선 표현
		check = new boolean[node+1]; //노드 방문여부 표현
		
		for(int i = 0 ; i < line ; i ++) {
			StringTokenizer str = new StringTokenizer(br.readLine());
			
			int a = Integer.parseInt(str.nextToken());
			int b = Integer.parseInt(str.nextToken());
			
			arr[a][b] = arr[b][a] =  1;	
		}
			dfs(start);
			sb.append("\n");
			check = new boolean[node+1];
			
			bfs(start);
			
			System.out.println(sb); //데이터 출력
		
		}

    //가. DFS 구현
	public static void dfs(int start) {
		
		check[start] = true; //노드 방문 표시
		sb.append(start + " "); //StringBuilder에 데이터 추가
		
        // 현재 노드에 인접한 방문하지 않은 모든 노드들에 재귀를 통해 DFS 수행
		for(int i = 0 ; i <= node ; i++) {
			if(arr[start][i] == 1 && !check[i])
				dfs(i);
		}
		
	}
	
    //나. BFS 구현
	public static void bfs(int start) {
		q.add(start); //큐에 탐색 시작 노드 넣게
		check[start] = true; // 노드 방문 표시
		
		while(!q.isEmpty()) { //큐가 빌때까지 수행
			
			start = q.poll(); //큐 안의 데이터 빼냄
			sb.append(start + " "); //빼낸 데이터 StringBuilder에 추가
			
			for(int i = 1 ; i <= node ; i++) { //모든 노드에 대해 수행
				if(arr[start][i] == 1 && !check[i]) { // 현재 인덱스의 노드가 방문안함으로 표시되어 있는 경우
					q.add(i); // 큐에 해당 노드 추가
					check[i] = true; // 노드 방문 표시
				}
			}
		}
		
		
	}

}