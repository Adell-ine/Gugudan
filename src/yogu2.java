import java.util.Scanner;

public class yogu2 {
	
	public static void main(String[] args) {
		
		System.out.println("출력하기 원하는 구구단 값을 입력하세요.(예 : 2,3)");
		Scanner scanner = new Scanner(System.in);
		String inputValue = scanner.nextLine();
		
		String[] splitedValue = inputValue.split(",");
		
		int first = Integer.parseInt(splitedValue[0]);
		int second = Integer.parseInt(splitedValue[1]);
		
		int[] result = new int[second];
		
		
 			for(int j =2; j< first+1; j++) {
 				
 				System.out.println(j+"단");
 				
 				for(int i = 0; i < result.length; i++) {
 					
 					result[i] = j * (i + 1);
 					
 					System.out.println(j+"*"+(i+1)+"="+result[i]);
		
 					}
 				System.out.println();
 				
 		}
	}
}
