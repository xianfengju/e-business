package com.rong360.crawler.ds.query.impl;

import javax.ws.rs.FormParam;
import javax.xml.bind.annotation.XmlRootElement;

import com.rong360.crawler.query.Query;

/**
 * 
 * @ClassName: TaoBaoVerifyUserQuery
 * @Description:淘宝验证用户名参数
 * @author xiongwei
 * @date 2015-3-20 上午11:34:06
 * 
 */
@XmlRootElement(name = "taoBaoVerifyUserQuery")
public class TaoBaoVerifyUserQuery extends Query implements Cloneable {
	
	/*****【必填】商家ID（量化派提供） *****/
	@FormParam("appId")
	private String appId = "";
	
	/*****【必填】时间戳，比如1409256249894 *****/
	@FormParam("timeunit")
	private long timeunit = -1L;;
	
	/*****【必填】token值，md5(appkey+timeunit)*****/
	@FormParam("token")
	private String token = "";
	
	/*****【必填】用户ID，由appId_userId组成（appId由量化派提供，userId是接口网站用户的Id） *****/
	@FormParam("userId")
	private String userId = "";
	
	/*****【必填】淘宝用户名*****/
	@FormParam("loginName")
	private String loginName = "";

	public String getAppId() {
		return appId;
	}

	public void setAppId(String appId) {
		this.appId = appId;
	}

	public long getTimeunit() {
		return timeunit;
	}

	public void setTimeunit(long timeunit) {
		this.timeunit = timeunit;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getLoginName() {
		return loginName;
	}

	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}
	
	

}
