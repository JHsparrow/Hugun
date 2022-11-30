package Weapon;

public class Shotgun {
	public Shotgun() {
		Equip.AttackDamage = 200;
		Equip.MaxAmmo = 2;
		Equip.Ammo = 2;
		Equip.CunsumeAmmo = 2;
		Equip.Accuracy = 0.5;
		
		System.out.println("︻╦0╤─");
		System.out.println("샷건");
		System.out.println("공격력 : "+Equip.AttackDamage);
		System.out.println("정확도 : "+(int)(Equip.Accuracy*100)+"%");
		System.out.println("탄창 : "+Equip.Ammo+"/"+Equip.MaxAmmo);
		System.out.println("장착하시겠습니까? (Y/N)");
	}
}