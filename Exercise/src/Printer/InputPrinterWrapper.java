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
			}//inputLine�� ���� �޽����� a �Ǵ� 7�� �����ϰ� ������ ���� �޽��� ���

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
			return true;  //�μ��� ���� String ���� Integer�� ��ȯ�� �����ϸ�(���ڶ��) true ����
		}catch(Exception e){
			this.time();
			this.findA7(message);
			return false; //�μ��� ���� String �� �� �� �� �ڶ� ���ڰ� �ƴϸ� false ����
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
