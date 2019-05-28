package recruit.recruit.controller;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import recruit.recruit.service.RecruitService;

/*모집게시판 컨트롤러*/
@Controller
public class RecruitController {
	@Autowired
	RecruitService recService;
	
	@RequestMapping(value={"recruitMain.do"})
	public ModelAndView recruitMain(HashMap<String,Object>params){
		ModelAndView mav = new ModelAndView();
		mav.addObject("list",recService.getRecruitList(params));
		//TODO
		mav.setViewName("");
		return mav;
	}
}
