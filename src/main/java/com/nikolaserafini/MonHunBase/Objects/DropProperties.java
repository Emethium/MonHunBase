package com.nikolaserafini.MonHunBase.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class DropProperties {
	@Column
	private String hunterRank;
	@Column
	private String monsterName;
	@Column
	private String method;
	@Column
	private String sucessRate;
	
	public DropProperties(String rank, String name, String how, String percent) {
		hunterRank = rank;
		monsterName = name;
		method = how;
		sucessRate = percent;
	}
	
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
