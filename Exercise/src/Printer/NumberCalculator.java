package Printer;

public class NumberCalculator {
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
