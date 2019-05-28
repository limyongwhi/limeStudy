package recruit.recruit.dao;

import java.util.HashMap;
import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

/*모집 게시판 DAO*/
@Repository("RecruitDao")
public class RecruitDao {
		@Inject
		private SqlSession sqlSession;		
		private final static String namespace = "recruit.dao.RecruitMapper";
		
		//모집게시판 리스트
		public List getRecruitList(HashMap<String,Object> params){
			return sqlSession.selectList(namespace+".getRecruitList", params);
		}
		
		//모집게시판 게시물 조회 
		public HashMap<String,Object> getRecruit(HashMap<String,Object> params){
			return sqlSession.selectOne(namespace+".getRecruit", params);
		}
		
		//모집게시판 게시물 작성
		public int writeRecruit(HashMap<String,Object> params){
			return sqlSession.insert(namespace+".writeRecruit", params);
		}
		
		//모집게시판 글  수정
		public int updateRecruit(HashMap<String,Object> params){
			return sqlSession.update(namespace+".updateRecruit", params);
		}
		
		//모집게시판 글  삭제
		public int deleteRecruit(HashMap<String,Object> params){
			return sqlSession.update(namespace+".deleteRecruit", params);
		}
		
		//모집게시판 글 조회수 증가
		public int addViewCnt(HashMap<String,Object> params){
			return sqlSession.update(namespace+".addViewCnt", params);
		}
}
