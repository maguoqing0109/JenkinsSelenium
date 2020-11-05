package ElementXpathSet;

import BaseFuncMethod.ReadProperties;
import OperationPageTag.Butter;
import OperationPageTag.Input;

public class BaiduLoginEle {
	private String localEleXpath = System.getProperty("user.dir") + "\\xpathLocated\\UIXpath.properties";
	private ReadProperties readProperties = new ReadProperties(localEleXpath); 
	
	// °Ù¶ÈÊ×Ò³µÇÂ¼
	public Butter BaiduLoginbutter = new Butter(readProperties.getValue("Baidu.FirstPage.Login.Butter"));
	
	public Butter SelectUserPwdButton = new Butter(readProperties.getValue("Baidu.FirstPage.Login.User.Butter"));
	
	public Input BaiduUserNameInput = new Input(readProperties.getValue("Baidu.Input.UserName.Box"));
	
	public Input BaiduPwdNameInput = new Input(readProperties.getValue("Baidu.Input.Pwd.Box"));
	
	public Butter UserNmaeAndPwdLoginButton = new Butter(readProperties.getValue("Baidu.UserNameAndPwd.Login.Button"));
	
	public Butter BaiduLoginSucced = new Butter(readProperties.getValue("Baidu.LoginSuuced.Assert.Button"));
	
	
}
