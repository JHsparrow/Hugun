package Weapon;

import java.util.Scanner;

public class Equip {
	public static String EquipStatus; // 현재 장착 무기
	public static boolean EquipRun = true; // 장착 실행 
	public static int AttackDamage;	 // 공격력
	public static int MaxAmmo;	//최대 탄창
	public static int Ammo; // 탄창
	public static int CunsumeAmmo; //총알 소모량
	public static double Accuracy; //정확도

	public Equip() {
		Scanner scanner = new Scanner(System.in);
		String EqYN; //장착 선택 Y : 선택 / N: 취소
		String SelectWeapon = null; //어떤 무기를 선택 했는지 파악
		boolean ReSelect = false ; // 선택 취소 후 처리
		while(EquipRun) {
			if(ReSelect == false) {
				System.out.println("---------------");
				System.out.println("무기를 선택하시오.");
				System.out.println("1.건총 | 2.라이플 | 3.샷건 | 4.종료");
				SelectWeapon = scanner.nextLine();
			}
			if(SelectWeapon.equals("1")) {
				new Pistol();
				EqYN = scanner.nextLine();
				if (EqYN.equals("Y")||EqYN.equals("y")) {
					System.out.println("------------------");
					System.out.println("건총을 장착하였습니다.");	
					System.out.println("------------------");
					EquipStatus = "Pistol";
					EquipRun = false;
					ReSelect = false;
				} 
				else if (EqYN.equals("N")||EqYN.equals("n")) {
					System.out.println("------------------");
					System.out.println("장착을 취소 하였습니다.");	
					System.out.println("------------------");
					ReSelect = false;
				}
				else {
					System.out.println("------------------");
					System.out.println("정확한 입력 부탁드립니다..");	
					System.out.println("------------------");
					ReSelect = true;
					SelectWeapon = "1";
				}
			}
			else if(SelectWeapon.equals("2")) {
				new Rifle();
				EqYN = scanner.nextLine();
				if (EqYN.equals("Y")||EqYN.equals("y")) {
					System.out.println("------------------");
					System.out.println("라이플을 장착하였습니다.");
					System.out.println("------------------");
					EquipStatus = "Rifle";
					EquipRun = false;
					ReSelect = false;
				}	
				else if (EqYN.equals("N")||EqYN.equals("n")) {
					System.out.println("------------------");
					System.out.println("장착을 취소 하였습니다.");	
					System.out.println("------------------");
					ReSelect = false;
				}
				else {
					System.out.println("------------------");
					System.out.println("정확한 입력 부탁드립니다..");	
					System.out.println("------------------");
					ReSelect = true;
					SelectWeapon = "2";
				}
			}
			else if(SelectWeapon.equals("3")) {
				new Shotgun();
				EqYN = scanner.nextLine();
				if (EqYN.equals("Y")||EqYN.equals("y")) {
					System.out.println("------------------");
					System.out.println("샷건을 장착하였습니다.");
					System.out.println("------------------");
					EquipStatus = "Shotgun";
					EquipRun = false;
					ReSelect = false;
				}	
				else if (EqYN.equals("N")||EqYN.equals("n")) {
					System.out.println("------------------");
					System.out.println("장착을 취소 하였습니다.");	
					System.out.println("------------------");
					ReSelect = false;
				}
				else {
					System.out.println("------------------");
					System.out.println("정확한 입력 부탁드립니다..");	
					System.out.println("------------------");
					ReSelect = true;
					SelectWeapon = "3";
				}
			}
			else if(SelectWeapon.equals("4")) {
				System.out.println("------------------");
				System.out.println("무기 선택을 종료합니다.");
				System.out.println("------------------");
				EquipRun = false;
			}
			else {
				System.out.println("------------------");
				System.out.println("정확한 입력 부탁드립니다..");	
			}
		}
	}
}