import java.util.Scanner;
public class W5P1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of values");
        int n=sc.nextInt();
        int array[]=new int[n];
        int min=9999,max=0,sum=0,count=0;
        System.out.println("Enter the values:");
        for(int i=0;i<n;i++){
            array[i]=sc.nextInt();
            if(min>array[i])
                min=array[i];
            if(max<array[i])
                max=array[i];
        }
        for(int i=0;i<n;i++){
            if(max==array[i]||min==array[i]){
                sum+=array[i];
                count++;
            }
        }
        float avg=(float)sum/count;
        System.out.println("MIN : "+min+" MAX : "+max+" AVG : "+avg);
        sc.close();
    }
}