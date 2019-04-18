package com.client;

public class RID {

	public String chunkHandle;
	public int slotNumber;
	public String macAddress;
	public int key;
	
	public RID() {
		chunkHandle = "somethingstupid";
		slotNumber = 0;
	}
	
	// SP : Added for ClientRec ReadFirstRecord
	public RID(String c, int s)
	{
		this.chunkHandle = c;
		this.slotNumber = s;	
		macAddress = "somethingstupid";
		key = 0;
	}

	public String resolve() {
		return chunkHandle + String.valueOf(slotNumber);
	}
}
