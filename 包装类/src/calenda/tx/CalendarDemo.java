package calenda.tx;

import org.omg.Messaging.SYNC_WITH_TRANSPORT;

import java.util.Calendar;

public class CalendarDemo {


    public static void main(String[] args) {
        Calendar ca = Calendar.getInstance();
        System.out.println(ca);
/*
        time=1571289689052
        ,areFieldsSet=true,
        areAllFieldsSet=true,
        lenient=true,
        zone=sun.util.calendar.ZoneInfo[id="Asia/Shanghai",
        offset=28800000,
        dstSavings=0,
        useDaylight=false,
        transitions=19,
        lastRule=null],
        firstDayOfWeek=1,
        minimalDaysInFirstWeek=1,
        ERA=1,YEAR=2019,MONTH=9,WEEK_OF_YEAR=42,WEEK_OF_MONTH=3,DAY_OF_MONTH=17
        ,DAY_OF_YEAR=290,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=1,
        HOUR_OF_DAY=13,MINUTE=21,SECOND=29,MILLISECOND=52,ZONE_OFFSET=28800000,
        DST_OFFSET=0]



*/
System.out.println(ca.get(Calendar.YEAR));
System.out.println(ca.get(Calendar.MONTH)+1);
System.out.println(ca.get(Calendar.DAY_OF_MONTH));
System.out.println(ca.get(Calendar.HOUR));
System.out.println(ca.get(Calendar.MINUTE));
System.out.println(ca.get(Calendar.SECOND));

System.out.print(ca.get(Calendar.YEAR)+"年"+(formatDateself(ca.get(Calendar.MONTH)+1))+"月"
        +formatDateself(ca.get(Calendar.DAY_OF_MONTH))+"日"+formatDateself(ca.get(Calendar.HOUR))+"时"+formatDateself(ca.get(Calendar.MINUTE))+"分");

deDate(ca);
ca.set(1982,9,16);
deDate(ca);





    }

   public static void deDate(Calendar ca){
        System.out.println();
      // Calendar ca = Calendar.getInstance();

      // System.out.print(ca.get(Calendar.YEAR)+"年"+(ca.get(Calendar.MONTH)+1)+"月"
       //        +ca.get(Calendar.DAY_OF_MONTH)+"日"+ca.get(Calendar.HOUR)+"时"+ca.get(Calendar.MINUTE)+"分  ");


       System.out.print(ca.get(Calendar.YEAR)+"年"+(formatDateself(ca.get(Calendar.MONTH)+1))+"月"
               +formatDateself(ca.get(Calendar.DAY_OF_MONTH))+"日"+formatDateself(ca.get(Calendar.HOUR))+"时"+formatDateself(ca.get(Calendar.MINUTE))+"分");
       System.out.println(weekEnd(ca.get(Calendar.DAY_OF_WEEK)));


   }

   public static String weekEnd(int i){
        String [] weekfirst = {"","星期天","星期一","星期二","星期三","星期四","星期五","星期六"};
        return weekfirst[i];



   }
   public static String formatDateself(int i){

       return i > 9? ""+i : "0"+ i;
   }

}
