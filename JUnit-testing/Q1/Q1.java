
public class Q1 {
	 public int[] minmaxFinder(int[] arr) {
		 int n;
		 n=arr.length;
		 int max=arr[0];
		 for(int i=0;i<n;i++) {
			 if(arr[i]>max) {
				 max=arr[i];
			 }
		 }
	 
	    int min=arr[0];
	    for(int j=0;j<n;j++) {
	    	if(arr[j]<min) {
	    		min=arr[j];
	    	}
	    }
	    int a[]= {min,max};
	    return a;
	 }
}
