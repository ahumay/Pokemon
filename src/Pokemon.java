
public class Pokemon {
	private int HP;
	private int attack;
	private int defense;
	private int specialAttack;
	private int specialDefense;
	private int speed;
	
	public int getHP() {
		return HP;
	}
	public int getAttack() {
		return attack;
	}
	public int getDefense() {
		return defense;
	}
	public int getSpecialAttack() {
		return specialAttack;
	}
	public int getSpecialDefense() {
		return specialDefense;
	}
	public int getSpeed() {
		return speed;
	}
	public void dispalyMethod() {
		System.out.println("HP is: " + HP);
		System.out.println("Attack is: " + attack);
		System.out.println("Defense is: " + defense);
		System.out.println("Special Attack is: " + specialAttack);
		System.out.println("Special Defense is: " + specialDefense);
		System.out.println("Speed is: " + speed);
	}
	
	public Pokemon(int HP, int attack, int defense, int specialAttack, int specialDefense, int speed) {
		this.HP = HP; 
		this.attack = attack;
		this.defense = defense;
		this.specialAttack = specialAttack;
		this.specialDefense = specialDefense;
		this.speed = speed;
	}
		
	
	
	
	
}
