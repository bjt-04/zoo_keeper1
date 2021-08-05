
public class Gorilla extends Mammal {
	public void throwSomething() {
		setEnergyLevel(getEnergyLevel() - 5);
		System.out.println("The mighty Gorilla has thrown something! But loses 5 energy.");
		displayEnergyLevel();
	}
	
	public void eatBananas() {
		setEnergyLevel(getEnergyLevel() + 10);
		System.out.println("The Gorilla is hungry! He eats a Banana and gains 10 energy.");
		displayEnergyLevel();
	}
	
	public void climb() {
		setEnergyLevel(getEnergyLevel() - 10);
		System.out.println("The Gorilla wants to play in the tree. He climbs it, loses 10 energy");
		displayEnergyLevel();
	}
}
