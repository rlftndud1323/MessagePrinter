import com.tmax.pas1.track.one.InputPrinter;
import java.io.*;
import java.util.ArrayList;
public class ReversePrinter extends InputPrinter {
	
	public ReversePrinter(String reverseMessage){
		super(reverseMessage);
	} 
	
	public static void main(String[] args){
		String inputLine=null;
		String message=null;
		StringBuilder inputArray=new StringBuilder();
		
		try{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		inputLine=br.readLine();
		
		}catch(Exception e){
			e.printStackTrace();
		}
		for(int i=(inputLine.length()-1); i>=0 ;i--){
			inputArray.append(inputLine.charAt(i));
		}
		message=inputArray.toString();
		ReversePrinter rp=new ReversePrinter(message);
		rp.print();
	}
}
