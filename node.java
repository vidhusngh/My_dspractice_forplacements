//Linked list  implementation in java
public class node {
	int data;
	node next;
	public node(int k) {
		data=k;
		next=null;
	}
	public static void main(String arg[]) 
	{
		node n1=new node(30);
		node n2=new node(40);
		n1.next=n2;
		System.out.print(n1.data+" "+n2.data);
	}

}
