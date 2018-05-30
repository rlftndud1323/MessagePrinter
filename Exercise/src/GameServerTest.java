import java.io.*;

public class GameServerTest {
	public void main(String[] args){
		GameCharacter one=new GameCharacter(50, "Elf", new String[] {"bow", "sword", "dust"});
		GameCharacter two=new GameCharacter(200, "Troll", new String[] {"bare hands", "big ax"});
		GameCharacter three=new GameCharacter(120, "Megician", new String[] {"spells", "invisibility"});
		
		try{
			FileOutputStream fo=new FileOutputStream("Game.set");
			ObjectOutputStream os=new ObjectOutputStream(fo);
			os.writeObject(one);
			os.writeObject(two);
			os.writeObject(three); // serialization�� ����
			
			os.close(); //fileoutputstream���� ����

		}catch(IOException ex){
			ex.printStackTrace();
		}
		
		one=null;
		two=null;
		three=null;     //null�� �����ϸ� ���� �ִ� ��ü�� ������ �� ����
		
		try{
			ObjectInputStream is=new ObjectInputStream(new FileInputStream("Game.set"));
			GameCharacter oneRestore=(GameCharacter) is.readObject();
			GameCharacter twoRestore=(GameCharacter) is.readObject();
			GameCharacter threeRestore=(GameCharacter) is.readObject(); 
			//Object ������ ��ü�� ���⶧���� GameCharacter�� ĳ��Ʈ
			
			System.out.println("one's type: "+oneRestore.getType());
			System.out.println("two's type: "+twoRestore.getType());
			System.out.println("three's type: "+threeRestore.getType());
			
		}catch(Exception ex){
			ex.printStackTrace();
		}
	}
}
