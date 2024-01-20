/*
 * Wrtiien by Nititorn Kijprasopchok
 * ID: 6530300295
 */

import java.util.ArrayList;

public class RemoveThirds {
    public static void main(String[] args){
        ArrayList<Integer> lst = new ArrayList<Integer>();
        int i = 0;
        lst.add(1);
        lst.add(2);
        lst.add(3);
        lst.add(2);
        lst.add(5);
        lst.add(3);
        lst.add(1);
        lst.add(3);
        lst.add(9);
        while(i < lst.size()){
            if(lst.get(i) % 3 == 0){
                lst.remove(i);
            }
            else{
                i++;
            }
        }

        System.out.println(lst);
    }
}
