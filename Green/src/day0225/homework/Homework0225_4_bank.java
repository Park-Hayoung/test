package day0225.homework;

import java.util.Scanner;

/*
 (문제4) 아래와 같은 출력폼을 화면에 출력시킨후, 
'1:입금'을 선택하면, '적요:'를 적고, '입금액:'을 입력한다.
'2:출금'을 선택하면, '적요:'를 적고, '출금액:'을 입력한다.
'3:조회'를 선택하면, 지금까지 사용된 모든 내역을 출력시켜준다.
'4:종료'를 선택하면 프로그램을 종료한다.
('입금/출금'내역을 배열로 저장시켜두고, '조회'시 출력시킬 수 있게 처리한다)
*/
/*          * 금전출납부 *
---------------------------------------
1.입금  |  2.출금  |  3.조회  |  4.종료
---------------------------------------
선택> 1
적요> 용돈
입금액> 20000

          * 금전출납부 *
---------------------------------------
1.입금  |  2.출금  |  3.조회  |  4.종료
---------------------------------------
선택> 2
적요> 점심
출금액> 6000

          * 금전출납부 *
---------------------------------------
1.입금  |  2.출금  |  3.조회  |  4.종료
---------------------------------------
선택> 2
적요> 메가커피
출금액> 2000

          * 금전출납부 *
---------------------------------------
1.입금  |  2.출금  |  3.조회  |  4.종료
---------------------------------------
선택> 3

          * 입금/사용내역 *
---------------------------------------
내역      금액        적요
---------------------------------------
입금      20000      용돈
출금        6000      점심
출금        3000      메가커피
---------------------------------------
잔금      11000
---------------------------------------

          * 금전출납부 *
---------------------------------------
1.입금  |  2.출금  |  3.조회  |  4.종료
---------------------------------------
선택> 4

---------------------------------------
작업끝 : 용돈을 아껴씁시다.
---------------------------------------
 */
public class Homework0225_4_bank {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] money = new int[100];
		String[] object = new String[100];
		String[] type = new String[100];
		int num, cnt = 0;
		int balance = 0;

		System.out.println("\t\t* 금전출납부 *");

		while (true) {
			System.out.println("숫자를 입력해 원하는 실행을 선택해주세요.");
			System.out.println("-------------------------------------------");
			System.out.println("1.입금  |  2.출금  |  3.조회  |  4.종료");
			System.out.println("-------------------------------------------");
			System.out.print("선택> ");
			num = sc.nextInt();
			if (num == 4) {
				break;
			} else if (num < 0 || num > 4) {
				System.out.println("잘못된 수를 입력하셨습니다. 다시입력해주세요.");
			}
			
			if (num == 1) {
				System.out.print("적요> ");
				object[cnt] = sc.next();
				System.out.print("입금액> ");
				money[cnt] = sc.nextInt();
				balance += money[cnt];
				type[cnt] = "입금";
				cnt++;
			}
			if (num == 2) {
				System.out.print("적요> ");
				object[cnt] = sc.next();
				System.out.print("출금액> ");
				money[cnt] = sc.nextInt()*(-1);
				balance += money[cnt];
				type[cnt] = "출금";
				cnt++;
			}
			if (num == 3) {
				System.out.println("-------------------------------------------");
				System.out.println("내역\t금액\t적요");
				System.out.println("-------------------------------------------");
				for(int i=0; i < cnt; i++) {
					System.out.println(type[i] + "\t" + money[i] + "\t"+ object[i]);
				}
				System.out.println("-------------------------------------------");
				System.out.println("잔금 : " + balance);
				System.out.println("-------------------------------------------");
			}
		}
		System.out.println("-------------------------------------------");
		System.out.println("작업끝 : 용돈을 아껴씁시다.");
		System.out.println("-------------------------------------------");
		sc.close();
	}
}
