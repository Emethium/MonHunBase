package com.nikolaserafini.MonHunBase.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class DropProperties {
	@Column
	private String hunterRank;				// Not sure if I should add this
	@Column
	private String monsterName;				// The name of the monster which the item is carved
	@Column
	private String method;					// How do you obtain the item. Ex : cutting tails.
	@Column
	private String sucessRate;				// Chance to obtain the item through the method.

	/* Default constructor */

	public DropProperties(String rank, String name, String how, String percent) {
		hunterRank = rank;
		monsterName = name;
		method = how;
		sucessRate = percent;
	}

	/* Getters and setters */

	public String getHunterRank() {
		return hunterRank;
	}
	public void setHunterRank(String hunterRank) {
		this.hunterRank = hunterRank;
	}
	public String getMonsterName() {
		return monsterName;
	}
	public void setMonsterName(String monsterName) {
		this.monsterName = monsterName;
	}
	public String getMethod() {
		return method;
	}
	public void setMethod(String method) {
		this.method = method;
	}
	public String getSucessRate() {
		return sucessRate;
	}
	public void setSucessRate(String sucessRate) {
		this.sucessRate = sucessRate;
	}

}
