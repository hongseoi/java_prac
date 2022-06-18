package java_Q202;

public class ArrayPassing {
    static void increase(int [] array){
        System.out.println(array);
        for(int i=0; i<array.length;i++){
            array[i]++;
        }
    }
    public static void main(String[] args) {
        int a[] = {1,2,3,4,5};
        increase(a);

        for(int i=0; i<a.length; i++){
            System.out.println(a[i]+ " ");
        }

    }

}
