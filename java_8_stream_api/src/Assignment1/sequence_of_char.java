package Assignment1;
  interface character
  {
	  default void display()
	  {
		 String str="hello java";
		 if(str.contains("java"))
		 {
			 System.out.println("true");
		 }
		 else
		 {
			 System.out.println("false");
		 }
	  }
  }
public class sequence_of_char implements character {
	public static void main(String[] args) {
		sequence_of_char o=new sequence_of_char();
		o.display();
	}
}
