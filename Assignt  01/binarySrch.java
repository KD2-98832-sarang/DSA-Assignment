import java.util.*;
public class binarySrch {
    public static int binarySrch(int arr[],int ele){
        int l=0;
        int h=arr.length-1;
        int mid=(l+h)/2;
       while(l<=h){
        if(ele== arr[mid])
          return mid;
        else if(arr[mid]<=ele)
         h=mid-1;
        else

            l=mid+1;

       }
       return -1;
    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the element ");
        int ele=sc.nextInt();
        int arr[]={30,28,24,19,16,12,9,6};
        int answear =binarySrch(arr, ele);
        System.out.println("Element found"+answear);
    }
}
