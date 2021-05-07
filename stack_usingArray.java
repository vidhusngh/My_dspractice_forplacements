public class stack_usingArray {
    int top,count;
    int []arr;
    public stack_usingArray(int capacity){
        arr=new int[capacity];
        top=-1;
        count=capacity;
    }
    public void push(int element){
        if(top==count-1)return;
        arr[top+1]=element;
        top=top+1;
    }
    public int peek(){
        return arr[top];
    }
    public int size(){
        return top+1;
    }
    public int pop(){
      int temp=arr[top];
      if(top==0)return -1;
      for(int i=top;i<arr.length-1;i++){
          arr[top]=arr[top+1];
      }
      top=top-1;
      return temp;
    }
    public static void main(String[] arg)
    {
        stack_usingArray st=new stack_usingArray(10);
            st.push(10);
            st.push(20);
            System.out.println(st.peek());
            System.out.println(st.pop());
            System.out.println(st.size());

    }
}
