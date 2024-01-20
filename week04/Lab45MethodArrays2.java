public class Lab45MethodArrays2{
    public static void showMatrix(int[][] Matrix){
        for(int i = 0; i < 2; i++){
            for(int j = 0; j < 3; j++){
                System.out.printf("%5d", Matrix[i][j]);
            }
            System.out.println("");
        }
    }

    public static void showAddMatrix(int[][] A, int[][] B){
        int[][] AB = new int[2][3];
        for(int i = 0; i < 2; i++){
            for(int j = 0; j < 3; j++){
                AB[i][j] = A[i][j] + B[i][j];
                System.out.printf("%5d", AB[i][j]);
            }
            System.out.println("");
        }
    }

    public static void main(String[] args){
        int[][] A = {
            {-3,5,6},
            {5,0,-2}
        };
        int[][] B = {
            {9,0,-5},
            {-3,-2,-1}
        };
        System.out.println("Matrix A: ");
        showMatrix(A);
        System.out.println("Matrix B: ");
        showMatrix(B);
        System.out.println("Matrix A+B: ");
        showAddMatrix(A, B);
    }
}