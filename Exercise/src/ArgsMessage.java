import com.tmax.pas1.track.one.InputPrinter;
class ArgsMessage {
	
	public static void main(String[] args){
		String add="";
		for(String str:args){
		add+=str;
		
		}
		InputPrinter a=new InputPrinter(add);
		a.print();
	}
}
