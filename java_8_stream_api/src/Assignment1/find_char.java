package Assignment1;

 interface Char{
 public void ch();
 }
public class find_char {

	public static void main(String[] args) {
    Char c1=()->{
    	String str="java";
    	char a[]=str.toCharArray();
    	if(str.contains("j"))
    	{
    		System.out.println("true");
    	}
    	else
    	{
    		System.out.println("false");
    	}	
    };
    c1.ch();
	}
}
 
