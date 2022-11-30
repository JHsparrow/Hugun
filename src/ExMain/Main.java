package ExMain;

import java.util.Scanner;

import Character.MainCharacter;
import Monster.Monster;
import Weapon.Equip;

public class Main {
	
	public static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		boolean run = true;
					
		while(run) {
			System.out.println("메뉴를 선택해주세요.");
			if(Equip.EquipStatus==null || Equip.EquipStatus.equals("")) { //장착 상태가 null이거나 빈값일때				
				System.out.println("1.무기장착 | 2.현재상태 확인 | 3.종료");
			}
			else {
				System.out.println("1.무기변경 | 2.무기해제 | 3.현재상태 확인 | 4.싸우기 | 5.종료");				
			}			
			 
			String FirstSelect = scanner.nextLine();
			if(FirstSelect.equals("1")) {	
				Equip.EquipRun = true;
				new Equip();
			} else if(FirstSelect.equals("2")) {
				if(Equip.EquipStatus==null || Equip.EquipStatus.equals("")) {
					System.out.println("현재 상태를 확입합니다.");
					System.out.println("------------------");
					if (Equip.EquipStatus==null || Equip.EquipStatus.equals("")) {
						System.out.println("비무장상태입니다.");
						System.out.println("123");
						System.out.println("------------------");
					} else {
						System.out.println("공격력 : " + Equip.EquipStatus);
						System.out.println("------------------");
					}
				} else {
					System.out.println("무기 장착을 해제합니다.");
					System.out.println("------------------");
					Equip.EquipRun = true;
					Equip.EquipStatus = "";					
				}
				
			} else if(FirstSelect.equals("3")) {
				if(Equip.EquipStatus==null || Equip.EquipStatus.equals("")) {
					System.out.println("------------------");
					System.out.println("시스템을 종료합니다.");
					System.out.println("------------------");
					run = false;
				} 
				else {
					System.out.println("현재 상태를 확인합니다..");
					System.out.println("------------------");
					if (Equip.EquipStatus==null || Equip.EquipStatus.equals("")) {
						System.out.println("비무장상태입니다.");
						System.out.println("------------------");
					} 
					else {
						System.out.println("장착무기 : " + Equip.EquipStatus);
						System.out.println("공격력 : "+Equip.AttackDamage);
						System.out.println("정확도 : "+(int)(Equip.Accuracy*100)+"%");
						System.out.println("탄창 : "+Equip.Ammo+"/"+Equip.MaxAmmo);
						System.out.println("------------------");
					}
				}
			}
			else if(FirstSelect.equals("4")) {
				if(Equip.EquipStatus==null || Equip.EquipStatus.equals("")) {
					System.out.println("정확하게 입력 부탁드립니다.");
					System.out.println("------------------");
				}
				else {
					System.out.println("--------------------------------------");				
					System.out.println("몬스터 : 오랜 시간 기다려왔다. 지금 너와 나 단 둘!!");
					System.out.println("몬스터 : 승자는 한명!! 듀얼이다!!!");
					System.out.println("몬스터 : 듀얼!!!");
					System.out.println("캐릭터 : 듀얼!!!");
					System.out.println("--------------------------------------");
					System.out.println("몬스터가 듀얼을 걸어왔다.");
					
					Monster monster = new Monster();
					MainCharacter char1 = new MainCharacter();
					
					boolean War = true; // 싸움 와일문 전용
					boolean FirstWar = true; //첫턴 
					int WarCount = 1; //턴수 
					int WhoseTurn = (int)(Math.random()*2)+1; // 50퍼 확률 구하기
					while(War){
						System.out.println("제 "+WarCount+"턴");
						// 첫번째 공격은 50% 확률로 선공 선정
						if(FirstWar==true) {   //첫번째 턴일때
							if ( WhoseTurn == 1) {
								System.out.println("몬스터의 선공입니다.");
								char1.CharacterAttacked();
								FirstWar = false;
								WarCount++;
							}
							else {
								System.out.println("플레이어의 선공입니다.");
								monster.MonsterAttacted();
								FirstWar = false;
								WarCount++;
							}
						}
						else { //첫번째 턴이 아닐 때
							System.out.println("--------------------------------------");
							System.out.println("메뉴를 선택하시오.");
							System.out.println("현재 무기 : "+Equip.EquipStatus);
							System.out.println("탄창 "+Equip.Ammo+"/"+Equip.MaxAmmo);
							System.out.println("1.무기변경 | 2.현재상태 확인 | 3.공격 | r.재장전 |4.도주");
							System.out.println("--------------------------------------");
							String WarSelect = scanner.nextLine();
							
							if(WarSelect.equals("1")) {
								Equip.EquipRun = true;
								new Equip();
								continue;
							}
							else if(WarSelect.equals("2")){
								System.out.println("현재 상태를 확인합니다..");
								System.out.println("장착무기 : " + Equip.EquipStatus);
								System.out.println("공격력 : "+Equip.AttackDamage);
								System.out.println("정확도 : "+(int)(Equip.Accuracy*100)+"%");
								System.out.println("탄창 : "+Equip.Ammo+"/"+Equip.MaxAmmo);
								System.out.println("--------------------------------------");
								continue;
							}
							else if(WarSelect.equals("3")){
								if(Equip.Ammo == 0) {
									System.out.println("재장전 해주세요.");
									continue;
								}
								else {
									System.out.println("공격합니다.");
								}							
							}
							else if(WarSelect.equals("r")) {
								System.out.println("재장전합니다.");
								Equip.Ammo = Equip.MaxAmmo;
								System.out.println(Equip.Ammo);
								System.out.println(Equip.MaxAmmo);
								continue;
							}
							else if(WarSelect.equals("4")){
								if((int)(Math.random()*100)+1 < 3) {
									System.out.println("시스템 : 도망가기 성공");
									break;
								}
								else {
									System.out.println("갑자기 던전 마스터가 튀어나왔다.");
									System.out.println(" ⊂_ヽ");
									System.out.println("　 ＼＼ Λ＿Λ");
									System.out.println("　　 ＼(‘ㅅ’) 두둠칫");
									System.out.println("　　　 >　⌒ヽ");
									System.out.println("　　　/ 　 へ＼");
									System.out.println("　　 /　　/　＼＼");
									System.out.println("　　 ﾚ　ノ　　 ヽ_つ");
									System.out.println("　　/　/두둠칫");
									System.out.println("　 /　/|");
									System.out.println("　(　(ヽ");
									System.out.println("　|　|、＼");
									System.out.println("　| 丿 ＼ ⌒)");
									System.out.println("　| |　　) /");
									System.out.println("`ノ )　　Lﾉ");
									if ((int)(Math.random()*2)+1 == 1) {
										System.out.println("던전마스터 : 놈!!!!!! 어딜 도망가느냐!!");
										System.out.println("던전마스터 : 비열한놈.. 한대 맞고 다시싸워라..");
										System.out.println("시스템 : 도망가기 실패");
										char1.CharacterAttacked();
									}
									else {
										System.out.println("던전마스터 : 약하디 약한놈 내가 너를 그리 키웠느냐?");
										System.out.println("던전마스터 : 한대 맞거라 못난놈..");
										System.out.println("시스템 : 도망가기 실패");
										char1.CharacterAttacked();
									}
									continue;
								}
							}
						}
						
						if(WhoseTurn == 1) { //최초 선공이 누구인지 파악하고 그 선공에 따라 턴 진행
							char1.CharacterAttacked();
							if(monster.Hp >= 0 && char1.Hp >= 0 ) { //해당 if문은 먼저 때리고 나서 hp가 0이 됐을 경우 다음 진행 x
								monster.MonsterAttacted();
							}
						}
						else {
							monster.MonsterAttacted();
							if(monster.Hp >= 0 && char1.Hp >= 0 ) {
								char1.CharacterAttacked();
							}
						}
						WarCount++;
					}
					if(monster.Hp <= 0 || char1.Hp <= 0 ) {
						War = false;
						if(monster.Hp < char1.Hp) {
							System.out.println("캐릭터 승리");
						}
						else {
							System.out.println("몬스터 승리");
						}						
					}		
					if(monster.Hp<0) {
						System.out.println("몬스터 체력 : 0");
						System.out.println("캐릭터 체력 : "+char1.Hp);
					}
					else if (char1.Hp<0) {
						System.out.println("몬스터 체력 : "+monster.Hp);
						System.out.println("캐릭터 체력 : 0");
					}
					else {
						System.out.println("몬스터 체력 : "+monster.Hp);
						System.out.println("캐릭터 체력 : "+char1.Hp);
					}
				}
			}
			else if(FirstSelect.equals("5")) {
				if(Equip.EquipStatus==null || Equip.EquipStatus.equals("")) {
					System.out.println("정확하게 입력 부탁드립니다.");
					System.out.println("------------------");
				}
				else {
					System.out.println("시스템을 종료합니다.");
					System.out.println("------------------");
					run = false;
				}
			}
			else {
				System.out.println("정확하게 입력 부탁드립니다.");
				System.out.println("------------------");
			}
		}
	}

}