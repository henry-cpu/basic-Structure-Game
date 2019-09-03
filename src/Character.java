import com.behavior.*;


public abstract class Character {

	protected FightingSpr fightI = new Pacifist();
	protected Move moveI = new Walk();
	protected HealSpr healI = new NoCare();

	//constructors

	public Character() {

	}

	public Character(FightingSpr fightI, Move moveI, HealSpr healI) {

		this.fightI = fightI;
		this.moveI = moveI;
		this.healI = healI;

	}

	//behavior methode
	
	public void toFight() {

		fightI.fight();
	}

	public void toMove() {

		moveI.move();
	}

	public void toHeal() {

		healI.heal();
	}
	
	//modify behavior
	
	public void setFight(FightingSpr fight) {
		
		this.fightI = fight;
	}
	
	public void setMove(Move move) {
		
		this.moveI = move;
	}
	
	public void setHeal(HealSpr heal) {
		
		this.healI = heal;
	}
	
	
	
//	
//	protected String weapons = "", shoes = "", carebag = "";
//
//	public  void move() {
//
//		System.out.println("I'm walking!");
//
//	}
//
//	public  void fight() {
//
//		System.out.println("I don't fight!");
//
//	}
//
//	public void treat() {
//
//		System.out.println("I can't heal");
//	}
//
//	protected void setWeapons(String weapons) {
//
//		this.weapons = weapons;
//	}
//
//	protected void setShoes(String shoes) {
//
//		this.shoes = shoes;
//	}
//	protected void setCarebag(String carebag) {
//
//		this.carebag = carebag;
//	}


}
