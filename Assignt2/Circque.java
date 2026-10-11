import java.util.*;

public class Circque{
    private int arr[];//define array 
    private int SIZE;//define array size
    int front,rear;
    int count=0;

    public Circque(int size){
     SIZE =size;
     arr=new int[size];
     front=rear=-1;
    }

 public void offer(int value){
if(isFull()){
    System.out.println("Queue is full");
}  else
    {rear=(rear+1)%SIZE;

       arr[rear]=value;
       count++;
 }
 }
public int poll(){
    int temp=-1;
    if(isEmpty()){
        System.out.println("Queue is Empty");
    }else{
        temp=arr[(front + 1)%SIZE];
        front = (front +1)%SIZE;
        if(front ==rear)
            front= rear=-1;
        count--;
    }
    return 0;
}
public int peek(){
     int temp=-1;
    if(isEmpty()){
        System.out.println("Queue is Empty");
    }else{
        temp=arr[(front + 1)%SIZE];
 
}    
    return temp;
}

public boolean isFull(){
return (front ==-1 && rear==SIZE-1)||(front ==rear && rear ==-1); // check one condition true 
}
public boolean isEmpty(){
return front==rear && rear ==-1;//check wheter both condition are true
}
public void display(){
    if(isEmpty()){
        System.out.println("Queue is empty");
    }else{
        System.out.println("Queue elements");

        int index = front;
        for(int i=0;i<count;i++){
            System.out.println(arr[index]);
            index=(index+1)%SIZE;
        }
    }
    System.out.println("count " +count);
}


public static void main(String[] args) {
   // Queue Q = new Queue(5);
   Circque Q=new Circque(5);
    Scanner sc=new Scanner(System.in);
    int choice;

do{
    System.out.println("1.offer \n 2.poll \n 3.peek \n 4.display\n");
    System.out.println("Enter choice ");
    choice =sc.nextInt();

    switch(choice){
        case 1:
            System.out.println("Enter the element ");
            int value=sc.nextInt();
            Q.offer(value);
            break;

        case 2:
            System.out.println("Element to be pop " + Q.poll());
            break;
        case 3:
            System.out.println("Top element "+Q.peek());
            break;
        case 4:
            System.out.println("Queue is full "+Q.isFull());
            break;
        case 5:
            System.out.println("Queue is empty"+Q.isEmpty());
            break;
        case 6:
            Q.display();
            break;
          
    }
  
    

}while(choice!=0);
sc.close();
}

}