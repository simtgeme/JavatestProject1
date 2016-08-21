import java.util.ArrayList;

public class test6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean[] c = new boolean[4]; // 初始化為false
		char[] b = new char[4];//  new的意義為 產生一區塊記憶體儲存 char 然後將此地址傳給變數b，因此 b 為地址
		
		char[] q = new char[4];
		char[] p = {'a','b','c','e'};
		
		double[] e = new double[4]; // 初始化為0.0
		
		b = p;
				
		q[0] = 'a';
		q[1] = 'b';
		q[2] = 'c';
		q[3] = 'd';
				
		//System.out.println(b[0]+"\t"+b[1]+"\t"+b[2]+"\t"+b[3]+"\t");
		
		ArrayList<Integer> collect_num = new ArrayList<>();

		for (int i = 0; i < 6; i++) {
			int a = 0;
			collect_num.add(a);
		}

		for(int i =0;i<10000000;i++)
		{
			int point = (int)(Math.random()*9+1);
			
			if(point >6)
				point = point-3;
			
			collect_num.set(point-1, collect_num.get(point-1)+1);			
		}
		
		for(int i =0;i<6;i++)
		{
			System.out.println(collect_num.get(i) +"\t");			
		}
		
	}

}
