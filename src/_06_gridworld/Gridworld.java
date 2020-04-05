package _06_gridworld;

import java.util.Random;

import info.gridworld.actor.Bug;
import info.gridworld.grid.Location;
import info.gridworld.world.World;

public class Gridworld {
	public static void main(String[] args) {
		World w = new World();
		Bug b = new Bug();
		Bug two = new Bug();
		Random ran = new Random();
		Location l1 = new Location(ran.nextInt(10), ran.nextInt(10));
		Location l2 = new Location(ran.nextInt(10), ran.nextInt(10));
		w.add(l1, b);
		w.add(l2, two);
		w.show();
	}
	

}
