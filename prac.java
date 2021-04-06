public class prac {
	int value;
	prac next;
	public prac(int data){
		value=data;
		next=null;
	}
	public static void printlist(prac head) {
		prac current=head;
		while(current!=null) {
			System.out.print(current.value+" ");
			current=current.next;
		}}
		public static prac insertBegin(prac ref,int value){
			prac temp=new prac(value);
			temp.next=ref;
			return temp;
			
	}
		public static void insertEnd(int value,prac ref) {
			if(ref==null) {
				ref=new prac(value);
			}
			else {
				while(ref.next!=null) {
					ref=ref.next;
				}
				ref.next=new prac(value);
			}
		}
		public static prac deleteHead(prac ref) {
			if(ref.next==null) {return null;}
			return ref.next;
		}
		public static prac deleteLast(prac ref) {
			if(ref==null||ref.next==null) {
				return null;
			}
			prac it=ref;
			while(it.next.next!=null) {
				it.next=null;
			}
			return ref;
		} 
		public static prac insertpos(prac ref,int n,int data) {
		prac curr1=ref;
		for(int i=0;i<n-2;i++) {
			if(curr1==null)return ref;
			curr1=curr1.next;
			
		}
		prac tem=curr1.next;
		prac aa=new prac(data);
		curr1.next=aa;
		aa.next=tem;
		return ref;
		}
	public static void main(String []args) {
		prac head=new prac(15);
		prac val=new prac(20);
		head.next=val;
		val.next=new prac(55);
		val.next.next=new prac(40);
		head=insertBegin(head,70);
		insertEnd(89,head);
		printlist(head);
		head=deleteHead(head);
		System.out.println(" ");
		printlist(head);
		System.out.println(" ");
		insertpos(head,3,44);
		printlist(head);
	
	}

}
