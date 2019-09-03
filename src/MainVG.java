import com.behavior.*;

public class MainVG {

	public static void main(String[] args) {
		
		Character test[] = {new Warrior(), new Surgeon(), new Civil(), new Sniper(), new Doctor()}; 
		
	
		
		for(Character p: test) {
			
			System.out.println(p.getClass().getName());
			System.out.println("----------------------");
	
			p.toFight();
			p.toMove();
			p.toHeal();
			System.out.println();
			
			
		}
		System.out.println("----------------------");
		
		Character harold = new Warrior();
		harold.toHeal();
		harold.setHeal(new Operation());
		harold.toHeal();
		
	}

}
