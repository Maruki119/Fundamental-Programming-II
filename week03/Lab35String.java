import java.util.Scanner;
public class Lab35String {
    public static void main(String[] args){
        int cntDigit = 0, cntUpper = 0, cntLower = 0, cntOther = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.nextLine();

        for(int i = 0; i < s.length(); i++){
            if((s.charAt(i) >= '0') && (s.charAt(i) <= '9')){
                cntDigit++;
            }
            else if((s.charAt(i) >= 'A') && (s.charAt(i) <= 'Z')){
                cntUpper++;
            }
            else if((s.charAt(i) >= 'a') && (s.charAt(i) <= 'z')){
                cntLower++;
            }
            else{
                cntOther++;
            }
        }
        System.out.printf("There are %d D\n", cntDigit);
        System.out.printf("There are %d U\n", cntUpper);
        System.out.printf("There are %d L\n", cntLower);
        System.out.printf("There are %d O\n", cntOther);
    }
}
