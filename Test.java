package intefaceComparable;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        ComparableCircle[] circles=new ComparableCircle[4];
        circles[0]=new ComparableCircle(5,"blue",true);
        circles[1]=new ComparableCircle(6,"blue",true);
        circles[2]=new ComparableCircle(6);
        circles[3]=new ComparableCircle();
        System.out.println("unsorted array");
        for (ComparableCircle circle:circles){
            System.out.println(circle);
        }
        Arrays.sort(circles);
        System.out.println("sorted array");
        for (ComparableCircle circle:circles){
            System.out.println(circle);

        }
    }
}
