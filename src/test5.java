
public class test5 {

	public static void main(String[] args) {
		test:
			
		for(int i = 10;i>0;i--){
			for(int j = 0;j<3;j++){
				System.out.println(j+";"+i);
				
				if(i == 1){
					break test; //標籤
				}else if(i%2==0){
					continue;
				}
					
			}			
		}		
		
	}

}
