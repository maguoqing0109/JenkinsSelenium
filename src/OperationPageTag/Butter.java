package OperationPageTag;

import BaseFuncMethod.PageUtils;

public class Butter extends PageUtils{
	// Ԫ�ص����������
	private String xpath=null;
	
	public String getXpath() {
		return this.xpath;
	}
	
	public Butter(String xpath) {
		this.xpath = xpath;
	}
	
	public void clickElementS() {
		waitElement(this.xpath);
		clickElement(getElement(this.xpath));
	}
	
}
