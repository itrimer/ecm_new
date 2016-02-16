package cn.com.iscs.ecm.sale.dao;


import cn.com.iscs.base.dao.MybatisBasicDao;
import cn.com.iscs.ecm.sale.model.Test;
import org.springframework.stereotype.Repository;

/**
* @ClassName:TestDao
* @Description: test
* @author: suxl
* @date:2015-01-19 16:40:14
*/
@Repository("testDao")
public class TestDao extends MybatisBasicDao<Test> implements ITestDao {

	public TestDao(){
		super(Test.class);
	}
}
