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
		String[] arr=originalMessage.split(" "); //arr[0]: 프린터 종류, arr[1]: 메시지 내용 (두 입력값은 띄어쓰기로 구분)
			
			if(!(arr[0].equalsIgnoreCase("StarPrinter")||arr[0].equalsIgnoreCase("ReversePrinter")
				||arr[0].equalsIgnoreCase("InputPrinter"))){
				System.out.println("올바른 프린터 이름을 입력하세요");
			} //프린터 종류가 StarPrinter, ReversePrinter, InputPrinter가 아니면 "올바른 프린터 이름을 입력하세요"라는 메시지 출력
			else if(m.isStringToInteger(arr[1])==true){
				System.out.println("Input is number"); 
				int inputNumber=Integer.parseInt(arr[1]);
				if(inputNumber>100 || inputNumber<=0){
					System.out.println("Calcuration is impossible");
				}else{
					System.out.println("100% "+arr[1]+" is "+100%inputNumber);
				}	
			}//메시지 내용이 0과 100 사이의 숫자이면 나머지를 출력하고, 범위에 해당하지 않는 숫자면 계산이 불가능하다는 메시지 출력
			else{
			time.startTime(); //시작 시간 출력
			a7.findA7(arr[1]); //a 또는 7 을 메시지 문자열에 포함 시 에러 메시지 출력
			if(arr[0].equalsIgnoreCase("StarPrinter")){ //
				StarPrinter sp=new StarPrinter();
				InputPrinter ip=new InputPrinter(sp.starMessage(arr[1]));
				ip.print();
				//StarPrinter 지정 후 메시지를 입력하면 메시지 앞뒤로 ***이 붙어서 출력
			}else if(arr[0].equalsIgnoreCase("ReversePrinter")){
				ReversePrinter2 rp=new ReversePrinter2();
				InputPrinter ip=new InputPrinter(rp.getReverseMessage(arr[1]));
				ip.print();
				//ReversePrinter 지정 후 메시지를 입력하면 메시지가 거꾸로 출력
			}else if(arr[0].equalsIgnoreCase("InputPrinter")){
				InputPrinter ip=new InputPrinter(arr[1]);
				ip.print();
				//InputPrinter 지정 후 메시지를 입력하면 메시지가 입력과 동일하게 출력
			}
		
			time.endTime(); //end time 출력
			}
			
		}
		
		
	
	
	
	public boolean isStringToInteger(String s){ 
		try{
			Integer.parseInt(s);
			return true;  //인수로 들어온 String 값이 Integer로 변환이 가능하면(숫자라면) true 리턴
		}catch(Exception e){
			return false; //인수로 들어온 String 값 중 한 글 자라도 숫자가 아니면 false 리턴
		}
	}
	
}
