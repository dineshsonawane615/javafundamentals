package array;

public class Array {
    public static void main(String[] args) {
//        int[] myArr = new int [5];
//        myArr[0] = 91;
//        myArr[1] = 52;
//        myArr[2] = 33;
//        myArr[3] = 54;
//        myArr[4] = 55;

        int[] myArr = {98, 2, 43, 54, 56};
//      int index = 2;

//        System.out.println(myArr[0]);
//        System.out.println(myArr[1]);
//        System.out.println(myArr[index]);
//        System.out.println(myArr[3]);
//        System.out.println(myArr[4]);

        // Array Traversal
        int index = 0;
        while(index < myArr.length){
            System.out.println(myArr[index]);
            index++;
        }

        String[] strArr = new String[5];
        strArr[0] = "My String";

        String[] newStrArr = {"first", "second", "third"};
        System.out.println("Size of the array: "+newStrArr.length);
    }
}
