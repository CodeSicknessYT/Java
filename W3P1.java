import java.util.Scanner;
public class W3P1{
    public static boolean isPrime(int n){
        if(n==0 || n==1){
            return false;
        }
        else{
            for(int i=2;i<=n/2;i++){
                if(n%i==0){
                    return false;
                }
            }
            return true;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of values");
        int g=sc.nextInt();
        int[] arra=new int[g];
        System.out.println("Enter values here:");
        for(int i=0;i<g;i++){
            int temp=sc.nextInt();
            if(temp>1 && temp<100){
                arra[i]=temp;
            }
            else{
                System.out.println("Invalid Input Try again");
                continue;
            }
        }
        for(int i=0;i<g;i++){
            if(isPrime(i)){
                if(isPrime(arra[i])){
                    System.out.println(arra[i]+" , "+i);
                }
            }
        }
    }
}