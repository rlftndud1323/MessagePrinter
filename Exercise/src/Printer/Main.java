package Printer;
import com.tmax.pas1.track.one.IPrinter;
import com.tmax.pas1.track.one.InputPrinter;
public class Main {
	public static void main(String[] args){
		
		Time time=new Time();
		FindA7 a7=new FindA7();
		NumberCalculator calculator=new NumberCalculator();
		IPrinter interfacePrinter;
		Main m=new Main(); //Main 클래스 안에 있는 isStringToInteger 메소드 사용하기 위함
		
		if(args.length==0){
			System.out.println("Write printer name and your message");
			System.exit(1);
		}else{
			String printerName=args[0];
			String message=args[1];

		//프린터 이름이 올바른지 판단 & 올바르면 입력된 메시지가 숫자인지 판단 
			if(!(printerName.equalsIgnoreCase("StarPrinter")||printerName.equalsIgnoreCase("ReversePrinter")
				||printerName.equalsIgnoreCase("InputPrinter"))){
				System.out.println("Write right printer name");
			} //프린터 종류가 StarPrinter, ReversePrinter, InputPrinter가 아니면 "올바른 프린터 이름을 입력하세요"라는 메시지 출력
			
			else if(m.isStringToInteger(message)==true){
				calculator.numberCalculator(message);
			}//메시지 내용이 0과 100 사이의 숫자이면 나머지를 출력하고, 범위에 해당하지 않는 숫자면 계산이 불가능하다는 메시지 출력
			
			else{
			time.startTime(); //시작 시간 출력
			a7.findA7(message); //a 또는 7 을 메시지 문자열에 포함 시 에러 메시지 출력

			interfacePrinter=new SelectPrinter(message);
			interfacePrinter.print();
			
			time.endTime(); //end time 출력
			}
			
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
