package Assignment1;

public class Duplicate_No {

	public static void main(String[] args) {
    int arr[]= {1,1,1,5,5,8,6,10};
    int count=0;
    int val=0;
    int n=1;
    for(int i=0;i<arr.length;i++)
    {
    	if(arr[i]==n)
    	{
    		count++;
    	}
    	val=count;
    }
    System.out.println(n+" "+"count="+val);
	}

}
