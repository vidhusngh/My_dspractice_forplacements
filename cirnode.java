public class cirnode {
int data;
cirnode next;
public cirnode(int data) {
	this.data=data;
	next=null;
}
public static cirnode printall(cirnode head) {
	if(head==null) {
		return head;}
	System.out.print(head.data +" ");
	cirnode curr=head.next;
	while(curr!=head) {
		System.out.print(curr.data+" ");
		curr=curr.next;
	}
	System.out.println("");
	return head;
}
public static cirnode insertbeg(cirnode head,int data) {
	cirnode temp=new cirnode(data);
	if(head==null) {head=new cirnode(data);}
	
	else {
		cirnode a=head.next;
		head.next=temp;
		temp.next=a;
		
	  int b=head.data;
	  head.data=temp.data;
	  temp.data=b;
	}
	return head;
}
public static cirnode delhead(cirnode head) {
	if(head==null||head.next==null) {return null;}
	else {
		head.data=head.next.data;
		head.next=head.next.next;
	}
	return head;
}
public static cirnode insertend(cirnode head,int data){
	cirnode temp=new cirnode(data);
	if(head==null) {head=temp;}
	else {
		cirnode a=head.next;
		head.next=temp;
		temp.next=a;
		int b=temp.data;
		temp.data=head.data;
		head.data=b;
	}
	return temp;
}
public static void main(String []arg) {
	cirnode head=new cirnode(5);
	head.next=new cirnode(44);
	head.next.next=new cirnode(42);
	head.next.next.next=head;
	printall(head);
	head=insertbeg(head,1);
	printall(head);
	head=insertend(head,58);
	printall(head);
	head=delhead(head);
	printall(head);
}
}
