package Printer;

public class StarPrinter extends InputPrinterWrapper {
	public StarPrinter(){
		
		super("");
	}
	public String starMessage(String inputLine){
		StringBuilder sb=new StringBuilder();
		sb.append("***");
		sb.append(inputLine);
		sb.append("***");
		String starMessage=sb.toString();
		
		return starMessage;
	} //inputLine���� ���� �޽��� �յڿ� ***�� ����
}
