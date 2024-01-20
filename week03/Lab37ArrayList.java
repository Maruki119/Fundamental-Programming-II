import java.util.ArrayList;
public class Lab37ArrayList {
    public static void main(String[] args){
        ArrayList<String> arrayList = new ArrayList<String>();

        arrayList.add("Paul");
        arrayList.add("Pete");
        arrayList.add("John");
        arrayList.add("George");
        System.out.println(arrayList);

        int idx = arrayList.indexOf("Pete");
        arrayList.remove(idx);
        System.out.println(arrayList);

        arrayList.add(1, "Ringo");
        int idx2 = arrayList.indexOf("Ringo");
        System.out.printf("At index %d : %s\n", idx2, arrayList.get(idx2));
        System.out.println(arrayList);

        int idx3 = arrayList.indexOf("John");
        System.out.printf("Edit name %s -> ", arrayList.get(idx3));
        arrayList.set(idx3, "Johny");

        System.out.printf("%s\n", arrayList.get(idx3));
        System.out.println("\nSize of the band: " + arrayList.size());

        for(int i = 0; i < arrayList.size(); i++){
            System.out.println(arrayList.get(i));
        }
    }
}
