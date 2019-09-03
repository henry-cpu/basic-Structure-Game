import com.behavior.*;

public class Surgeon extends Character{


	public Surgeon() {
		
		this.healI = new Operation();
	} 
	
	public Surgeon(FightingSpr fightI, Move moveI, HealSpr healI) {
		
		super(fightI, moveI, healI);
	}

}
