package array;

public class MorningCode {
	public static void main(String[] args) {
//for반복문을 사용해서
		int sum = 1;
		int[][] intAry = new int[5][5];
		for(int i = 0; i < intAry.length; i++) {
			for(int j = 0; j < intAry.length; j++) {
				
				intAry[i][j] = sum++;	
			
				System.out.println("intAry["+i+", "+j+"] >" + intAry[i][j]);
				
				
				
			}
		} 
		int[][] intAry2 =
			{
					{1,2,3,4,5,},
					{11,12,33,44,55,},
					{1,2,3,4,5,},
					{1,2,3,4,5,},
					{1,2,3,4,5,}
			};
		
		System.out.println(intAry[4][3]);
		
		String[] strAry = { "Hello", "World" };
		for (String str : strAry) {
			System.out.println(str);
		}
		
		
	}
}
