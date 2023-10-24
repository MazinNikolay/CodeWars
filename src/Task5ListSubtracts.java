import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static java.util.Arrays.stream;


public class Task5ListSubtracts {
    public static void main(String[] args) {
        System.out.println(arrayDiff(new int [] {1,2,3,4,5,4,2}, new int[] {1,3,4}));
        System.out.println(arrayDiff(new int [] {1,2}, new int[] {1}));
        System.out.println(arrayDiff(new int [] {1,2,2}, new int[] {1}));
        System.out.println(arrayDiff(new int [] {1,2,2}, new int[] {2}));
        System.out.println(arrayDiff(new int [] {1,2,2}, new int[] {}));
        System.out.println(arrayDiff(new int [] {}, new int[] {1,2}));

        System.out.println(arrayDiffAlternate(new int [] {1,2,3,4,5,4,2}, new int[] {1,3,4}));
        System.out.println(arrayDiffAlternate(new int [] {1,2}, new int[] {1}));
        System.out.println(arrayDiffAlternate(new int [] {1,2,2}, new int[] {1}));
        System.out.println(arrayDiffAlternate(new int [] {1,2,2}, new int[] {2}));
        System.out.println(arrayDiffAlternate(new int [] {1,2,2}, new int[] {}));
        System.out.println(arrayDiffAlternate(new int [] {}, new int[] {1,2}));
    }
    public static int[] arrayDiffAlternate(int[] a, int[] b){
        int al=a.length;
        int bl=b.length;
        Integer a1[]=new Integer[al];
        Integer b1[]=new Integer[bl];
        for (int i=0; i<a.length; i++) {
            a1[i]=a[i];
            //System.out.println(a1[i]);
        }
        for (int i=0; i<b.length; i++){
            b1[i]=b[i];
            //System.out.println(b1[i]);
        }
        List<Integer> list1 = new ArrayList<Integer>(Arrays.asList(a1));
        List<Integer> list2 = new ArrayList<Integer>(Arrays.asList(b1));
        list1.removeAll(list2);
        Integer[] array = list1.toArray(new Integer[list1.size()]);
        for(int i=0; i<array.length; i++) System.out.println(array[i]);
        int res[]=new int[array.length];
        for(int i=0; i<array.length; i++){
            res[i]=array[i];
        }
        return res;
    }

    public static int[] arrayDiff(int[] a, int[] b){
        int count=0;
        for (int i=0;i<a.length;i++){
            for (int j=0;j<b.length;j++){
                if (a[i]==b[j]) count++;
            }
        }
        System.out.println("count="+count);
        int[] res=new int[a.length-count];
        System.out.println("res.length"+res.length);
        int q=0;
        boolean match=false;
        for (int i=0;i<a.length;i++){
            for (int j=0;j<b.length;j++){
                if (a[i]==b[j]) match=true;
            }
            //System.out.println(match);
            if (!match) {
                res[q]=a[i];
                q++;
            }
            match=false;
        }
        for (int i:res) System.out.println(i);
        return res;
    }

    public static int[] notMy(int[] a, int[] b){
        List<Integer> listA = stream(a).boxed().collect(Collectors.toList());
        List<Integer> listB = stream(b).boxed().collect(Collectors.toList());
        listA.removeAll(listB);
        return listA.stream().mapToInt(e -> e).toArray();
    }
    public static int[] notMy2(int[] a, int[] b){
        return IntStream.of(a).filter(x -> IntStream.of(b).noneMatch(y -> y == x)).toArray();
    }
    public static int[] notMy3(int[] a, int[] b){
        return stream(a).filter(x -> stream(b).noneMatch(y -> y == x)).toArray();
    }


}
