package itcast.elec.dao.impl;

import itcast.elec.dao.IElecTextDao;
import org.springframework.stereotype.Repository;

import itcast.elec.domain.ElecText;

@Repository(IElecTextDao.SERVICE_NAME)
public class ElecTextDaoImpl extends CommonDaoImpl<ElecText> implements IElecTextDao {

}
