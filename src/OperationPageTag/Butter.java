package OperationPageTag;

import BaseFuncMethod.PageUtils;

public class Butter extends PageUtils{
	// 元素点击操作方法
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
