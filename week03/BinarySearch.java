/*
 * Written by Nititorn Kijprasopchok
 * ID: 6530300295
 */
public class BinarySearch {
    public static void main(String[] args){
        int[] lst = new int[] {1, 2, 4, 5, 7, 8, 11, 13};

        System.out.println(binarySearch(lst, 5));
        System.out.println(binarySearch(lst, 13));
        System.out.println(binarySearch(lst, 10));
    }
    static int binarySearch(int[] lst, int v){
        int i = 0;
        int j = lst.length;
        while(i < j){
            int mid = (i+j) /2;
            if(v < lst[mid]){
                j = mid;
            }
            else if(v > lst[mid]){
                i = mid + 1;
            }
            else{
                return mid;
            }
        }

        return -1; //-1 value = none
    }
}
