public class Lab63StudentTest {
    public static void main(String[] args){
        Student[] slist = {new UnderGraduate(50), new Graduate(50)};
        for(Student std : slist){
            System.out.println(std.calculateGrade());
        }
    }
}
