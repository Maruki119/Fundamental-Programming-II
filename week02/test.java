/*import java.util.Arrays;
public class test {
    public static void main(String[] args) {
        int[] scores = {13, 22, 27, 18, 21, 26, 11, 8, 29};
        for(int i : scores){
            System.out.println(i + ", ");
        }
        Arrays.sort(scores);
        int idx = Arrays.binarySearch(scores, 26);
        System.out.println("index : " + idx);

    }
}
*/

public class test{
    public static void main(String[] args) {
        String str1 = "Programming Fundament12103603112";
        String str2;
        str2 = str1.substring(12, 24);
        System.out.println(str1);
        System.out.println(str2);
    }
}