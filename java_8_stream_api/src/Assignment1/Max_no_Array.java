 package Assignment1;
 interface max {
	public int nth();
 }
    public class Max_no_Array {
    	
	public static void main(String[] args) {
     max M=()->{
    	 int[] arr= {10,15,45,66,88,77};
    	 int maxnum=arr[0];
    	 for(int i=0;i<arr.length;i++)
    	 {
    		 if(arr[i]>maxnum)
    		 {
    			 maxnum=arr[i];
    		 }
    	 }
    	 return maxnum;
     };
     System.out.println("Maximum no in array="+M.nth());
	}
}
