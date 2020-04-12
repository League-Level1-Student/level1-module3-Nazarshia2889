package _06_gridworld;

import java.awt.Color;
import java.util.Random;

import info.gridworld.actor.Bug;
import info.gridworld.actor.Flower;
import info.gridworld.grid.Location;
import info.gridworld.world.World;

public class Gridworld {
	public static void main(String[] args) {
		World w = new World();
		Bug b = new Bug();
		Bug two = new Bug();
		Flower f2 = new Flower();
		Random ran = new Random();
		int x = ran.nextInt(10);
		int y = ran.nextInt(10);
		int first = 0;
    	int second = 0;
		Location l1 = new Location(ran.nextInt(10), ran.nextInt(10));
		Location l2 = new Location(x, y);
		Location l3 = new Location(x-1, y);
		Location l4 = new Location(x+1, y);
		w.add(l1, b);
		w.add(l2, two);
		two.setColor(Color.blue);
		two.turn();
		two.turn();
	   
	   for(int i = 0;i < 100;i++) {
	    	Location l5 = new Location(first, second);
	    	Flower f = new Flower();
	    	if(first % 2 == 0) {
	    		f.setColor(Color.RED);
	    	}
	    	else {
	    		f.setColor(Color.WHITE);
	    	}
	    	second += 1;
	    	if(second>9) {
	    		first += 1;
	    		second = 0;
	    	}
	    	if(!l5.equals(l1) && !l5.equals(l2)) {
	    		w.add(l5, f);
	    	}
	    	
	    	
	    	
	    } 
		w.show();
	}
	

}
