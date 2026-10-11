import java.util.*;
public class stack1 {

    private int arr[];
    private int size;
    private int top;

    public void stack1(int size){
        size=size;
        arr=new int[size];
        top=-1;

    }

    public void push(int value){
        if(isFull()){
            System.out.println("Stack is Full");
        }else{
            top++;
            arr[top]=value;
        }
        
    }
    public int pop(){
    int temp=-1;
    if(isEmpty()){
    System.out.println("Stack is empty");
    }else{
    temp=arr[top];
    top--;
    }
    return top;
    }
    public int peek(){
        int temp=-1;
        if(isEmpty()){
            System.out.println("Stack is empty");
            top=arr[temp];
        }
        return temp;
    }
    public boolean isEmpty(){
        return top==-1;
    }
    public boolean isFull(){
        return top == size-1;
    }
 

   public static void main(String[] args) {
    
    Stack st =new Stack(4);
    Scanner sc =new Scanner(System.in);
    int choice;

    do{
        System.out.println("1.push\n 2.pop\n 3.peek \n");
        choice=sc.nextInt();

         switch(choice){
            case 1:
                System.out.println("Enter the value");
                int  value=sc.nextInt();
                st.push(value);
                break;

                case 2:
                System.out.println("element pop "+st.pop());
                break;

                case 3:
                    System.out.println("top most element"+st.peek());
                    break;
        }
    }while(choice!=0);
     sc.close();
   } 
  
}
