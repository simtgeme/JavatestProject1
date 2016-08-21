
public class test2 {

	public static void main(String[] args) {
		int a = 10, b = 3;
		int c = 012; // 以0開頭 代表8進位
		int d = 0x12; // 16進位

		if(--a >=10 && b++ <=3) // 如果前面符合 則 &&後面的運算式則不進行
		{
			
		}
		
		if(--a >=10 & b++ <=3) //二進位運算 前式後式 皆會運作
		{}
		
		if(--a >=10 | b++ <=3)
		{}
		
		if(--a >=10 || b++ <=3)
		{}
		
	}

}
