public class Task2Isogram {
    public static void main(String[] args) {
        System.out.println(isIsogram(""));
        System.out.println(isIsogram("asqwertyuq"));
        System.out.println(isIsogram("moOse"));

        System.out.println(isIsogramDistnct(""));
        System.out.println(isIsogramDistnct("asqwertyuq"));
        System.out.println(isIsogramDistnct("moOse"));
    }

    public static boolean isIsogram(String str){
        char[] s=str.toLowerCase().toCharArray();
        for (int i=0;i<s.length;i++){
            //System.out.println(s[i]);
            for (int j=i+1; j<s.length;j++){
                //System.out.print(s[j]);
                if (s[i]==s[j]) return false;
            }
            //System.out.println();
        }
        return true;
    }

    public static boolean isIsogramDistnct(String str){
        //System.out.println(str.toLowerCase().chars().distinct().count());
        return str.length()==str.toLowerCase().chars().distinct().count();
    }
}
