import java.util.ArrayList;
public class ArralistDemo{
    public static void main(String[] args) {

        ArrayList <String > students = new ArrayList<>();
        students.add("Neha");
        students.add("priya");
        students.add("tanmay");
        students.add("janvi");
        students.add("janvi");
        students.add("janvi");
        students.add("janvi");

        System.out.println(students);

        System.out.println(students.get(1));
        students.set(2,"amit");
        System.out.println(students);
       students.remove(2);
       System.out.println(students);

       System.out.println("size of list is: " + students.size());

        System.out.println("is present " + students.contains("Neha"));

        for (String student : students){
            System.out.println(student);
        }
        for (int i = 0;i<students.size();i++){
            System.out.println(students.get(i));
       
        }
        
        System.out.println(students);
        System.out.println(students.isEmpty());
        System.out.println("hii..");
        students.remove("janvi");
        System.out.println(students);
    }
}