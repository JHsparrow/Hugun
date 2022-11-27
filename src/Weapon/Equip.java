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
		String EqYN;
		while(EquipRun) {
			System.out.println("---------------");
			System.out.println("무기를 선택하시오.");
			System.out.println("1.건총 | 2.라이플 | 3.샷건 | 4.종료");
			String SelectWeapon = scanner.nextLine();
			if(SelectWeapon.equals("1")) {
				new Pistol();
				EqYN = scanner.nextLine();
				if (EqYN.equals("Y")||EqYN.equals("y")) {
					System.out.println("------------------");
					System.out.println("건총을 장착하였습니다.");	
					System.out.println("------------------");
					EquipStatus = "Pistol";
					EquipRun = false;
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
				}				
			}
			else {
				System.out.println("------------------");
				System.out.println("기존무기를 유지합니다.");
				System.out.println("------------------");
				EquipRun = false;
			}
		}
	}
}