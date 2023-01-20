package com;

public class SistemaR {
	
	String pts1;
	String pts2;
	String pts3;
	
	SistemaR (){}

	public SistemaR(String pts1, String pts2, String pts3) {
		super();
		this.pts1 = pts1;
		this.pts2 = pts2;
		this.pts3 = pts3;
		
		
		
	}

	public String getPts1() {
		return pts1;
	}

	public void setPts1(String pts1) {
		this.pts1 = pts1;
	}

	public String getPts2() {
		return pts2;
	}

	public void setPts2(String pts2) {
		this.pts2 = pts2;
	}

	public String getPts3() {
		return pts3;
	}

	public void setPts3(String pts3) {
		this.pts3 = pts3;
		
		
		
	}

	@Override
	public String toString() {
		return "SistemaR [pts1=" + pts1 + ", pts2=" + pts2 + ", pts3=" + pts3 + "]";
	};
	
	

}
