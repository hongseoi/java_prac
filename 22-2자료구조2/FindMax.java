public class FindMax {
    public static void main(String[] args) {
            /*
    문제: 크기가 N인 배열 A내의 숫자들 중 최댓값을 찾아라
    슈도코드
    FindMax(A[1,2,3,...N])
        //배열 내 최댓값 찾기
        //입력: A
        //출력: A의 최댓값

        max = A[0]
        for (i=1, i<N, i++)
            if max < A[i]
                max = A[i]
        return max

    */
        int [] intArray = {1,2,3,4,5,66,77,88};
        int maximum;

        maximum = FindMax(intArray);
        System.out.print("최댓값:"+ maximum);

    }

    public static int FindMax(int [] A){
        int max = A[0];

        for(int i=0; i<A.length; i++){
            if (A[i]>max) max = A[i];
        }
        return max;
    }
}