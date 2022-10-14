import java.util.LinkedList;
import java.util.Iterator;
import java.util.Stack;
import java.util.NoSuchElementException;

class Queue<T>{ //Queue 구현

}

class Graph{ //그래프 구현
    class Node{ //그래프 노드 구현
        int data;
        LinkedList<Node> adjacent;//인접한 노드들 간의 관계
        boolean marked; //노드 방문여부 표시 마커

        Node(int data){
            this.data = data;
            this.marked = false; //마커 초기화
            adjacent = new LinkedList<Node>();            
        }
    }

    //그래프 구현
    Node[] nodes; //그래프 내 노드 저장할 배열
    Graph(int size){
        nodes = new Node[size];
        for (int i=0, i<size; i++){
            nodes[i] = new Node(i);
        }
    }
    void addEdge(int i1, int i2){ // 두 노드의 관계 저장하는 함수 addEdge()
        Node n1 = nodes[i1];
        Node n2 = nodes[i2];
        //두 노드 없을 경우 관계 추가
        if (!n1.adjacent.contains(n2)){
            n1.adjacent.add(n2);
        }
        if(!n2.adjacent.contains(n1)){
            n2.adjacent.add(n1)
        }

    }
}

public class Main{
    public static void main(String[] args){

    }
}
