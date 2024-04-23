package basic.exercise;

import java.util.Scanner;

import basic.exercise.PhoneBook;

public class PhoneBookManager {
	static int LAST_INDEX_NUMBER = 0;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		PhoneBook[] PB = new PhoneBook[100];

		PB[0] = new PhoneBook("01000000001", "신");
		PB[1] = new PhoneBook("01000000002", "나");
		PB[2] = new PhoneBook("01000000003", "최");
		PB[3] = new PhoneBook("01000000003", "박");
		PB[4] = new PhoneBook("01000000004", "이");
		PB[5] = new PhoneBook("01000000005", "김");
		LAST_INDEX_NUMBER = 99;

		final String SAVE = "1";
		final String SEARCH_ALL = "2";
		final String SEARCH_BY_TITLE = "3";
		final String FIX = "4";
		final String DELETE = "5";
		final String END = "0";
		boolean flag = true;

		while (flag) {
			System.out.println("**메뉴 선택**");
			System.out.println("1.저장 2.전체조회 3.선택조회 4.수정 5.선택삭제 0.프로그램종료");

			// 문자열 + 다음줄로 이동 처리
			String selectedNumber = sc.nextLine();
			if (selectedNumber.equals(SAVE)) {
				System.out.println(">>저장하기<<");
				save(sc, PB);
			} else if (selectedNumber.equals(SEARCH_ALL)) {
				System.out.println(">>전체 조회 하기<<");
				readAll(PB);
			} else if (selectedNumber.equals(SEARCH_BY_TITLE)) {
				System.out.println(">>선택 조회 하기<<");
				readByName(sc, PB);
			} else if (selectedNumber.equals(FIX)) {
				System.out.println("수정 하기");
				fix(sc, PB);
			} else if (selectedNumber.equals(DELETE)) {
				System.out.println(">>삭제 하기<<");
				delete(sc, PB);
			} else if (selectedNumber.equals(END)) {
				System.out.println(">>프로그램 종료<<");
				flag = false;
			} else {
				System.out.println(">>잘못된 선택 입니다<<");
			}
		} // end of while

	}// end of main

	// 저장하기
	public static void save(Scanner sc, PhoneBook[] phoneBooks) {
		System.out.println("--------저장하기--------");
		System.out.println(">>>번호를 입력 하세요<<<");
		String name = sc.nextLine();
		System.out.println(">>>이름을 입력 하세요<<<");
		String phoneNumber = sc.nextLine();
		PhoneBook Pb = new PhoneBook(name, phoneNumber);
		if (LAST_INDEX_NUMBER >= phoneBooks.length) {
			System.out.println("더이상 저장할 공간이 없습니다.");
			return;
		}
		for (int i = 0; i < phoneBooks.length; i++) {
			if (phoneBooks[i] == null) {
				phoneBooks[i] = Pb;
				break;
			}
		}
		System.out.println("연락처가 저장 되었습니다");
	}

	// 조회하기
	public static void readAll(PhoneBook[] phoneBooks) {
		System.out.println("----------전체 조회 하기-----------");

		for (int i = 0; i < phoneBooks.length; i++) {
			// 방어적 코드 작성
			if (phoneBooks[i] != null) {
				System.out.println(phoneBooks[i].getName() + "," + phoneBooks[i].getPhoneNumber());
			}
		}
	}

	// 선택조회하기
	public static void readByName(Scanner sc, PhoneBook[] phoneBooks) {
		System.out.println("-----------선택 조회 하기------------");
		System.out.println(">>>이름을 입력 하세요<<<");
		String name = sc.nextLine();
		boolean isFind = false;
		for (int i = 0; i < phoneBooks.length; i++) {
			if (phoneBooks[i] != null) {
				if (phoneBooks[i].getName().equals(name)) {
					System.out.println(phoneBooks[i].getName());
					isFind = true;
					break;
				}
			}
		}
		if (isFind == false) {
			System.out.println("해당 이름은 존재하지 않습니다");
		}
	}

	// 수정하기
	public static void fix(Scanner sc, PhoneBook[] phoneBooks) {
		System.out.println("수정할 이름을 선택하세요");
		String selet = sc.nextLine();

		boolean isOk = false;

		for (int i = 0; i < phoneBooks.length; i++) {

			if (phoneBooks[i] != null) {
				if (phoneBooks[i].getName().equals(selet)) {
					System.out.println(phoneBooks[i].getName() + phoneBooks[i].getPhoneNumber() + "를 수정합니다");

					System.out.println("이름을 입력하세요");
					String newName = sc.nextLine();
					System.out.println("번호를 입력하세요");
					String newNumber = sc.nextLine();

					phoneBooks[i].setName(newName);
					phoneBooks[i].setPhoneNumber(newNumber);

					System.out.println(phoneBooks[i].getName() + ", " + phoneBooks[i].getPhoneNumber());
					break;
				}

			}

		}
		if (isOk == false) {
			System.out.println("해당 이름은 존재하지 않습니다");
		}
	}

	// 삭제하기
	public static void delete(Scanner sc, PhoneBook[] phoneBooks) {
		System.out.println("----------삭제 하기----------");
	      System.out.println("삭제할 이름을 선택하세요");
	      String selet = sc.nextLine();
	      boolean isOk = false;

	      for (int i = 0; i < phoneBooks.length; i++) {
	         if (phoneBooks[i] != null) {
	            if (phoneBooks[i].getName().equals(selet)) {
	               System.out.println(phoneBooks[i].getName() + phoneBooks[i].getPhoneNumber() + "를 삭제합니다");
	               phoneBooks[i] = null;
	            }
	         }

	      }if (isOk == false) {
				System.out.println("해당 이름은 존재하지 않습니다");
			}

	   } 

}// end of class
