public class NSum {
    public static void main(String[] args) {
        int n=15;
        int sum=0;
        for(int i=1;i<=n;i++){
            sum+=i;

        }
        System.out.println(sum);


        System.out.println(n*(n+1)/2);
        System.out.println(getSum(25));

    }
    static int getSum(int n){
        if(n==0){
            return n;
        }
        else{
            return n+getSum(n-1);
        }
    }

}
