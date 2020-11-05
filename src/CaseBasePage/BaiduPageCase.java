package CaseBasePage;

import ElementXpathSet.BaiduLoginEle;

public class BaiduPageCase {
	private BaiduLoginEle baiduLoginEle = new BaiduLoginEle();
	
	public void BaiduLogin(String userName, String pwd) throws InterruptedException {
		
		// ����ٶ���ҳ��¼��ť
		baiduLoginEle.BaiduLoginbutter.clickElementS();
		baiduLoginEle.BaiduLoginSucced.waitTime(3);
		
		// ѡ���û��������¼
		baiduLoginEle.SelectUserPwdButton.clickElementS();
		baiduLoginEle.BaiduLoginSucced.waitTime(3);
		
		// �����˺�
		baiduLoginEle.BaiduUserNameInput.inputTextS(userName);
		baiduLoginEle.BaiduLoginSucced.waitTime(3);
		
		// ��������
		baiduLoginEle.BaiduPwdNameInput.inputTextS(pwd);
		baiduLoginEle.BaiduLoginSucced.waitTime(3);
		
		// �����¼��ť
		baiduLoginEle.UserNmaeAndPwdLoginButton.clickElementS();
		baiduLoginEle.BaiduLoginSucced.waitTime(3);
		
	}
	
	public boolean assertUserLoginSucceed() throws InterruptedException {
		
		String assertEle = baiduLoginEle.BaiduLoginSucced.getXpath();
		
		baiduLoginEle.BaiduLoginSucced.waitTime(3);
		
		return baiduLoginEle.BaiduLoginSucced.isElements(assertEle);
	}
}
