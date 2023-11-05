public class Task1MaskString {
    public static void main(String[] args) {
        System.out.println(mask("4141589634"));
        System.out.println(maskArray("4141589634"));
        System.out.println(maskTernar("4141589634"));
    }

    public static String mask(String str){
        StringBuffer sb = new StringBuffer(str);
        for (int i=0; i<str.length()-4;i++){
            //System.out.println(str.charAt(i));
            sb.setCharAt(i,'#');
        }
        str=sb.toString();
        // System.out.println(str);
        return str;
    }

    public static String maskArray(String str){
        char[] chars=str.toCharArray();
        for(int i=0; i<str.length()-4;i++){
            chars[i]='#';
        }
        str=String.valueOf(chars);
        return str;
    }

    public static String maskTernar(String str){
        return str.length()<4 ? str : str.substring(0,str.length()-4).replaceAll(".","#")+str.substring(str.length()-4);
    }
}