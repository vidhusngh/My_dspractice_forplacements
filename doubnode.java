
public class doubnode {
int data;
doubnode next;
doubnode prev;
public doubnode(int data){
	this.data=data;
	next=prev=null;
}
public static doubnode insertbeg(doubnode head,int val) {
	if(head==null) {
		head=new doubnode(val);
		return head;
	}
	doubnode temp=new doubnode(val);
	temp.next=head;
	head.prev=temp;
	head=temp;
	return head;
}

public static doubnode printlist(doubnode head) {
	while(head!=null) {
		System.out.print(head.data+" ");
		head=head.next;
	}
	System.out.println("");
	return head;
}
public static doubnode reverse(doubnode head) {
	if(head==null||head.next==null) {return head;}
	doubnode temp=null,current=head;
	while(current!=null) {
		temp=current.prev;
		current.prev=current.next;
		current.next=temp;
		current=current.prev;
	}
	return temp.prev;
}
public static void main(String[] args) {
	doubnode head=new doubnode(50);
	head.next=new doubnode(99);
	head.next.prev=head;
	head.next.next=new doubnode(77);
	head.next.next.prev=head.next;
	head=insertbeg(head,81);
	printlist(head);
	head=reverse(head);
	printlist(head);
}
}
