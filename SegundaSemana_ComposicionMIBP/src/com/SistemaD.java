package com;

public class SistemaD {
	
	String pte1;
	String pte2;
	String pte3;
	
	SistemaD(){}

	public SistemaD(String pte1, String pte2, String pte3) {
		super();
		this.pte1 = pte1;
		this.pte2 = pte2;
		this.pte3 = pte3;
		
		
		
		
	}

	public String getPte1() {
		return pte1;
	}

	public void setPte1(String pte1) {
		this.pte1 = pte1;
	}

	public String getPte2() {
		return pte2;
	}

	public void setPte2(String pte2) {
		this.pte2 = pte2;
	}

	public String getPte3() {
		return pte3;
	}

	public void setPte3(String pte3) {
		this.pte3 = pte3;
		
		
		
	}

	@Override
	public String toString() {
		return "SistemaD [pte1=" + pte1 + ", pte2=" + pte2 + ", pte3=" + pte3 + "]";
	};
	
	
	
	

}
