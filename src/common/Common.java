package common;

import org.springframework.beans.factory.annotation.Autowired;

import common.service.CommonService;

/*
 * 	 공통자바소스 
 */
public class Common {
	private CommonService commonService;
	/**
	 * 문자값이 비어있는지 체크 공백도체크
	 * 임용휘
	 * @example  <if test="@common.Common@isEmpty(str)">
	 * @param str
	 * @return
	 */
	public boolean isEmpty(String str) {
		if(str!=null&&!str.equals("")) {
			return true;
		}else {
			return false;
		}
	}
	
	/**
	 * 문자값이 비어있지않은지 체크 공백이 아닌지도체크
	 * 임용휘
	 * @example  <if test="@common.Common@isNotEmpty(str)">
	 * @param str
	 * @return
	 */
	public boolean isNotEmpty(String str) {
		return !isEmpty(str);
	}
	
	/*
	 * 현재시간 디비조회 
	 * 임용휘
	 **/
	public String getTime() {
		return commonService.getTime();
	}
}
