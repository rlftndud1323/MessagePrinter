package Printer;
import java.time.LocalTime;

import com.tmax.pas1.track.one.InputPrinter;
import com.tmax.pas1.track.one.IPrinter;
public class InputPrinterWrapper extends InputPrinter{
	//������ jar ���Ͽ� �����ϴ� InputPrinter�� ������Ҹ� ��ӹ��� Ŭ����.
	//InputPrinterŬ������ ������ ���� �Ǵ� �߰��ϱ� ���ؼ� ����
	public static int timeCount=1; //start time�� ����ؾ��ϴ���, end time�� ����ؾ� �ϴ��� �Ǵ��ϱ� ���� ������ static ����
	private String changedMessage=null; 
	
	public InputPrinterWrapper(String message){
		super(message);
	}
	
	public void setChangedMessage(String message){
		this.changedMessage=message;
	//�޽����� ������ �ʿ䰡 �ִٸ�(starPrinter �Ǵ� reversePrinter ����) ����� message ���� ����
	} 
	
	@Override public void print(){
		if(changedMessage==null){
			super.print();   //inputPrinter���������� �Է¹��� �޽��� ������ ���
			this.time();     //end time ���
		}else{
			System.out.println(this.changedMessage); 
			//starPrinter �Ǵ� reversePrinter ���������� ����� �޽��� ���
			this.time(); //end time ���
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
			 timeCount++;}   //start time�� ����� ���� timeCount�� 2�� ����
		 else if(timeCount==2){
			 System.out.println("End time is "+time);
			 timeCount=1;}   //end time�� ����� ���� timeCount�� 1�� ����
	 }
	
	public boolean isStringToInteger(String message){ 
		try{
			Integer.parseInt(message);
			this.numberCalculator(message); //input���� ���� ���ڿ��� ���ڶ�� �������� ����ϴ� ���� ����
			System.exit(1); //������ ������ ������ ����
			return true;  //�μ��� ���� String ���� Integer�� ��ȯ�� �����ϸ�(���ڶ��) true ����
		}catch(Exception e){
			this.time();  //�μ��� ���� String ���� Integer�� ���� �Ұ����ϸ� start time ���
			this.findA7(message); //���ڿ��� a �Ǵ� 7�� ���ԵǾ� �ִ��� ����
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
