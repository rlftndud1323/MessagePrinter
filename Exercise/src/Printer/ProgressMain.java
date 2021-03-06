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
			//PrinterName과 message를 args로 받아온다
			if(!(printerName.equalsIgnoreCase("StarPrinter")||printerName.equalsIgnoreCase("ReversePrinter")
					||printerName.equalsIgnoreCase("InputPrinter"))){
					System.out.println("Write right printer name");
					System.exit(1);
				} //프린터 종류가 StarPrinter, ReversePrinter, InputPrinter가 아니면 "올바른 프린터 이름을 입력하세요"라는 메시지 출력
			
			IPrinter interfacePrinter;
			interfacePrinter=new SelectPrinter(printerName, message);
			interfacePrinter.print();
			//args로 입력받은 프린터에 메시지를 보내서 가공한 후 알맞은 메시지 출력
		}
		
	}
}
