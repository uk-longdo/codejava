import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class TryTest {
	public static void main(String[] args) {
		InputStream input = null;
		try {
			try {
				input = new FileInputStream("1223\\hello.txt");
			} catch (FileNotFoundException e1) {

				e1.printStackTrace();
			}
			int data = 0;
			
			for(;;){
				try {
					data = input.read();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				if(data ==-1) break;
			} 
		} finally {
			
		}
	}
}
