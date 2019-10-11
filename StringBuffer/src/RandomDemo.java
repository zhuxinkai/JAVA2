import java.util.Random;

public class RandomDemo {
    public static void main(String[] args) {

        double val = Math.random();
        System.out.println(val);
        //获得1-100 的随机整数。


        //整数的转换格式。   (int)非整数值得数字；
        int val2 = (int) (Math.floor(Math.random() * 100) + 1);

        System.out.println(val2);
        //在主方法中执行得方法，是需要在同类中，类级别得方法。（即带有static 标识得）；

        printRandom();

        System.out.println("下面得是作弊得哦，每次生成得随机数都是固定得一组值-------");
        printRandomSeed();



            }

    public static void printRandom () {

        Random rd = new Random();
        for (int j = 0; j < 10; j++) {
            //获取int得范围区间。
            int i = rd.nextInt(10);
            float f = rd.nextFloat();

            System.out.println("通过random对象获取得整形随机数" + i);
            // System.out.println("通过random对象获取得整形随机数"+f);

        }
    }
        public static void printRandomSeed () {
            //Random 构造器得方式，放入种子，使得每次得随机数都带有一定得规律性。

            Random rd = new Random(4567l);
            for (int j = 0; j < 10; j++) {
                //获取int得范围区间。
                //生成随机数得时候，指定bound参数，指定生成得范围。

                int i = rd.nextInt(100);
                float f = rd.nextFloat();

                System.out.println("通过random对象获取得整形随机数" + i);
                // System.out.println("通过random对象获取得整形随机数"+f);

            }

        }


    }

