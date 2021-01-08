import java.util.Scanner;

public class Insertion_Sort {
static void Insertion(int arr[]) {
	int temp,min_element;
	for(int i=0;i<arr.length-1;i++) {
		min_element=arr[i];
		{
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j]<min_element) {
					min_element=arr[j];
					temp=arr[i];
					arr[i]=min_element;
					arr[j]=temp;
				}
			}
		}
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
		  System.out.print(i+" ");
	  }
		
		
	}
}
