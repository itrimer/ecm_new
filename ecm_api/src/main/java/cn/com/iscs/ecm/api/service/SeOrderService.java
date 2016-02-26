package cn.com.iscs.ecm.api.service;

import cn.com.iscs.base.dao.IBasicDao;
import cn.com.iscs.base.service.BasicService;
import cn.com.iscs.ecm.api.dao.ISeOrderDao;
import cn.com.iscs.ecm.api.model.base.SeOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
* @ClassName: TestService
* @Description: test
* @author: suxl
* @date:2015-01-19 16:40:14
*/

@Service
public class SeOrderService extends BasicService<SeOrder> implements ISeOrderService {
    @Autowired
    private ISeOrderDao seOrderDao;

    @Override
    public IBasicDao<SeOrder> getDao() {
        return this.seOrderDao;
    }

}
