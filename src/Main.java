import java.sql.Time;
import java.util.Calendar;
import java.util.Timer;
import java.util.TimerTask;

public class Main {

    public static void main(String[] args) {

      Timer tiemr=new Timer();

        TimerTask task=new TimerTask() {

            int count=10;

            @Override
            public void run() {

                if (count>0){
                    System.out.println(count+ " seconds");
                    count--;
                }else {
                    System.out.println("HAPPY NEW YEAR !");
                    tiemr.cancel();
                }


            }
        };

       /* Calendar date=Calendar.getInstance();
        date.set(Calendar.YEAR,2021);
        date.set(Calendar.MONTH,Calendar.AUGUST);
        date.set(Calendar.DAY_OF_MONTH,21);
        date.set(Calendar.HOUR_OF_DAY,0);
        date.set(Calendar.MINUTE,0);
        date.set(Calendar.SECOND,0);
        date.set(Calendar.MILLISECOND,0);

        */
        Calendar date=Calendar.getInstance();
        date.set(Calendar.YEAR,2021);
        date.set(Calendar.MONTH,Calendar.DECEMBER);
        date.set(Calendar.DAY_OF_MONTH,31);
        date.set(Calendar.HOUR_OF_DAY,23);
        date.set(Calendar.MINUTE,59);
        date.set(Calendar.SECOND,50);
        date.set(Calendar.MILLISECOND,0);


        //tiemr.schedule(task,3000);

       // tiemr.schedule(task,date.getTime());

        tiemr.scheduleAtFixedRate(task,date.getTime(),1000);


    }

}
