package Printer;
import java.time.LocalTime;

import com.tmax.pas1.track.one.InputPrinter;
import com.tmax.pas1.track.one.IPrinter;
public class InputPrinterWrapper extends InputPrinter{
	//참조한 jar 파일에 존재하는 InputPrinter의 구성요소를 상속받은 클래스.
	//InputPrinter클래스의 내용을 수정 또는 추가하기 위해서 만듦
	public static int timeCount=1; //start time을 출력해야하는지, end time을 출력해야 하는지 판단하기 위해 선언한 static 변수
	private String changedMessage=null; 
	
	public InputPrinterWrapper(String message){
		super(message);
	}
	
	public void setChangedMessage(String message){
		this.changedMessage=message;
	//메시지가 가공될 필요가 있다면(starPrinter 또는 reversePrinter 지정) 출력할 message 내용 변경
	} 
	
	@Override public void print(){
		if(changedMessage==null){
			super.print();   //inputPrinter지정했으면 입력받은 메시지 내용대로 출력
			this.time();     //end time 출력
		}else{
			System.out.println(this.changedMessage); 
			//starPrinter 또는 reversePrinter 지정했으면 변경된 메시지 출력
			this.time(); //end time 출력
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
			 timeCount++;}   //start time을 출력한 다음 timeCount를 2로 변경
		 else if(timeCount==2){
			 System.out.println("End time is "+time);
			 timeCount=1;}   //end time을 출력한 다음 timeCount를 1로 변경
	 }
	
	public boolean isStringToInteger(String message){ 
		try{
			Integer.parseInt(message);
			this.numberCalculator(message); //input으로 들어온 문자열이 숫자라면 나머지를 출력하는 연산 수행
			System.exit(1); //나눗셈 연산이 끝나면 종료
			return true;  //인수로 들어온 String 값이 Integer로 변환이 가능하면(숫자라면) true 리턴
		}catch(Exception e){
			this.time();  //인수로 들어온 String 값이 Integer로 변경 불가능하면 start time 출력
			this.findA7(message); //문자열에 a 또는 7이 포함되어 있는지 점검
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
