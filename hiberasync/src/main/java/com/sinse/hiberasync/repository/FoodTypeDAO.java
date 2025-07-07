package com.sinse.hiberasync.repository;

import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.sinse.hiberasync.exception.FoodTypeException;
import com.sinse.hiberasync.hibernate.HibernateConfig;
import com.sinse.hiberasync.model.FoodType;

public class FoodTypeDAO extends Throwable{
	HibernateConfig config = HibernateConfig.getInstance();

	// 모든 음식 유형 가져오기
	public List selectAll() throws FoodTypeException {
		Transaction tx = null;
		List list = null;

		/*
		 * Java7 부터 try~with~resource 문법 지원 됨 자원을 사용한 후 finally 영역에서 닫는 중복된 코드를 단순사 시키기
		 * 위함 즉, 언어 차원에서 개발자가 해야할 close() 호출을 자동으로 해준다. 주의! 모든 close()메서드를 대상으로 하지 않고,
		 * Closeable을 구현한 객체만을 대상으로 함. 개발자는 try~catch만 집중하면 됨 커넥션 풀은???
		 */
		try (Session session = config.getSession()) {

			tx = session.beginTransaction();
			// ORM은 직접 테이블에 접근하지 않는다. 따라서 아래의 문장이 마치 table을 접근하는 것처럼 보이지만
			// from 절에 대상이되는 객체는 테이블이 아니라 클래스다!
			TypedQuery<FoodType> query = session.createQuery("from FoodType", FoodType.class);
			list = query.getResultList();
			tx.commit();
			session.close();
		} catch (Exception e) {
			e.printStackTrace();
			if (tx != null)
				tx.rollback();
			throw new FoodTypeException("데이터 조회 실패", e);
		}
		return list;
	}

}
