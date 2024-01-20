package first;

public class Lab103Throw {
    public static void main(String[] args) {
        int ans = MathDevider3.devider(10, 0);
        System.out.println(ans);
    }
}

class MathDevider3{
    public static int devider(int num1, int num2){
        int result = 0;
        try{
            result = (int)(num1/checkZero(num2));
        }catch(Exception e){
            System.err.println(e);
        }
        
        return result;
    }

    public static int checkZero(int num2) throws Exception{
        if(num2 == 0) throw new Exception("Zero Zero");
        else
            return num2;
    }
}