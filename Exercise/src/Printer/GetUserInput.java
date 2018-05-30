package Printer;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class GetUserInput {
	public String getUserInput(){
		String inputLine=null;
		try{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		inputLine=br.readLine();
		}catch(Exception e){
			e.printStackTrace();
		}
		
		return inputLine;
		
	}
}