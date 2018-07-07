package Printer;
import com.tmax.pas1.track.one.IPrinter;

public class SelectPrinter extends InputPrinterWrapper {
	public SelectPrinter(String printerName, String message){
		//super(message);
		super(message);
		selectPrinter(printerName, message);
	}
	
	public void selectPrinter(String printerName, String message){

	//	InputPrinterWrapper ip=new InputPrinterWrapper(message);
		boolean stringOrInteger=this.isStringToInteger(message);
		
		if(stringOrInteger==false){
			if(printerName.equalsIgnoreCase("StarPrinter")){ //
				StarPrinter sp=new StarPrinter();
				this.setChangedMessage(sp.starMessage(message));
		//		ip.print();
				//StarPrinter ���� �� �޽����� �Է��ϸ� �޽��� �յڷ� ***�� �پ ���
			}else if(printerName.equalsIgnoreCase("ReversePrinter")){
				ReversePrinter2 rp=new ReversePrinter2();
				this.setChangedMessage(rp.getReverseMessage(message));
			//	ip=new InputPrinterWrapper(rp.getReverseMessage(message));
				//ReversePrinter ���� �� �޽����� �Է��ϸ� �޽����� �Ųٷ� ���
			}else if(printerName.equalsIgnoreCase("InputPrinter")){
				//ip=new InputPrinterWrapper(message);
				//InputPrinter ���� �� �޽����� �Է��ϸ� �޽����� �Է°� �����ϰ� ���
			}else{
				System.out.println("Write right printer name");
				System.exit(1);
			}
		
		}
	}
}
