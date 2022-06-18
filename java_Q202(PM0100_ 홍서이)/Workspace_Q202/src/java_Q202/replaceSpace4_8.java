package java_Q202;

public class replaceSpace4_8 {
    static void replaceSpace4_8(char c[]) {
        for (int i = 0; i < c.length; i++)
            if (c[i] == " ")
                c[i] = "/";
    }

        static void printCharArray(char a[]){
            for(int i=0; i<a.length;i++)
                System.out.println(a[i]);
            System.out.println();
        }

        public static void main(String args[]){
            char c[] = {"t","h","i","s"," ","i","s"," ","a", " ", "p","e","n"};

            printCharArray(c);
            replaceSpace4_8(c);
            printCharArray(c);

        }
    }
}
