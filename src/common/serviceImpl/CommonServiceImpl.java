package common.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import common.service.CommonService;
import common.dao.CommonDao;

@Service
public class CommonServiceImpl implements CommonService{
	@Autowired
	CommonDao commonDao;
	
	@Override
	public String getTime() {
		return commonDao.getTime();
	}
}
