import java.util.Scanner;

public class Insertion_Sort {
	static void Insertion(int arr[]) {
	
	 for(int i=1;i<arr.length;i++) {
		 int temp = arr[i];
		 int j=i-1;
		 while(j>=0&&arr[j]>arr[i]) {
			arr[j+1]=arr[j]; 
			 j--;
		 }
		 	 arr[j+1]=temp;
	 }
	 
		}
	
	
	public static void main(String args[]) {
		  
		  Scanner sc=new Scanner(System.in);
		  System.out.println("Enter the number of elements");
		  int n=sc.nextInt();
		  int arr[]=new int[n];
		  System.out.print("Enter array elements");
		  for(int k=0;k<n;k++) {
			  arr[k]=sc.nextInt();
		  }
		  Insertion(arr);
		  for(int i:arr) {
			  System.out.print(i);
		  }
			
			
		}
}
