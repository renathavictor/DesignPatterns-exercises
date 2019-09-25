package model;

public class MazeGame {

	private Door door;
	private Maze maze;
	private Room room;
	private Wall wall;
	
	
	public void createMaze(String tipo) {
		
	}
	
	
	public MazeGame() {	}
	
	public Door getDoor() {
		return door;
	}
	
	public void setDoor(Door door) {
		this.door = door;
	}
	
	public Maze getMaze() {
		return maze;
	}
	
	public void setMaze(Maze maze) {
		this.maze = maze;
	}
	
	public Room getRoom() {
		return room;
	}
	
	public void setRoom(Room room) {
		this.room = room;
	}
	
	public Wall getWall() {
		return wall;
	}
	
	public void setWall(Wall wall) {
		this.wall = wall;
	}

	@Override
	public String toString() {
		return "MazeGame [door=" + door + ", maze=" + maze + ", room=" + room + ", wall=" + wall + "]";
	}

}
