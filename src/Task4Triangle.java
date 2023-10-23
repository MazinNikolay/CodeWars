import static java.lang.Math.abs;

public class Task4Triangle {
    public static void main(String[] args) {
        System.out.println(isTriangle(4,5,7));
        System.out.println(isTriangle(1,2,2));
        System.out.println(isTriangle(7,2,2));
    }

    public static boolean isTriangle(int a, int b, int c){
        if (a<(b+c) & b<(a+c) & c<(a+b) & a>abs(b-c) & b>abs(a-c) & c>abs(a-b)) {
            return true;
        } else return false;
    }
}
