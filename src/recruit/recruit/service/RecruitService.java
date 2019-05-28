package recruit.recruit.service;

import java.util.*;

public interface RecruitService {

	//모집게시판 리스트
	public List getRecruitList(HashMap<String,Object> params);
	//모집게시판 게시물 조회
	public HashMap<String,Object> getRecruit(HashMap<String,Object> params, String id);
	//모집게시판 게시물 작성
	public int writeRecruit(HashMap<String,Object> params);
	//모집게시판 글 수정
	public int updateRecruit(HashMap<String,Object> params);
	//모집게시판 글 작성
	public int deleteRecruit(HashMap<String,Object> params);
}
