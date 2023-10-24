public class Task6SumDigitOfNumber {
    public static void main(String[] args) {
        System.out.println(digitRoot(1246));
        System.out.println();
        System.out.println(digitRootAlternate(1246));
    }

    public static int digitRoot(int n){
        int numDigits=(int)Math.log10(n)+1;
        int i=0;
        while(numDigits>0 & n>0){
            i+=n%10;
            n/=10;
            numDigits--;
        }
        System.out.println(i);
        if(i>9) i=digitRoot(i);
        return i;
    }
    public static int digitRootAlternate(int n){
        System.out.println(n%9);
        return (1 + (n - 1) % 9);
    }
}
