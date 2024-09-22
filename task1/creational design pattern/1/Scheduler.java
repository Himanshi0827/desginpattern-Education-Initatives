import java.util.Timer;
import java.util.TimerTask;

public class Scheduler {
    public void schedule(SmartService service, long delay) {
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                service.execute();
            }
        }, delay);
        System.out.println("Service scheduled to run in " + delay / 1000 + " seconds.");
    }
}
