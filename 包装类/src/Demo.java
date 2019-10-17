import org.omg.Messaging.SYNC_WITH_TRANSPORT;

public class Demo {
    public static void main (String [] args){
    byte b = 1;
    Byte bs = new Byte("15");
    System.out.println(bs);

    Byte bs1 = new Byte(b);
    System.out.println(bs1);

//Constructor and Description
//Byte(byte value)
//构造一个新分配的 Byte对象，该对象表示指定的 byte值。
//Byte(String s)
//构造一个新分配 Byte对象，表示 byte由指示值 String参数

        Integer I1 = new Integer(120);
        Integer I2 = new Integer("90");
        System.out.println(I1);
        System.out.println(I2);
        //int <> Integer之间的值互相转换。
        int x = I1.intValue();
        System.out.println(x);

        // String <> Integer 之间的互相转换。需要保障字符串是数值类型，保证字符串不是空的。

        Integer I3 = new Integer("90");
        Integer I4 = Integer.valueOf("123");
        System.out.println(I4);
        System.out.println(I3);
    // String --- int
        int I5 = Integer.parseInt("99999");
        System.out.println(I5);



    //三种方式，Integer装成String ;
        Integer I6 = new Integer("19");
        if (I6.getClass().equals(Integer.class)){
            System.out.println(I6+" 是一个包装整数类对象");

        }
        String I7 = I6.toString();
        String I8 = I6 + " ";

        if (I8 instanceof String){

            System.out.println(I8+"是一个字符串类型");
        }

        String I9 = String.valueOf(I6);
        if (I9.getClass().equals(String.class)){
            System.out.println(I9+" 是一个字符串类型");


        }
        System.out.println(I6);
        System.out.println(I7);
        System.out.println(I8);
        System.out.println(I9);
        //System.out.println(I6);







    }
}
