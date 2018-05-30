import com.tmax.pas1.track.one.InputPrinter;
import java.util.Scanner;
public class StarMessage2 extends InputPrinter{
	public StarMessage2(String a){
		super(a);
		
		
	}
	public static void main(String[] args){
		String inputLine=null;
		Scanner sc=new Scanner(System.in);

			inputLine=sc.nextLine();

		
		StringBuilder sb=new StringBuilder();
		sb.append("***");
		sb.append(inputLine);
		sb.append("***");
		String starMessage=sb.toString();
		
//		InputPrinter ip=new InputPrinter(starMessage);
//		ip.print();
		
		StarMessage2 sm2=new StarMessage2(starMessage);
		sm2.print();
		
	}
	

	
	


}
