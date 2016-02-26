package cn.com.iscs.ecm.api.dao;


import cn.com.iscs.base.dao.MybatisBasicDao;
import cn.com.iscs.ecm.api.model.base.SeOrder;
import org.springframework.stereotype.Repository;

/**
* @ClassName:TestDao
* @Description: test
* @author: suxl
* @date:2015-01-19 16:40:14
*/
@Repository("seOrderDao")
public class SeOrderDao extends MybatisBasicDao<SeOrder> implements ISeOrderDao {

}
