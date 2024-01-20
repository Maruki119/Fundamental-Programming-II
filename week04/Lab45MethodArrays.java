public class Lab45MethodArrays{
    public static void showMatrix(int[][] A){
        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 3; j++){
                System.out.printf("%5d", A[i][j]);
            }
            System.out.println("");
        }
    }

    public static void main(String[] args){
        int[][] A = {
            {5,3,8},
            {2,6,10},
            {1,8,25},
            {12,3,30}
        };
        System.out.println("Matrix A: ");
        showMatrix(A);
    }
}