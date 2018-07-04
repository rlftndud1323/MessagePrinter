package Printer;
import com.tmax.pas1.track.one.InputPrinter;
public class StarPrinter extends InputPrinter {
	public StarPrinter(){
		
		super("");
	}
	public String starMessage(String inputLine){
		StringBuilder sb=new StringBuilder();
		sb.append("***");
		sb.append(inputLine);
		sb.append("***");
		String starMessage=sb.toString();
		
		return starMessage;
	} //inputLine으로 들어온 메시지 앞뒤에 ***을 붙임
}
