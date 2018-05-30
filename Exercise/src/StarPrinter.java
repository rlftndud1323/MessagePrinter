
import com.tmax.pas1.track.one.InputPrinter;
import java.util.Scanner;

public class StarPrinter extends InputPrinter {
	private String starMessage; 
	public StarPrinter(){
		super(""); //superclass의 기본 생성자 호출	
	}
	public static void main(String[] args){
		StarPrinter sp=new StarPrinter();
		String normalMessage=sp.getInputLine();
		sp.plusStar(normalMessage);
			
		sp.callInpuPrinter();
		
	}
	
	public String getInputLine(){
		String inputLine=null;
		
		try{
			Scanner sc=new Scanner(System.in);
			inputLine=sc.nextLine();
		}catch(Exception e){
			e.printStackTrace();
		}
		return inputLine;
	}
	
	public void plusStar(String str){
		StringBuilder getStar=new StringBuilder();
		getStar.append("***");
		getStar.append(str);
		getStar.append("***");
		this.starMessage=getStar.toString();
	}
	
	public void callInpuPrinter(){
		InputPrinter ip=new InputPrinter(this.starMessage);
	}

}
