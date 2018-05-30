package Printer;
import com.tmax.pas1.track.one.InputPrinter;
import java.util.ArrayList;
public class Main {
	public static void main(String[] args){
		GetUserInput message=new GetUserInput();
		Time time=new Time();
		FindA7 a7=new FindA7();
		Main m=new Main();
		String originalMessage=message.getUserInput();
		//입력값을 받는다
		String[] arr=originalMessage.split(" ");
			
			if(!(arr[0].equalsIgnoreCase("StarPrinter")||arr[0].equalsIgnoreCase("ReversePrinter")
				||arr[0].equalsIgnoreCase("InputPrinter"))){
				System.out.println("올바른 프린터 이름을 입력하세요");
			}
			else if(m.isStringToInteger(arr[1])==true){
				System.out.println("Input is number");
				int inputNumber=Integer.parseInt(arr[1]);
				if(inputNumber>100 || inputNumber<=0){
					System.out.println("Calcuration is impossible");
				}else{
					System.out.println("100% "+arr[1]+" is "+100%inputNumber);
				}	
			}
			else{
			time.startTime();
			a7.findA7(arr[1]);
			if(arr[0].equalsIgnoreCase("StarPrinter")){
				StarPrinter sp=new StarPrinter();
				InputPrinter ip=new InputPrinter(sp.starMessage(arr[1]));
				ip.print();
				
			}else if(arr[0].equalsIgnoreCase("ReversePrinter")){
				ReversePrinter2 rp=new ReversePrinter2();
				InputPrinter ip=new InputPrinter(rp.getReverseMessage(arr[1]));
				ip.print();
			}else if(arr[0].equalsIgnoreCase("InputPrinter")){
				InputPrinter ip=new InputPrinter(arr[1]);
				ip.print();
			}
		
			time.endTime();
			}
			
		}
		
		
	
	
	
	public boolean isStringToInteger(String s){
		try{
			Integer.parseInt(s);
			return true;
		}catch(Exception e){
			return false;
		}
	}
	
}
