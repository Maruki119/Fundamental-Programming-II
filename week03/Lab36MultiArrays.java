public class Lab36MultiArrays {
    public static void main(String[] args){
        int[][] matrixA = new int[][] {
            {90, 5, 12, -3},
            {-8, 15, -7, 52},
            {0, 23, -8, 1}
        };

        System.out.println("Matrix A is");
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 4; j++){
                System.out.print(matrixA[i][j] + "\t");
            }
            System.out.println("");
        }
    }
}
