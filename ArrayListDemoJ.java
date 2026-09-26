import  java.util.ArrayList;

public class ArrayListDemoJ {
    public static void main(String[] args) {
        ArrayList <String> students = new ArrayList<>();
        //inserting the studntes

        students.add("janvi");
        students.add("neha");
        students.add("shreya");
        students.add("tanmay");
        students.add("rohit");

        System.out.println(students);

        System.out.println(students.get(2));
        students.set(2,"priya");
        System.out.println(students);
        students.remove(2);
        System.err.println(students);
       
        System.out.println("the size of array list is : "+students.size());

        System.out.println("is shreya there "+students.contains("janvi"));
        for(String student: students){
            System.out.println(student);
        }
        System.out.println("by using traditional for loop");

        for(int i = 0;i<students.size();i++){
            System.out.println(students.get(i));
        }


      System.out.println(students.isEmpty());
      students.clear();
      System.out.println(students.isEmpty());
    }
}
