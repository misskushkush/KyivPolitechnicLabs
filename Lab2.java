public class Lab2 {

    public static void main(String[] args) {
        //№ Залікової книги 1508 => c5=3 c7=3 c11=1
        int A[][] = {{1, 3, 7},
                {6, 5, 8},
                {4, 8, 9},
                {2, 1, 3},
                {7, 4, 8}};
        int B[][] = {{8, 5, 4},
                {2, 7, 3},
                {4, 2, 1},
                {7, 9, 6},
                {4, 1, 6}};
        long S=0;
        boolean flag=true;
        if (A.length == B.length) {
            int maxl=0;
            for (int i=0; i<A.length; i++) {
                if (A[i].length!=B[i].length) flag=false;
                if (A[i].length>maxl) maxl=A[i].length;
            }
            if (flag==true) {
                int C[][] = new int [A.length][maxl];
                for (int i=0; i<A.length; i++) {
                    for (int j=0; j<A[i].length; j++) {
                        C[i][j] = A[i][j] ^ B[i][j];
                    }
                }
                System.out.println("Матриця С:");
                for (int i=0; i<C.length; i++) {
                    for (int j=0; j<C[i].length; j++) {
                        System.out.print(C[i][j] +" ");
                    }
                    System.out.println("");
                }
                for (int i=0; i<C.length; i++) {
                    int min = C[i][0];
                    for (int j=0; j<C[i].length; j++) {
                        if (C[i][j]<min) min = C[i][j];
                    }
                    S+=min;
                }
                System.out.println("Сума найменших елементів у кожному рядку дорівнює: "+S);
            }
            else if (flag==false) System.out.println("Невірні вхідні дані!");
        }
        else System.out.println("Матриці різного розміру!");
    }
}