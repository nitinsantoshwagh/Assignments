package Assignment2;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;

class Student{
   int stdid;
   String stdname;
   int marks;
     Student(int stdid,String stdname,int marks)
   {
	this.stdid=stdid;
	this.stdname=stdname;
	this.marks=marks;
   }
 }
 public class AvgMarks
 {
	public static void main(String[] args) {
   List<Student> list=new ArrayList<Student>();
   list.add(new Student(1,"Nitin Wagh",60));
   list.add(new Student(2,"Ram Patil",70));
   list.add(new Student(3,"Mayur Mapari",80));
   list.add(new Student(4,"Sham Varma",85));
    
   OptionalDouble avgmarks=list.stream().mapToInt(sv->sv.marks).average();
   System.out.println(avgmarks);
	}

}
