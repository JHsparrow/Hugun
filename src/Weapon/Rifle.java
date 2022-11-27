package Weapon;

public class Rifle extends Gun{

	public Rifle() {
		Equip.AttackDamage = 50;
		Equip.MaxAmmo = 30;
		Equip.Ammo = 30;
		Equip.CunsumeAmmo = 1;
		Equip.Accuracy = 0.7;
		
		System.out.println("피스톨");
		System.out.println("공격력 : "+Equip.AttackDamage);
		System.out.println("정확도 : "+(int)(Equip.Accuracy*100)+"%");
		System.out.println("탄창 : "+Equip.Ammo+"/"+Equip.MaxAmmo);
		System.out.println("장착하시겠습니까? (Y/N)");
	}
	
}