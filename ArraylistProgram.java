import java.util.ArrayList;
import java.util.Scanner;

public class ArraylistProgram {

    public static void main(String[] args) {

        ArrayList<String> arr = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n===== Student Management =====");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Search Student");
            System.out.println("4. Delete Student");
            System.out.println("5. Exit");

            int choice = sc.nextInt();
            sc.nextLine();
            System.err.println("choic is " + choice);

            switch (choice) {
                case 1:
                    System.out.println("enter value you want to insert");
                    String name = sc.nextLine();
                    System.out.println("name is " + name);
                    arr.add(name);

                    break;
                case 2:
                    System.out.println("list of students are");
                    System.out.println(arr);
                    break;
                case 3:
                    System.out.println("enter keys which you want to search");
                    String key = sc.nextLine();
                    System.out.println(key);
                  
                    if(arr.contains(key)){
                        System.out.println(key+ " found");
                    }else{
                        System.out.println("not found");
                    }
                    
                    break;
                case 4:
                    String todel = sc.nextLine();
                    arr.remove(todel);
                    break;
                case 5:
                    return;
                    
                    

                default:
                    break;
            }

        }
    }

}
