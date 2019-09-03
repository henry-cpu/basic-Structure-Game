import com.behavior.*;

public class Doctor extends Character{

	public Doctor() {
		this.healI = new FirstAid();
	}
	
	
	public Doctor(FightingSpr fightI, Move moveI, HealSpr healI) {
		
		super(fightI, moveI, healI);
	}
	
}
