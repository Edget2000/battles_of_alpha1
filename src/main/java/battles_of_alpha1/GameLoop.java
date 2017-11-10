package battles_of_alpha1;

import battles_of_alpha1.character.Character;
import battles_of_alpha1.gui.Gui;
import battles_of_alpha1.inventory.Inventory;
import battles_of_alpha1.monsters.Monsters;

public class GameLoop {

	public GameLoop() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World");
		
		Inventory inv = new Inventory();
		Character cha = new Character();
		Gui gui = new Gui();
		Monsters mon = new Monsters();
		
		
	}

}
