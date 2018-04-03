package com.gsitm.java.ex08;

public class ChildCat_1054 extends ParentCat_1054{
	
	private String furColor;

	/**
	 * 생성자(Constructor)
	 */
	public ChildCat_1054() {
		this.furColor = "파란색";
		super.arm = "장애";
		super.leg = "장애";
		super.shoulder = "기형";
	}

	/**
	 * 생성자(Constructor)
	 * @param furColor
	 */
	public ChildCat_1054(String furColor) {
		this.furColor = furColor;
		super.arm = "장애";
		super.leg = "장애";
		super.shoulder = "기형";
	}
	
	/**
	 * 생성자(Constructor)
	 * @param arm
	 * @param leg
	 */
	public ChildCat_1054(String arm, String leg) {
		super(arm, leg);
	}

	/**
	 * 생성자(Constructor)
	 * @param arm
	 * @param leg
	 * @param shoulder
	 */
	public ChildCat_1054(String arm, String leg, String shoulder) {
		super(arm, leg, shoulder);
		this.furColor = "파란색";
	}



	
	public static void main(String[] args) {
		ParentCat_1054 pCat = new ParentCat_1054();
		
		pCat.roar();
		
		ChildCat_1054 cCat = new ChildCat_1054("검정");
		
		cCat.roar();
		
	}
	
	
	
	//========================= FUNCTION(METHOD) ======================
	
	
	
	@Override
	public void roar() {
		System.out.println(this.furColor + "색 고양이가" + " 음메 하고 웁니다");
	}
	
	
	
	//=========================GETTER/SETTER===========================
	
	/* (non-Javadoc)
	 * @see com.gsitm.java.ex08.ParentCat_1054#getFurColor()
	 */
	@Override
	public String getFurColor() {
		return super.getFurColor();
	}

	/* (non-Javadoc)
	 * @see com.gsitm.java.ex08.ParentCat_1054#setFurColor(java.lang.String)
	 */
	@Override
	public void setFurColor(String furColor) {
		super.setFurColor(furColor);
	}

	/* (non-Javadoc)
	 * @see com.gsitm.java.ex08.ParentCat_1054#getArm()
	 */
	@Override
	public String getArm() {
		return super.getArm();
	}

	/* (non-Javadoc)
	 * @see com.gsitm.java.ex08.ParentCat_1054#setArm(java.lang.String)
	 */
	@Override
	public void setArm(String arm) {
		super.setArm(arm);
	}

	/* (non-Javadoc)
	 * @see com.gsitm.java.ex08.ParentCat_1054#getLeg()
	 */
	@Override
	public String getLeg() {
		return super.getLeg();
	}

	/* (non-Javadoc)
	 * @see com.gsitm.java.ex08.ParentCat_1054#setLeg(java.lang.String)
	 */
	@Override
	public void setLeg(String leg) {
		super.setLeg(leg);
	}

	/* (non-Javadoc)
	 * @see com.gsitm.java.ex08.ParentCat_1054#getShoulder()
	 */
	@Override
	public String getShoulder() {
		return super.getShoulder();
	}

	/* (non-Javadoc)
	 * @see com.gsitm.java.ex08.ParentCat_1054#setShoulder(java.lang.String)
	 */
	@Override
	public void setShoulder(String shoulder) {
		super.setShoulder(shoulder);
	}


	
}
