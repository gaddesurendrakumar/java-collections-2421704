package com.linkedin.collections;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class Application {

	public static void main(String[] args) {
	
		Room cambridge = new Room("Cambridge", "Premiere Room", 4, 175.00);
		Room manchester = new Room("Manchester", "Suite", 5, 250.0);
        Room room2 =  new Room("Room2", "Suite", 5, 290.0);
        Collection<Room> rooms = List.of(cambridge,manchester, room2);
		double total = getPotentialRevenue(rooms);
		System.out.println(total);
	}
	
	private static double getPotentialRevenue(Collection<Room> rooms) {
		//return room1.getRate() + room2.getRate();
		double total = rooms.stream()
				.mapToDouble(room-> room.getRate()).sum();
		return total;
				
	}

}
