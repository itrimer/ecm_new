package cn.com.iscs.ecm.sale.service;


import cn.com.iscs.base.exception.ServiceException;
import cn.com.iscs.base.service.IBasicService;
import cn.com.iscs.ecm.sale.model.Test;

import java.util.List;

/**
* @ClassName:ITestService
* @Description: test
* @author: suxl
* @date:2015-01-19 16:40:14
*/
public interface ITestService extends IBasicService<Test> {

    /**
    * 获取用户所属信息
    * @param userId
    * @return
    */
    public List<Test> getListByUserId(Long userId) throws ServiceException;

}
