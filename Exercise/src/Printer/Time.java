package Printer;
import java.time.*;
public class Time {
 public void startTime(){

	 LocalTime startTime = LocalTime.now();
	 System.out.println("Start time is "+startTime);
 } //시작 시간을 출력하는 메소드
 public void endTime(){

	 LocalTime endTime = LocalTime.now();
	 System.out.println("End time is "+endTime);
 } // 종료 시간을 출력하는 메소드
}
