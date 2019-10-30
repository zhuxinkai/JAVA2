package cn.set;

import java.util.Arrays;
import java.util.List;

public class ToolsArraysDemo {
    public static void main (String [] args){
  Integer [] array = {1,3,5,6,234,456,6845,13451435};
  //System.out.println(getIndex(6845,array));
  int [] array1 = {3,234,452,2,34,454,656,4,667,53};
   sortNumber(array1);
   System.out.println();
   System.out.println("----------------------------------------------");

   System.out.println(toStringNumber(array1));
   List<Integer> list1 = toList(array);
   System.out.println(list1);
   if(list1 instanceof List){
    System.out.println("true");
}


    }
    /*利用工具类的Arrays.binarySearch 二分法查找方式，查找有序数组中的一个数
    返回相应数值的索引下标。

     */

    public static void printList(List array) {
        for (Object i : array) {
            System.out.print(i + "\t");
        }
    }


    public static void printArray(int [] array) {
        for (int i : array) {
            System.out.print(i + "\t");
        }
    }

    public static int getIndex(int i,int [] array){
        int val = Arrays.binarySearch(array,i);
        return val;


    }
    public static void sortNumber(int [] array){
        Arrays.sort(array);
        printArray(array);


    }
    public static String toStringNumber(int [] array){
        String str = Arrays.toString(array);
        return str;


    }

    public static List toList(Integer [] array){
        List<Integer> ls1 = Arrays.asList(array);
        return ls1;




    }




    }




