package CaseBasePage;

import ElementXpathSet.BaiduLoginEle;

public class BaiduPageCase {
	private BaiduLoginEle baiduLoginEle = new BaiduLoginEle();
	
	public void BaiduLogin(String userName, String pwd) throws InterruptedException {
		
		// 点击百度首页登录按钮
		baiduLoginEle.BaiduLoginbutter.clickElementS();
		baiduLoginEle.BaiduLoginSucced.waitTime(3);
		
		// 选择用户名密码登录
		baiduLoginEle.SelectUserPwdButton.clickElementS();
		baiduLoginEle.BaiduLoginSucced.waitTime(3);
		
		// 输入账号
		baiduLoginEle.BaiduUserNameInput.inputTextS(userName);
		baiduLoginEle.BaiduLoginSucced.waitTime(3);
		
		// 输入密码
		baiduLoginEle.BaiduPwdNameInput.inputTextS(pwd);
		baiduLoginEle.BaiduLoginSucced.waitTime(3);
		
		// 点击登录按钮
		baiduLoginEle.UserNmaeAndPwdLoginButton.clickElementS();
		baiduLoginEle.BaiduLoginSucced.waitTime(3);
		
	}
	
	public boolean assertUserLoginSucceed() throws InterruptedException {
		
		String assertEle = baiduLoginEle.BaiduLoginSucced.getXpath();
		
		baiduLoginEle.BaiduLoginSucced.waitTime(3);
		
		return baiduLoginEle.BaiduLoginSucced.isElements(assertEle);
	}
}
