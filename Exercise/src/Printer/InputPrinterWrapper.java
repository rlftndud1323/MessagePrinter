package Printer;
import java.time.LocalTime;

import com.tmax.pas1.track.one.InputPrinter;
import com.tmax.pas1.track.one.IPrinter;
public class InputPrinterWrapper extends InputPrinter{
	public static int timeCount=1;
	private String changedMessage=null;
	
	public InputPrinterWrapper(String message){
		super(message);
	}
	
	public void setChangedMessage(String message){
		this.changedMessage=message;
	
	} 
	
	@Override public void print(){
		if(changedMessage==null){
			super.print();
			this.time();
		}else{
			System.out.println(this.changedMessage);
			this.time();
		}
	}
	public void findA7(String inputLine){
		for(int i=0; i<inputLine.length();i++){
			if(inputLine.charAt(i)=='a'||inputLine.charAt(i)=='7'){
				System.out.println("Error : there is "+inputLine.charAt(i));
			}//inputLine에 들어온 메시지가 a 또는 7을 포함하고 있으면 에러 메시지 출력

		}
	}

	public static void time(){
		
		 LocalTime time = LocalTime.now();
		 if(timeCount==1){
			 System.out.println("Start time is "+time);
			 timeCount++;}
		 else if(timeCount==2){
			 System.out.println("End time is "+time);
			 timeCount=1;}
	 }
	
	public boolean isStringToInteger(String message){ 
		try{
			Integer.parseInt(message);
			this.numberCalculator(message);
			System.exit(1);
			return true;  //인수로 들어온 String 값이 Integer로 변환이 가능하면(숫자라면) true 리턴
		}catch(Exception e){
			this.time();
			this.findA7(message);
			return false; //인수로 들어온 String 값 중 한 글 자라도 숫자가 아니면 false 리턴
		}
	}
	
	public void numberCalculator(String message){
		System.out.println("Input is number"); 
		int inputNumber=Integer.parseInt(message);
		if(inputNumber>100 || inputNumber<=0){
			System.out.println("Calcuration is impossible");
		}else{
			System.out.println("100% "+message+" is "+100%inputNumber);
		}	
	}




}
