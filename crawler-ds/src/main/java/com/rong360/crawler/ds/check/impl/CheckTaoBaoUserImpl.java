package com.rong360.crawler.ds.check.impl;

import org.apache.commons.lang.StringUtils;

import com.rong360.crawler.bean.CheckResult;
import com.rong360.crawler.bean.ErrorCode;
import com.rong360.crawler.ds.check.ICheckTaoBaoUser;
import com.rong360.crawler.ds.query.impl.TaoBaoVerifyUserQuery;
import com.rong360.crawler.util.URIUtils;

/**
 * 
 * @ClassName: CheckJDUserImpl
 * @Description:检查用户输入参数实现类
 * @author xiongwei
 * @date 2015-3-23 上午11:34:06
 * 
 */
public class CheckTaoBaoUserImpl implements ICheckTaoBaoUser {

	@Override
	public CheckResult check(TaoBaoVerifyUserQuery taoBaoVerifyUserQuery) {
		/******检查登录名为空*****/
		if (StringUtils.isEmpty(taoBaoVerifyUserQuery.getLoginName())) {
			return new CheckResult(ErrorCode._20001.getMsg(), ErrorCode._20001.getCode());
		}
		
		
		/******检查userId是否为空*****/
		if (StringUtils.isEmpty(taoBaoVerifyUserQuery.getUserId())) {
			return new CheckResult(ErrorCode._10008.getMsg(), ErrorCode._10008.getCode());
		}
		
		/******检查userId长度是否超过45个字符*****/
		if (taoBaoVerifyUserQuery.getUserId().length() > 45) {
			return new CheckResult(ErrorCode._10011.getMsg(), ErrorCode._10011.getCode());
		}
		return null;
	}
}
