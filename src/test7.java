
public class test7 {

	public static void main(String[] args) {

		char b = 10;
		int[] a = new int[b]; // 陣列裡面只接受 int,byte,char; 值
				
		int[][][] c ={{{0,0,0,0,0},{1,1,1,1,1,1}},{{2},{3,3,3,33,},{153}},{{465}}}; 
		
		//foreach
		for(int v:a)
		{
			System.out.println(v);			
		}
		
		for(int[][] v : c)
		{
			for(int[] v1:v)
			{
				for(int v2 : v1)
				{
					
					System.out.println(v2);
					
				}
			}
			
		}
	}

}
