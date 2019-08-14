package itcast.elec.dao;

import itcast.elec.domain.ElecText;

public interface IElecTextDao extends ICommonDao<ElecText> {
    public final static String SERVICE_NAME = "itcast.elec.dao.impl.ElecTextDaoImpl";
}
