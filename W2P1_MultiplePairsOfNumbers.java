public class W2P1_MultiplePairsOfNumbers {
    public static void main(String[] args) {
        int n=250;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                System.out.println(i+" , "+n/i);
            }
        }
    }
}
