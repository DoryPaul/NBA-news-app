package com.test.pojo;

import java.util.List;

public class PlayerVo {
	public PlayerWithBLOBs playerWithBLOBs;
	public List<PlayerWithBLOBs> playerList;
	public PlayerWithBLOBs getPlayerWithBLOBs() {
		return playerWithBLOBs;
	}
	public void setPlayerWithBLOBs(PlayerWithBLOBs playerWithBLOBs) {
		this.playerWithBLOBs = playerWithBLOBs;
	}
	public List<PlayerWithBLOBs> getPlayerList() {
		return playerList;
	}
	public void setPlayerList(List<PlayerWithBLOBs> playerList) {
		this.playerList = playerList;
	}
	
}
