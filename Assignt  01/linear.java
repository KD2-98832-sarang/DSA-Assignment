import java.util.*;
public class linear {
    
    public static int linear(int arr[],int key){
       // int occurence=0;
     for(int i=0;i<arr.length;i++){
        if(arr[i]==key)
         return i; 
   }
    return  -1;
    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the key");
        int key =sc.nextInt();
        int arr[]={12,14,16,18,20,24};
        int answear=linear(arr, key);
        System.out.println("index of element found "+answear);

    }
}
