package cn.com.iscs.ecm.sale.service;

import cn.com.iscs.base.dao.IBasicDao;
import cn.com.iscs.base.exception.DaoException;
import cn.com.iscs.base.exception.ServiceException;
import cn.com.iscs.base.service.BasicService;
import cn.com.iscs.ecm.sale.dao.ITestDao;
import cn.com.iscs.ecm.sale.model.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
* @ClassName: TestService
* @Description: test
* @author: suxl
* @date:2015-01-19 16:40:14
*/

@Service
public class TestService extends BasicService<Test> implements ITestService {
    @Autowired
    private ITestDao testDao;

    @Override
    public IBasicDao<Test> getDao() {
        return this.testDao;
    }

    public List<Test> getListByUserId(Long userId) throws ServiceException {
        try{
            Map<String,Object> map = new HashMap<String, Object>();
            map.put("user_id",userId);
            return this.testDao.find(map);
        } catch (DaoException e){
            throw new ServiceException(e);
        }
    }
}
