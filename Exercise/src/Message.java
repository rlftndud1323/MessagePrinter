import java.time.LocalTime;

import com.tmax.pas1.track.one.InputPrinter;

import Printer.GetUserInput;
import Printer.ReversePrinter2;
import Printer.Time;
public class Message {

	 public static void main(String[] args){
		Time time=new Time();
		time.startTime();
		GetUserInput gui=new GetUserInput();
		String inputLine=gui.getUserInput();
		ReversePrinter2 a=new ReversePrinter2();
		String reverseMessage= a.getReverseMessage(inputLine);
		InputPrinter ip=new InputPrinter(reverseMessage);
		ip.print();
		time.endTime();
	
	 }
}
