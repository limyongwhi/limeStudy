package recruit.recruit.controller;

import recruit.recruit.service.RecruitService;

/*모집게시판 컨트롤러*/
@Controller
public class RecruitController {
	@Autowired
	RecruitService recService;
	
	@RequestMapping(value={"recruitMain.do"})
	public ModelAndView recruitMain(@HashMap<String,Object>params){
		
	}
}
