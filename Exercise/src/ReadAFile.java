import java.io.*;
public class ReadAFile {
	public static void main(String[] args){
		try{
			File myFile=new File("MyText.txt");
			FileReader fileReader=new FileReader(myFile);
			BufferedReader reader=new BufferedReader(fileReader);
			
			String line=null;  // 행을 읽어올때마다 각 행을 저장하기 위한 String변수
			
			while((line=reader.readLine())!=null){
				System.out.println(line);
			}
			reader.close();
		}catch(Exception ex){
			ex.printStackTrace();
			
		}
	}
}
