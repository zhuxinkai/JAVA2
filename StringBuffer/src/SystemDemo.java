public class SystemDemo {
    public static void main(String [] args) throws InterruptedException {
          long startTime = System.currentTimeMillis();
        //编译器会自动生成一个异常处理。 throws InterruptedException
          Thread.sleep(100);
          long endTime = System.currentTimeMillis();

          long resultTime = endTime - startTime;
          System.out.println(resultTime);
          //退出JVM;

          //System.exit(0);

          //运行垃圾回收期
          System.gc();
          System.out.println(System.getProperty("os.name"));

          int [] array1 = {1,213,123,123,123,424,13,};
          int [] array2 = {983,212,21};
          //System.arraycopy 的参数，
        //第一个参数，源数组。
        //第二个参数，源数组的起始位置。
        //第三个参数，目标数组。
        //第四个参数，目标数组的起始索引。
        //第五个参数，拷贝的长度。
          System.arraycopy(array2,0,array1,2,3);
          //1,213,983,212,21,424,13
          for(int i = 0; i< array1.length;i++){

              System.out.print(array1[i]+"\t");
          }
    }
}
