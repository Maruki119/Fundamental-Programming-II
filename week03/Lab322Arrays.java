public class Lab322Arrays {
    public static void main(String[] args){
        int[] data = new int[] {30, 20, 15, 0, 9};
        int i;

        for(i = 0; i < 5; i++){
            System.out.println(data[i]);
        }
        System.out.println("Your data:");

        for(i = 0; i < 5; i++){
            System.out.printf("data[%d] = %d\n", i, data[i]);
        }
    }
}
