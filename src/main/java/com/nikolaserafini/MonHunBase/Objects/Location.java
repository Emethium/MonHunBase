package com.nikolaserafini.MonHunBase.Objects;

import javax.persistence.Entity;
import javax.persistence.Column;

@Entity
public class Location {
	@Column
	private String map;
	@Column
	private String hunterRank;
	@Column
	private String mapArea;
	@Column
	private String gatheringMethod;
	
	public Location(String where, String rank, String whichArea, String how) {
		map = where;
		hunterRank = rank;
		mapArea = whichArea;
		gatheringMethod = how;
	}
	
	
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
