public class StringBufferDemo {
    public static void main (String [] args){
        StringBuffer bs = new StringBuffer();
        bs.append("HELLO WORLD");
        System.out.println(bs);
        System.out.println(bs.length());
        System.out.println(bs.capacity());

        StringBuffer bs1 = new StringBuffer(20);
        System.out.println(bs1.length());
        System.out.println(bs1.capacity());

        StringBuffer bs2 = new StringBuffer("HELLO ZHUXINKAI");
        System.out.println(bs2.length());
        System.out.println(bs2.capacity());

        StringBuffer bs3 = new StringBuffer("HELLO ZHUXINKAI");
        System.out.println(bs3.length());
        bs3.append(new char[] {' ','l','o','v','e'});
        System.out.println(bs3);
        System.out.println(bs3.length());
        System.out.println(bs3.capacity());

        bs3.insert(bs3.length(),new char[] {' ','l','i','u','s','h','a'},0,7 );
        System.out.println(bs3);







    }
}
