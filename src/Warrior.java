import com.behavior.*;

public class Warrior extends Character{

	public Warrior() {
		
		this.fightI = new GunFight();
	}
	public Warrior(FightingSpr fightI, Move moveI, HealSpr healI) {
		
		super(fightI, moveI, healI);
	}

}
