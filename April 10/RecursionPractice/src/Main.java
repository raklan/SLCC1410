public class Main {

    public static void main(String[] args) {
        r(5);
        System.out.println(pow(3,3,1));
        System.out.println(factorial(63));
        System.out.println(fibonacci(100));
    }
    public static void r(int count){
        if(count<0)
            return;
        System.out.println(count);
        r(count-1);
        System.out.println(count);
    }
    public static int pow(int exp, int base, int ans){
        if(exp<=0)
            return ans;
        else
            return pow(exp-1,base,base*ans);
    }
    public static long factorial(int n){
        if(n==1)
            return 1;
        else
            return n*factorial(n-1);
    }
    public static long fibonacci(long index){
        if(index==0)
            return 0;
        else if(index==1)
            return 1;
        else
            return fibonacci(index-1)+fibonacci(index-2);
    }
}
