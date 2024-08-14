package companies.uzb;

public class Main {
    public static void main(String[] args) {
//          fib(15)
//        0 1 1 2 3 5 8 13
//        new Main().fib(15);
        new Main().function(15);
    }

    private void function(int i) {
        int count = 0;
        while (true) {
            int fib = fib(count);
            if (fib > i) {
                break;
            }
            System.out.println(fib);
            count++;
        }
    }

    private int fib(int i) {
        if (i < 2) {
            return i;
        }
        return fib(i - 1) + fib(i - 2);
    }

//    private void fib(int n) {
//        int sum=0;
//        int temp1=0;
//        int temp2=1;
//        System.out.println(temp1);
//        System.out.println(temp2);
//        while (true){
//            sum=temp1+temp2;
//            temp1=temp2;
//            temp2=sum;
////            if(sum)
//            System.out.println(sum);
//        }
//    }
}
