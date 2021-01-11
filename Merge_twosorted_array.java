import java.util.Scanner;

public class Merge_twosorted_array {
	static void merge(int arr1[],int arr2[]){
		int n=arr1.length,i=0;
		int m=arr2.length,j=0;
	while(i<n&&j<m) {
		if(arr1[i]<=arr2[j]) {
			System.out.print(arr1[i]);
			i++;
		}
		else {
			System.out.print(arr2[j]);
			j++;
		}
		while(i<n) {System.out.print(arr1[i]);
		i++;}
		while(j<m) {			System.out.print(arr2[j]);
		j++;}
		
	}	
	}
	public static void main(String args[]) {
		  
		  Scanner sc=new Scanner(System.in);
		  System.out.println("Enter the number of elements in array 1");
		  int n=sc.nextInt();
		  System.out.println("Enter the number of elements in array 2");
		 int m=sc.nextInt();
		  int arr[]=new int[n];
		  int arr2[]=new int[m];
		  int arrres[]=new int[n+m];
		  System.out.print("Enter array 1 elements");
		  for(int k=0;k<n;k++) {
			  arr[k]=sc.nextInt();
		  }
		 
		  System.out.print("Enter array 2 elements");
		  for(int k=0;k<m;k++) {
			  arr2[k]=sc.nextInt();
		  }
		  
		 merge(arr,arr2);
			
}
}