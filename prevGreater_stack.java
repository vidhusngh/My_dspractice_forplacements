import java.util.ArrayDeque;

public class prevGreater_stack {
    public static void prevGreater(int[] arr){
        ArrayDeque<Integer> stack=new ArrayDeque<Integer>();
        for(int i=0;i<arr.length;i++){
            while(!stack.isEmpty() && stack.peek()<=arr[i]){
                stack.pop();
            }
            int res=stack.isEmpty()?-1:stack.peek();
            System.out.print(res+"  ");
            stack.push(arr[i]);
        }
    }
    public static void main(String[] arg){
        int [] arr={1,2,4,2,6,8,5,9,3,6,8,3};
        prevGreater(arr);
    }

}
