package com.nikolaserafini.MonHunBase.Objects;

import javax.persistence.Entity;
import javax.persistence.Column;

@Entity
public class Location {
	@Column
	private String map;			// The name of the map the item is found. Ex : Flooded Forest.
	@Column
	private String hunterRank;		// I'm still not sure if I should add this.
	@Column
	private String mapArea;		// The area, inside the map, the item is found. Ex : Area 1,2,3.
	@Column
	private String gatheringMethod;		// How you obtain the item. Ex : gathering, mining.


	/* Default Constructor */

	public Location(String where, String rank, String whichArea, String how) {
		map = where;
		hunterRank = rank;
		mapArea = whichArea;
		gatheringMethod = how;
	}


	/* Getters and setters */

	public String getMap() {
		return map;
	}
	public void setMap(String map) {
		this.map = map;
	}
	public String getHunterRank() {
		return hunterRank;
	}
	public void setHunterRank(String hunterRank) {
		this.hunterRank = hunterRank;
	}
	public String getMapArea() {
		return mapArea;
	}
	public void setMapArea(String mapArea) {
		this.mapArea = mapArea;
	}
	public String getGatheringMethod() {
		return gatheringMethod;
	}
	public void setGatheringMethod(String gatheringMethod) {
		this.gatheringMethod = gatheringMethod;
	}


}
