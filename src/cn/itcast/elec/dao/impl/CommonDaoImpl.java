package itcast.elec.dao.impl;

import itcast.elec.dao.ICommonDao;
import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import javax.annotation.Resource;


//HibernateDaoSupport   提供了Hibernate  增删改查的方法
public class CommonDaoImpl<T> extends HibernateDaoSupport implements ICommonDao<T> {

    /**
     * @Name: save
     * @Description: 保存对象的方法
     * @Parameters: T entity 对象
     * @Return: 无
     */
    public void save(T entity) {
        //  spring 整合Hibernate  可以使用 getHibernateTemplate()  通过getHibernateTemplate()模板 可以对数据进行增删改查  save(entity);保存对象的方法
        //  getHibernateTemplate() 和SsessionFactory里边封装的方法一样
        this.getHibernateTemplate().save(entity);
    }

    /**
     * 方法一  在bean.xml中配置  sessionFactory
     *  <bean id="xxxxx" class="cn.itcast.elec.dao.impl.CommonDaoImpl">
     <property name="sessionFactory" ref="sessionFactory"></property>
     </bean>
     */

    //  方法二 通过使用注解创建sessionFactory，  通过sessionFactory，创建getHibernateTemplate()模板   实现对数据库增删改查
    @Resource(name="sessionFactory")
    public final void setSessionFactoryDi(SessionFactory sessionFactory) {
        super.setSessionFactory(sessionFactory);
    }
}
