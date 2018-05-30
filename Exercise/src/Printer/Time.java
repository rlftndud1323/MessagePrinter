package Printer;
import java.time.*;
public class Time {
 public void startTime(){

	 LocalTime startTime = LocalTime.now();
	 System.out.println("Start time is "+startTime);
 }
 public void endTime(){

	 LocalTime endTime = LocalTime.now();
	 System.out.println("End time is "+endTime);
 }
}
