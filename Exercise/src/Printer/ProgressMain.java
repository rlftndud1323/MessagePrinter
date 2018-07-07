package Printer;

import com.tmax.pas1.track.one.IPrinter;
import Printer.InputPrinterWrapper;

public class ProgressMain {
	public static void main(String[] args){
		
		
		if(args.length==0){
			System.out.println("Write printer name and your message");
			System.exit(1);
		}else{
			String printerName=args[0];
			String message=args[1];
			
			if(!(printerName.equalsIgnoreCase("StarPrinter")||printerName.equalsIgnoreCase("ReversePrinter")
					||printerName.equalsIgnoreCase("InputPrinter"))){
					System.out.println("Write right printer name");
					System.exit(1);
				} //������ ������ StarPrinter, ReversePrinter, InputPrinter�� �ƴϸ� "�ùٸ� ������ �̸��� �Է��ϼ���"��� �޽��� ���
			
			IPrinter interfacePrinter;
			interfacePrinter=new SelectPrinter(printerName, message);
			interfacePrinter.print();
			
		}
		
	}
}
