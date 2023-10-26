public class DigitSum {
    public static void main(String[] args) {
        int n=385432;
        int sum=0;
        while(n!=0){
            sum+=n%10;
            n=n/10;
        }
        System.out.println(sum);
    }
}
