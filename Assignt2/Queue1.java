import java.util.*;
public class Queue1 {
     private int arr[];
     private int SIZE;
     private int front,rear;

     public Queue1(int size){
        SIZE=size;
        arr=new int[SIZE];
        front=rear=-1;

     }

     public void offer(int value){
        if(isFull()){
            System.out.println("queue is full");
        }else{
            rear++;
            arr[rear]=value;
        }
     }

     public void poll(){
     int temp=-1;
     if(isEmpty()){
        System.out.println("queue is empty");
     }else{
        front++;
        temp=arr[front+1];
        
        if(front==rear)
            front=rear=-1;
     }

     }
     public int peek(){
    int temp=-1;
    if(isEmpty()){
        System.out.println("queue is empty");
        
    }else{
        temp=arr[front++];
      
    }
    return temp;
     }
     public boolean isEmpty(){
        return front==rear;
     }
     public boolean isFull(){
        return rear== SIZE-1;
     }

     public static void main(String[] args) {
        Queue Q=new Queue(5);
      
        Scanner sc=new Scanner(System.in);
        int choice;
        do{
            System.out.println("1.offer \n 2.poll \n 3.peek\n");
            System.out.println("enter the choice");
            choice =sc.nextInt();

            switch(choice){
                case 1:
                    System.out.println("Enter the value ");
                    int value=sc.nextInt();
                    Q.offer(value);
                    break;
                case 2:
                    System.out.println("value poped"+Q.poll());
                    break;
                case 3:
                    System.out.println("top element"+Q.peek());
                    break;
            }
        }while(choice!=0);
        sc.close();
     }

}
