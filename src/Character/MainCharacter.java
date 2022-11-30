package Character;

import Monster.Monster;
import Weapon.Equip;

public class MainCharacter {
	
	public int Hp = 1000;
	public int AttactDamage = 10;
	public int AttactSpeed;	
	
	public void CharacterAttacked() {
		this.AttactDamage =(int)(Equip.AttackDamage) + this.AttactDamage;
		Monster monster = new Monster();	
		System.out.println("몬스터가 "+ monster.AttactDamage +"의 데미지로 공격하였다.");
		this.Hp = this.Hp - monster.AttactDamage;
	}	
}
