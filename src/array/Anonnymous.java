package array;

public class Anonnymous {

    //TwoDimensional
//    public static void main(String[] args) {
//        Anonnymous.sum(new int[]{10,20,30});
//    }
//    static void sum(int[] no){
//        int total=0;
//        for(int i:no){
//           total = total+i;
//        }
//        System.out.println("sum is:"+total);
//    }

    //multiDimensional
    public static void main(String[] args) {
        Anonnymous.sum(new int[][]{{10,20,30},{40,50}});
    }
    static void sum(int[][] no){
        int total=0;

        for(int ii[]:no){
            for (int i:ii){
                total = total+i;
            }
        }
        System.out.println("sum is:"+total);
    }
}
