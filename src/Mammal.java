
public class Mammal {
	private int energyLevel;
	
	public Mammal() {
		this.setEnergyLevel(100);
	}

	public int getEnergyLevel() {
		return energyLevel;
	}

	public void setEnergyLevel(int energyLevel) {
		this.energyLevel = energyLevel;
	}
	
	public int displayEnergyLevel() {
		System.out.println("Current energy: " + energyLevel);
		
		return energyLevel;
	}
}
