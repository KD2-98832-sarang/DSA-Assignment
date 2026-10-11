import java.util.*;

public class nonRepting {
    public static void print(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    public static int unique(int arr[]){
    int count = 0;
    for(int i=0;i<arr.length;i++){
        count=0;
        for(int j=0;j<arr.length;j++){
            if(arr[i]==arr[j]){
               count++;
            }
        }
            if(count == 1)
               return i; 
    
}
return -1;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,-1,2,1,0,4,-1,7,8};
    int index=unique(arr);
    System.out.println("unique element " +arr[index]);
                }
            }
            
