package Printer;

public class FindA7 {
	public void findA7(String inputLine){
		for(int i=0; i<inputLine.length()-1;i++){
			if(inputLine.charAt(i)=='a'||inputLine.charAt(i)=='7'){
				System.out.println("Error : there is "+inputLine.charAt(i));
			}
		}
	}
}
