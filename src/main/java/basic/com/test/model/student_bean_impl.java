package basic.com.test.model;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
@Repository
public class student_bean_impl implements CrudRepository<student_bean, Serializable> {

	public <S extends student_bean> S save(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	public <S extends student_bean> Iterable<S> save(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	public student_bean findOne(Serializable id) {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean exists(Serializable id) {
		// TODO Auto-generated method stub
		return false;
	}

	public Iterable<student_bean> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	public Iterable<student_bean> findAll(Iterable<Serializable> ids) {
		// TODO Auto-generated method stub
		return null;
	}

	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}

	public void delete(Serializable id) {
		// TODO Auto-generated method stub
		
	}

	public void delete(student_bean entity) {
		// TODO Auto-generated method stub
		
	}

	public void delete(Iterable<? extends student_bean> entities) {
		// TODO Auto-generated method stub
		
	}

	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}


	

}
