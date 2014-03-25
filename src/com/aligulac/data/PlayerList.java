
package com.aligulac.data;

import java.util.List;

import com.google.gson.annotations.SerializedName;

public class PlayerList{
   	private Meta meta;
   	
   	@SerializedName("objects")
   	private List<Player> players;

 	public Meta getMeta(){
		return this.meta;
	}
	public void setMeta(Meta meta){
		this.meta = meta;
	}
 	public List<Player> getObjects(){
		return this.players;
	}
	public void setObjects(List<Player> objects){
		this.players = objects;
	}
}
