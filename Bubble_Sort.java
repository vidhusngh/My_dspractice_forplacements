import java.util.*;

public class Bubble_Sort {
static void bubble(int array[]){
int n=array.length;
int temp;
for(int i=0;i<n-1;i++) {
	for(int j=0;j<n-i-1;j++) {
		if(array[j]>array[j+1]) {
			temp=array[j];
			array[j]=array[j+1];
			array[j+1]=temp;
		}
	temp=0;	
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
  bubble(arr);
  for(int i:arr) {
	  System.out.print(i);
  }
	
	
}
}