public class Task8PrimeInteger {
    public static void main(String[] args) {
        System.out.println(isPrime(1));
        System.out.println(isPrime(9));
        System.out.println(isPrime(2));
        System.out.println(isPrime(3));
        System.out.println(isPrime(4));
        System.out.println(isPrime(7));
        System.out.println(isPrime(8));
        System.out.println(isPrime(73));
        System.out.println(isPrime(75));
        System.out.println(isPrime(67));
        System.out.println(isPrime(97));
        System.out.println(isPrime(68));
        System.out.println(isPrime(95));
        System.out.println(isPrime(10));
        System.out.println(isPrime(11));
        System.out.println(isPrime(247338529));

        System.out.println();
        System.out.println(isPrimeAlternate(1));
        System.out.println(isPrimeAlternate(9));
        System.out.println(isPrimeAlternate(2));
        System.out.println(isPrimeAlternate(3));
        System.out.println(isPrimeAlternate(4));
        System.out.println(isPrimeAlternate(7));
        System.out.println(isPrimeAlternate(8));
        System.out.println(isPrimeAlternate(73));
        System.out.println(isPrimeAlternate(75));
        System.out.println(isPrimeAlternate(67));
        System.out.println(isPrimeAlternate(97));
        System.out.println(isPrimeAlternate(68));
        System.out.println(isPrimeAlternate(95));
        System.out.println(isPrimeAlternate(10));
        System.out.println(isPrimeAlternate(11));
        System.out.println(isPrimeAlternate(247338529));
    }

    public static boolean isPrime(int num) {
        boolean flag;
        int n;
        if (num > 1 && num != 4) flag = true;
        else flag = false;
        if (num > 10) n = (int) Math.sqrt(num) + 1;
        else n = num;
        for (int i = 2; i < n; i++) {
            if (num % i == 0) {
                System.out.println("num=" + num + " i=" + i);
                flag = false;
            }
        }
        return flag;
    }

    public static boolean isPrimeAlternate(int num){
        boolean flag;
        if (num>1) flag=true;
        else flag=false;
        for (int i=2;i<=num/i;i++){
            if (num%i==0) flag=false;
        }
        return flag;
    }
}
