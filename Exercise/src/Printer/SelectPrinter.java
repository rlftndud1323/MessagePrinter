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
			//StarPrinter 지정 후 메시지를 입력하면 메시지 앞뒤로 ***이 붙어서 출력
		}else if(message.equalsIgnoreCase("ReversePrinter")){
			ReversePrinter2 rp=new ReversePrinter2();
			InputPrinter ip=new InputPrinter(rp.getReverseMessage(message));
			//ReversePrinter 지정 후 메시지를 입력하면 메시지가 거꾸로 출력
		}else if(message.equalsIgnoreCase("InputPrinter")){
			InputPrinter ip=new InputPrinter(message);

			//InputPrinter 지정 후 메시지를 입력하면 메시지가 입력과 동일하게 출력
		}
	}
}
