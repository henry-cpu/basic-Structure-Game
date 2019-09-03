import com.behavior.*;

public class Sniper extends Character{



	public Sniper() {
		
		this.fightI = new GunFight();
	}
	
	
	public Sniper(FightingSpr fightI, Move moveI, HealSpr healI) {
		
		super(fightI, moveI, healI);
	}

}
