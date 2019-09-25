package model;

public class MazeFactory extends AbstractMazeFactory {

	public Maze makeMaze() {
		return new Maze();
	}
	public Wall makeWall() {
		return new Wall();
	}
	public Room makeRoom() {
		return new Room();
	}
	public Door makeDoor() {
		return new Door();
	}
}
