public class Main {

    static int fib(int n){
        if (n==1 || n==2)
            return 1;


        //f(1)=1
        //f(2)=1
        //f(3)=2
        //f(4)=3
        //f(n)=f(n-1)+f(n-2)




        return fib(n-1)+fib(n-2);
    }
    public static void main(String[] args) {



        System.out.println("5. Elemanin fibonachi sayisi : "+fib(7));
    }
}