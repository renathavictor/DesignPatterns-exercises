package model;

public class EnchantedMazeFactory extends AbstractMazeFactory {

	public Maze makeMaze() {
		return new Maze();
	}
	public Wall makeWall() {
		return new EnchantedWall();
	}
	public Room makeRoom() {
		return new EnchantedRoom();
	}
	public Door makeDoor() {
		return new EnchantedDoor();
	}
	
}
