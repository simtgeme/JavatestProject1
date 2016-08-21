
public class test3 {

	public static void main(String[] args) {
		// switch
		int a = 10;

		int month = (int) (Math.random() * 12 + 1);

		System.out.println(month+"\n");
		
		switch (month) {
		case 1: case 3: case 5: case 7: case 8: // case 後面只能接不能變動的值
		case 10: case 12:
			System.out.println("31");
			break;
			
		case 4: case 6: case 9: case 11:
			System.out.println("30");
			break;
			
		case 2:
			System.out.println("28");
			break;
			
		default:
			System.out.println("Error:超出運算範圍");	
			break;
		}

	}

}
