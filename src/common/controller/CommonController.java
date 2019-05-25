package common.controller;

import java.util.HashMap;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import common.service.CommonService;

@Controller
public class CommonController {
	private static final Logger logger = LoggerFactory.getLogger(CommonController.class);
	@Autowired
	private CommonService commonService;
	
	
	@RequestMapping(value= {"getTime","getTime.do"})
	public @ResponseBody HashMap<String,Object> getTime(HttpServletRequest request) {
		HashMap<String,Object> resultMap = new HashMap<String,Object>();
		logger.info("getTime.do");
		resultMap.put("nowTime", commonService.getTime());
		return resultMap;		
	}
	
}
