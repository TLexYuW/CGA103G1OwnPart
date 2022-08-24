package com.ac.model;

import java.util.List;

import org.hibernate.Transaction;


public class AcDAOImpl implements AcDAO {
	
//	private Session getSession() {
//		return HibernateUtil.getSessionFactory().getCurrentSession();
//	}

	
	@Override
	public Integer insert(AcVO acVo) {
		Transaction transaction = getSession().beginTransaction();
        getSession().save(acVo);
        transaction.commit();
		return 1;
	}

	@Override
	public Integer update(AcVO acVo) {
		AcVO ac = getSession().load(AcVO.class, acVo.getAc_no());
		Transaction transaction = getSession().beginTransaction();
		ac.setAc_title(acVo.getAc_title());
		ac.setAc_content(acVo.getAc_content());
		ac.setAc_time(acVo.getAc_time());
		getSession().update(ac);
		transaction.commit();
		return 1;
	}

	@Override
	public AcVO getOneById(Integer id) {
		Transaction transaction = getSession().beginTransaction();
		AcVO getOne = getSession().get(AcVO.class, id);
		transaction.commit();
		return getOne;
	}

	@Override
	public List<AcVO> getAll() {
		final String GET_ALL = "FROM AcVO";
		Transaction transaction = getSession().beginTransaction();
		List<AcVO> list = getSession().createQuery(GET_ALL, AcVO.class).list();
		transaction.commit();
		return list;
	}


}
