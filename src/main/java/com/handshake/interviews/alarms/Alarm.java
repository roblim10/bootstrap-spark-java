package com.handshake.interviews.alarms;

public class Alarm {
	private int id;
	private String text;
	
	public Alarm(int id, String text) {
		this.id = id;
		this.text = text;
	}
	
	public int getId()  {
		return id;
	}
	
	public String getText()  {
		return text;
	}
}
