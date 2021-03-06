package com.rong360.crawler.ds.check;

import com.rong360.crawler.bean.CheckResult;
import com.rong360.crawler.ds.query.impl.TaoBaoPCVerifyMsgQuery;


/**
 * 
 * @ClassName: ICheckTaoBaoPCVerifyMsg
 * @Description:检查用户输入参数接口
 * @author xiongwei
 * @date 2015-5-4 上午11:34:06
 * 
 */
public interface ICheckTaoBaoPCVerifyMsg {

	
	/***
	 * 检查用户输入参数
	 * @param TaoBaoPCVerifyMsgQuery
	 * @return
	 */
	public CheckResult check(TaoBaoPCVerifyMsgQuery taoBaoPCVerifyMsgQuery);
}
