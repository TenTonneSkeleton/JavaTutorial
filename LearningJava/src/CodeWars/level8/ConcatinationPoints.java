package CodeWars.level8;

import java.util.Arrays;

public class ConcatinationPoints {

    public static int[] reflectPoint(int[] p, int[] q) {
        int[] result = new int[2];
        for (int i = 0; i < result.length; i++) {
            if (p[i]>=0){
                if (q[i]<=0){
                    result[i] = (p[i]+Math.abs(q[i])*2)*-1;
                } else {
                    result[i] = q[i]*2-p[i];
                }
            } else {
                if (q[i]<=0){
                    result[i] = (q[i])*2-p[i];
                } else {
                    result[i] = Math.abs(p[i])+q[i]*2;
                }
            }
        }
    return result;
    }

    public static void main(String[] args) {
        int[] var01 = {0,0}, var11 = {1,1};
        int[] var02 = {2,6}, var12 = {-2,-6};
        int[] var03 = {10,-10}, var13 = {-10,10};
        int[] var04 = {1,-35}, var14 = {-12,1};
        int[] var05 = {1000,15}, var15 = {-7,-214};
        int[] var06 = {0,0}, var16 = {0,0};
        int[] var07 = {500,500}, var17 = {1000,0};
        int[] var08 = {-500,-500}, var18 = {-300,0};
        System.out.println(Arrays.toString(reflectPoint(var01,var11)));
        System.out.println(Arrays.toString(reflectPoint(var02,var12)));
        System.out.println(Arrays.toString(reflectPoint(var03,var13)));
        System.out.println(Arrays.toString(reflectPoint(var04,var14)));
        System.out.println(Arrays.toString(reflectPoint(var05,var15)));
        System.out.println(Arrays.toString(reflectPoint(var06,var16)));
        System.out.println(Arrays.toString(reflectPoint(var07,var17)));
        System.out.println(Arrays.toString(reflectPoint(var08,var18)));
    }

}

/*
public interface Reflections {
  static int[] reflectPoint(int[] p, int[] q) {
    return new int[]{2 * q[0] - p[0], 2 * q[1] - p[1]};
  }
 */
