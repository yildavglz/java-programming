// Arrays


public class LessonEight {
	public static void main(String[] args) {
		MonsterTwo.buildBattleBoard();
		
		char[][] tempBattleBoard = new char [10][10];
		
		// ObjectName[] Monsters = new ObjectName[4]
		MonsterTwo[] Monsters = new MonsterTwo[4];
		
		// MonsterTwo(int health, int attack, int movement, String name) 
		Monsters[0] = new MonsterTwo(1000, 20, 1,"Frank");
		Monsters[1] = new MonsterTwo(500, 20, 2,"Drac");
		Monsters[2] = new MonsterTwo(1000, 20, 1,"Paul");
		Monsters[3] = new MonsterTwo(1000, 20, 1,"George");

		MonsterTwo.redrawBoard();
	}
}