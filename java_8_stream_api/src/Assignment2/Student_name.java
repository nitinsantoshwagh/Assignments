package Assignment2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Student_name {

	public static void main(String[] args) {
     ArrayList <String> Name=new ArrayList<String>();
     Name.add("Ankush");
     Name.add("sham");
     Name.add("vijay");
     Name.add("chetan");
     Name.add("ajay");


     List<String> list=Name.stream().filter(obj->obj.toUpperCase().charAt(0)=='A').collect(Collectors.toList());
     System.out.println(list);
	}

}
