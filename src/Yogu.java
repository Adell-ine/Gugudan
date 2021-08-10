import java.util.Scanner;

public class Yogu {
	
	public static void main(String[] args) {

		System.out.println("원하는 구구단 단수를 입력하세요.");
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		
		int[] result = new int[number];
		
		if (number < 2) {
			System.out.println("값을 잘못 입력했습니다.");
		} else if (number>19) {
			System.out.println("값을 잘못 입력했습니다.");
 		} else {
 			for(int j =2; j<number+1; j++) {
 				
 				System.out.println(j+"단");
 				
 				for(int i = 0; i < result.length; i++) {
 					
 					result[i] = j * (i + 1);
 					
 					System.out.println(j+"*"+(i+1)+"="+result[i]);
 					
 				
 					}
 				System.out.println();
 				}
		
 			}
		}

	}
