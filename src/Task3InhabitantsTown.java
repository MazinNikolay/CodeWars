public class Task3InhabitantsTown {
    public static void main(String[] args) {
        /*System.out.println(hbYear(1000,2,50,1200));
        System.out.println(hbYear(1500, 5, 100, 5000));
        System.out.println(hbYear(1500000, 2.5, 10000, 2000000));
        System.out.println(hbYear(1500000, 0.25, 1000, 2000000));
        System.out.println();*/
        System.out.println(hbYearTernar(1000,2,50,1200));
        System.out.println(hbYearTernar(1500, 5, 100, 5000));
        System.out.println(hbYearTernar(1500000, 2.5, 10000, 2000000));
        System.out.println(hbYearTernar(1500000, 0.25, 1000, 2000000));
        System.out.println();
        System.out.println(hbYearWhile(1000,2,50,1200));
        System.out.println(hbYearWhile(1500, 5, 100, 5000));
        System.out.println(hbYearWhile(1500000, 2.5, 10000, 2000000));
        System.out.println(hbYearWhile(1500000, 0.25, 1000, 2000000));

    }

    public static int hbYearWhile(int p0, double percent, int aug, int p){
        int result=0;
        while (p>p0){
            p0+=(p0*(percent*0.01)+aug);
            //System.out.println(p0);
            result++;
        }
        return result;
    }

    /*  Нихуя не работает, процент берется только от первого года, а надо от каждого
        public static int hbYear(int p0, double percent, int aug, int p){
        double inc=(p-p0)/(p0*(0.01*percent)+aug);
        System.out.println("%="+0.01*percent);
        System.out.println("% "+p0+"="+p0*(0.01*percent));
        System.out.println("inc="+inc);
        return (int)inc;
    }*/

    public static int hbYearTernar(int p0, double percent, int aug, int p){
        return p>p0 ? hbYearTernar((int)(p0+(p0*(0.01*percent)+aug)),percent,aug,p)+1:0;
        //return p0 < p ? hbYearTernar((int) (p0 * (percent / 100 + 1) + aug), percent, aug, p) + 1 : 0;
    }
}
