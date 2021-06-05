import java.util.Scanner;
public class W4P1_GandhiNumber {
    private boolean gandhi(int n){
        if(n==0)
            return false;
        while(n!=1){
            if(n%4!=0){
                return false;
            }
            n/=4; // n = n/4
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value to test: ");
        W4P1_GandhiNumber a=new W4P1_GandhiNumber();
        int n = sc.nextInt();
        if(a.gandhi(n))
            System.out.println(n+" is a gandhi number");
        else
            System.out.println(n+" is not a gandhi number");
        sc.close();
    }
}
