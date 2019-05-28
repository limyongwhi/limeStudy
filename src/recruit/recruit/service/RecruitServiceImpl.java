package recruit.recruit.service;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import recruit.recruit.dao.RecruitDao;

public class RecruitServiceImpl implements RecruitService{
	@Autowired
	RecruitDao recDao;
		//	모집게시판 리스트
		@Override
		public List getRecruitList(HashMap<String,Object> params){
			return recDao.getRecruitList(params);
		}
		//모집게시판 게시물 조회
		@Override
		public HashMap<String,Object> getRecruit(HashMap<String,Object> params, String id){
			if(!id.equals(params.get("M_ID"))){//본인글이 아니면 조회수 증가
				recDao.addViewCnt(params);
			}
			return recDao.getRecruit(params);
		}
		//모집게시판 게시물 작성
		@Override
		public int writeRecruit(HashMap<String,Object> params){
			return recDao.writeRecruit(params);
		}
		//모집게시판 글 수정
		@Override
		public int updateRecruit(HashMap<String,Object> params){
			return recDao.updateRecruit(params);
		}
		//모집게시판 글 작성
		@Override
		public int deleteRecruit(HashMap<String,Object> params){
			return recDao.deleteRecruit(params);
		}
}
