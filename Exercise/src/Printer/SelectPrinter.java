package Printer;
import com.tmax.pas1.track.one.IPrinter;
import com.tmax.pas1.track.one.InputPrinter;
public class SelectPrinter extends InputPrinter {
	public SelectPrinter(String message){
		super(message);
	}
	
	public void selectPrinter(String message){

		
		
		if(message.equalsIgnoreCase("StarPrinter")){ //
			StarPrinter sp=new StarPrinter();
			InputPrinter ip=new InputPrinter(sp.starMessage(message));
			//StarPrinter ���� �� �޽����� �Է��ϸ� �޽��� �յڷ� ***�� �پ ���
		}else if(message.equalsIgnoreCase("ReversePrinter")){
			ReversePrinter2 rp=new ReversePrinter2();
			InputPrinter ip=new InputPrinter(rp.getReverseMessage(message));
			//ReversePrinter ���� �� �޽����� �Է��ϸ� �޽����� �Ųٷ� ���
		}else if(message.equalsIgnoreCase("InputPrinter")){
			InputPrinter ip=new InputPrinter(message);

			//InputPrinter ���� �� �޽����� �Է��ϸ� �޽����� �Է°� �����ϰ� ���
		}
	}
}
