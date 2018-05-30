package Printer;

public class FindA7 {
	public void findA7(String inputLine){
		for(int i=0; i<inputLine.length();i++){
			if(inputLine.charAt(i)=='a'||inputLine.charAt(i)=='7'){
				System.out.println("Error : there is "+inputLine.charAt(i));
			}//inputLine에 들어온 메시지가 a 또는 7을 포함하고 있으면 에러 메시지 출력

		}
	}
}
