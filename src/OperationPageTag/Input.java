package OperationPageTag;

import BaseFuncMethod.PageUtils;

public class Input extends PageUtils{
	
	private String xpath=null;
	
	// �����ı�����
	
	public String getXpath() {
		return this.xpath;
	}
	
	public Input(String xpath) {
		this.xpath = xpath;
	}
	
	public void inputTextS(String text) {
		waitElement(this.xpath);
		inputText(getElement(this.xpath), text);
	}
}
