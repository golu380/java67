import  java.util.Collections;
import java.util.ArrayList;

class Student implements  Comparable <Student>{
    int rollno;
    int marks;
    String name;

    Student(int rollno,int marks,String name){
        this.rollno = rollno;
        this.marks= marks;
        this.name = name;
    }

    public int compareTo(Student other){
        return  Integer.compare(this.rollno, other.rollno);
    }

    public  String toString(){
        return  name + " " + rollno + " " + marks;
    }
}

public class ComparebleDemo {
    public static void main(String[] args) {

        ArrayList<Student> st = new ArrayList<>();
        st.add(new Student(77,90, "piyush"));
        st.add(new Student(1677,80, "Deepaak"));
        st.add(new Student(167,30, "jas"));
        st.add(new Student(177,60, "sumit"));
        st.add(new Student(167,40, "neha"));

        Collections.sort(st);

        for(Student stu: st){
            System.out.println(stu);
        }

        
    }
}
