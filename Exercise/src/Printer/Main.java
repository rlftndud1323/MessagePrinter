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
		//�Է°��� �޴´�
		String[] arr=originalMessage.split(" "); //arr[0]: ������ ����, arr[1]: �޽��� ���� (�� �Է°��� ����� ����)
			
			if(!(arr[0].equalsIgnoreCase("StarPrinter")||arr[0].equalsIgnoreCase("ReversePrinter")
				||arr[0].equalsIgnoreCase("InputPrinter"))){
				System.out.println("�ùٸ� ������ �̸��� �Է��ϼ���");
			} //������ ������ StarPrinter, ReversePrinter, InputPrinter�� �ƴϸ� "�ùٸ� ������ �̸��� �Է��ϼ���"��� �޽��� ���
			else if(m.isStringToInteger(arr[1])==true){
				System.out.println("Input is number"); 
				int inputNumber=Integer.parseInt(arr[1]);
				if(inputNumber>100 || inputNumber<=0){
					System.out.println("Calcuration is impossible");
				}else{
					System.out.println("100% "+arr[1]+" is "+100%inputNumber);
				}	
			}//�޽��� ������ 0�� 100 ������ �����̸� �������� ����ϰ�, ������ �ش����� �ʴ� ���ڸ� ����� �Ұ����ϴٴ� �޽��� ���
			else{
			time.startTime(); //���� �ð� ���
			a7.findA7(arr[1]); //a �Ǵ� 7 �� �޽��� ���ڿ��� ���� �� ���� �޽��� ���
			if(arr[0].equalsIgnoreCase("StarPrinter")){ //
				StarPrinter sp=new StarPrinter();
				InputPrinter ip=new InputPrinter(sp.starMessage(arr[1]));
				ip.print();
				//StarPrinter ���� �� �޽����� �Է��ϸ� �޽��� �յڷ� ***�� �پ ���
			}else if(arr[0].equalsIgnoreCase("ReversePrinter")){
				ReversePrinter2 rp=new ReversePrinter2();
				InputPrinter ip=new InputPrinter(rp.getReverseMessage(arr[1]));
				ip.print();
				//ReversePrinter ���� �� �޽����� �Է��ϸ� �޽����� �Ųٷ� ���
			}else if(arr[0].equalsIgnoreCase("InputPrinter")){
				InputPrinter ip=new InputPrinter(arr[1]);
				ip.print();
				//InputPrinter ���� �� �޽����� �Է��ϸ� �޽����� �Է°� �����ϰ� ���
			}
		
			time.endTime(); //end time ���
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
