package Printer;
import com.tmax.pas1.track.one.InputPrinter;
import java.io.*;
public class ReversePrinter2 extends InputPrinter{
	private String reverseMessage;
	public ReversePrinter2(){
		super(""); 
		
	} 
	
	public String getReverseMessage(String inputLine){
	
		StringBuilder inputArray=new StringBuilder(); 
		for(int i=(inputLine.length()-1); i>=0 ;i--){
			inputArray.append(inputLine.charAt(i));
		}  //inputLine으로 들어온 메시지를 한 글자씩 잘라서 거꾸로 재배열
		reverseMessage=inputArray.toString();
		return reverseMessage;
	}


}
