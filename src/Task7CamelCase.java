import java.util.Arrays;

public class Task7CamelCase {
    public static void main(String[] args) {
        System.out.println(toCamelCaseArray("first-test-string"));
        System.out.println(toCamelCaseArray("Secod-test_string"));
    }

    public static String toCamelCaseArray(String s){
        int count=0;
        char array[]=s.toCharArray();
        for (int i=0;i<array.length;i++){
            if (array[i]=='-'|array[i]=='_'){
                count++;
            }
        }
        char arrayRes[]=new char[array.length-count];
        int i=0;
        boolean f=false;
        for (char c:array){
            if (c=='-'|c=='_') {
                f=true;
            }
            else if (c!='-' & c!='_' & f==false){
                arrayRes[i]=c;
                i++;
            }else if (c!='-'&c!='_'&f==true){
                arrayRes[i]=Character.toUpperCase(c);
                f=false;
                i++;
            }
        }
        s=String.valueOf(arrayRes);
        return s;
    }
}
