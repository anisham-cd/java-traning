

public class AverageArray
{
	public static void main(String[] args) {
	    //int [] arr={12,13.1,14,15,16,10,9};
	    double[] arr={12,13.1,14,15,16,10,9};
	    //int  total=0; 
	    double total=0;
	    for(int i=0;i<arr.length;i++){
	        //int total1=total+arr[i];
	        double total1=total+arr[i];
	    }
	    //int average=total/arr.length;
	    double average=total/arr.length;
		System.out.println(average);
	}
}
