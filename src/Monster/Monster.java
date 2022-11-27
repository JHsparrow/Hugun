package Monster;

import Character.MainCharacter;
import Weapon.Equip;

public class Monster {
	public int Hp = 1000;
	public int AttactDamage = 50;
	public int AttactSpeed;
	
	
	
	public void MonsterAttacted() {
		MainCharacter char01 = new MainCharacter();	
		System.out.println("플레이어가 공격하였다.");
		int getAccuracy = (int)(Math.random()*100);
		if(getAccuracy < (int)(Equip.Accuracy*100)) {
			int CharDamage = (int)(Equip.AttackDamage) + char01.AttactDamage;		
			this.Hp = this.Hp - CharDamage;
			System.out.println("명중하였다");
		} 
		else {
			System.out.println("으악 Miss!!!");
		}
		System.out.println("--------------------");
	}
	
	
	
}
