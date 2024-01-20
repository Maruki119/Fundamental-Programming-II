public class Lab32Arrays {
    public static void main(String[] args){
        float[] score = new float[] {80.2f, 67.5f, 70.0f, 68.5f, 82.7f, 55.5f, 78.8f};
        float avg, sum = 0;

        for(int i = 0; i < 7; i++){
            sum += score[i];
            System.out.printf("Score[%d] = %.2f : Sum = %.2f\n", i, score[i], sum);
        }
        avg = sum / 7;
        System.out.println("Average : " + Math.round(avg * 100.0) / 100.0);
    }
}
