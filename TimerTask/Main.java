package TimerTask;

import java.util.Calendar;
import java.util.Timer;
import java.util.TimerTask;

public class Main {

	public static void main(String[] args) {
		
		Timer timer = new Timer();
		TimerTask task = new TimerTask() {
			int counter = 10;
			
			@Override
			public void run() {
				if(counter > 0) {
					System.out.println(counter);
					counter--;
				}
				else {
					System.out.println("HAPPY BIRTHDAY!!");
					timer.cancel();
				}
			}
		};
		
		Calendar date = Calendar.getInstance();
		date.set(Calendar.YEAR, 2023);
		date.set(Calendar.MONTH, Calendar.JUNE);
		date.set(Calendar.DAY_OF_MONTH, 17);
		date.set(Calendar.HOUR_OF_DAY, 0);
		date.set(Calendar.MINUTE, 0);
		date.set(Calendar.SECOND, 0);
		date.set(Calendar.MILLISECOND, 0);
		
		timer.scheduleAtFixedRate(task, 0, 1000);
	}

}
