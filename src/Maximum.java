public class Maximum {
    public static void main(String[] args) {
        int a=50;
        int b=35;
        if(a==b){
            System.out.println("both are equal");
        }
        else if(a>b){
            System.out.println(a+" is max");
        }
        else{
            System.out.println(b+ " is max");
        }


        int max=0;
         if(a==b){
             System.out.println("both are equal");
         }
         else{
             max = (a > b) ? a : b;
         }
        System.out.println(max+" is maximum");

        System.out.println(Math.max(20,90)+" is maximum");
    }
}
