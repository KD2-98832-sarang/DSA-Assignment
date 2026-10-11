import java.util.Scanner;
public class pallindrom {

public static int revNo(int num){
    int newNum =0;
    while(num>0){
        int digit= num %10;
        newNum = newNum*10+digit;
        num/=10;
    }
    return newNum;
}

public static boolean isPallindrome(int num){
    return num == revNo(num);
}


    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the number ");
       int num = sc.nextInt();
        boolean isPallindrome=isPallindrome(num);
        if(isPallindrome){
            System.out.println("Enter number is pallindrome");

        }else{
            System.out.println("the number is not pallindrome");
        }
    }
}
