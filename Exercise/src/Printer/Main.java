package Printer;
import com.tmax.pas1.track.one.IPrinter;
import com.tmax.pas1.track.one.InputPrinter;
public class Main {
	public static void main(String[] args){
		
		Time time=new Time();
		FindA7 a7=new FindA7();
		NumberCalculator calculator=new NumberCalculator();
		IPrinter interfacePrinter;
		Main m=new Main(); //Main Ŭ���� �ȿ� �ִ� isStringToInteger �޼ҵ� ����ϱ� ����
		
		if(args.length==0){
			System.out.println("Write printer name and your message");
			System.exit(1);
		}else{
			String printerName=args[0];
			String message=args[1];

		//������ �̸��� �ùٸ��� �Ǵ� & �ùٸ��� �Էµ� �޽����� �������� �Ǵ� 
			if(!(printerName.equalsIgnoreCase("StarPrinter")||printerName.equalsIgnoreCase("ReversePrinter")
				||printerName.equalsIgnoreCase("InputPrinter"))){
				System.out.println("Write right printer name");
			} //������ ������ StarPrinter, ReversePrinter, InputPrinter�� �ƴϸ� "�ùٸ� ������ �̸��� �Է��ϼ���"��� �޽��� ���
			
			else if(m.isStringToInteger(message)==true){
				calculator.numberCalculator(message);
			}//�޽��� ������ 0�� 100 ������ �����̸� �������� ����ϰ�, ������ �ش����� �ʴ� ���ڸ� ����� �Ұ����ϴٴ� �޽��� ���
			
			else{
			time.startTime(); //���� �ð� ���
			a7.findA7(message); //a �Ǵ� 7 �� �޽��� ���ڿ��� ���� �� ���� �޽��� ���

			interfacePrinter=new SelectPrinter(message);
			interfacePrinter.print();
			
			time.endTime(); //end time ���
			}
			
		}
		
		
	}
	
	
	public boolean isStringToInteger(String s){ 
		try{
			Integer.parseInt(s);
			return true;  //�μ��� ���� String ���� Integer�� ��ȯ�� �����ϸ�(���ڶ��) true ����
		}catch(Exception e){
			return false; //�μ��� ���� String �� �� �� �� �ڶ� ���ڰ� �ƴϸ� false ����
		}
	}
	
}
