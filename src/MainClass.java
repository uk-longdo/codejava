
public class MainClass {
	public static void main(String[] args) {
		int i = 10;
		int r = 0;
		int j = 0;
		
		System.out.println("before");
		
		try {
			r = i/j;			
		} catch (Exception e) {
			e.printStackTrace();
			String msg = e.getMessage();
			System.out.println("msg" +msg);
		}
		

		
		System.out.println("after");
		
	}
}
