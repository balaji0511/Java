import com.sun.source.tree.BreakTree;

public class NSum1 {
    public static void main(String[] args) {
        int a=5;
        int b=10;
        int sum=0;
        for(int i=a;i<=b;i++){
            sum+=i;
        }
        System.out.println(sum);

        int total=b*(b+1)/2 - a*(a+1)/2;
        System.out.println(total);

        System.out.println(getsum(0,a,b));

    }
    static int getsum(int sum,int a,int b) {
        if (a > b) {
            return sum;
        }
        else {
            return a + getsum(sum, a + 1, b);
        }
    }
}
