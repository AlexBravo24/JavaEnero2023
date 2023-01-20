package com;

public class SistemaN {
	
	String pt1;
	String pt2;
	String pt3;
	
	SistemaN (){}

	public SistemaN(String pt1, String pt2, String pt3) {
		super();
		this.pt1 = pt1;
		this.pt2 = pt2;
		this.pt3 = pt3;
		
		
		
	}

	public String getPt1() {
		return pt1;
	}

	public void setPt1(String pt1) {
		this.pt1 = pt1;
	}

	public String getPt2() {
		return pt2;
	}

	public void setPt2(String pt2) {
		this.pt2 = pt2;
	}

	public String getPt3() {
		return pt3;
	}

	public void setPt3(String pt3) {
		this.pt3 = pt3;
		
		
		
	}

	@Override
	public String toString() {
		return "SistemaN [pt1=" + pt1 + ", pt2=" + pt2 + ", pt3=" + pt3 + "]";
	};
	
	

}
