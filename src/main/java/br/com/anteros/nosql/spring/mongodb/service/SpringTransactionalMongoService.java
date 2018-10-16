package br.com.anteros.nosql.spring.mongodb.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import br.com.anteros.nosql.persistence.mongodb.session.service.MongoSimpleService;
import br.com.anteros.nosql.persistence.session.NoSQLSessionFactory;
import br.com.anteros.nosql.persistence.session.query.Example;
import br.com.anteros.nosql.persistence.session.query.Page;
import br.com.anteros.nosql.persistence.session.query.Pageable;
import br.com.anteros.nosql.persistence.session.query.Sort;


@Transactional(rollbackFor = Throwable.class, propagation = Propagation.REQUIRED, readOnly = true)
public class SpringTransactionalMongoService<T, ID> extends MongoSimpleService<T, ID>{


	@Autowired 
	@Override
	public void setSessionFactory(NoSQLSessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	
	@Transactional(rollbackFor = Throwable.class, propagation = Propagation.REQUIRED, readOnly = false)
	@Override
	public <S extends T> S save(S entity) throws Exception {
		return super.save(entity);
	}

	@Transactional(rollbackFor = Throwable.class, propagation = Propagation.REQUIRED, readOnly = false)
	@Override
	public <S extends T> Iterable<S> save(Iterable<S> entities) {
		return super.save(entities);
	}

	@Transactional(rollbackFor = Throwable.class, propagation = Propagation.REQUIRED, readOnly = true)
	@Override
	public Optional<T> findById(ID id) {
		return super.findById(id);
	}

	@Transactional(rollbackFor = Throwable.class, propagation = Propagation.REQUIRED, readOnly = true)
	@Override
	public boolean existsById(ID id) {
		return super.existsById(id);
	}

	@Transactional(rollbackFor = Throwable.class, propagation = Propagation.REQUIRED, readOnly = true)
	@Override
	public Iterable<T> findAll() {
		return super.findAll();
	}

	@Transactional(rollbackFor = Throwable.class, propagation = Propagation.REQUIRED, readOnly = true)
	@Override
	public Iterable<T> find(String query) {
		return super.find(query);
	}

	@Transactional(rollbackFor = Throwable.class, propagation = Propagation.REQUIRED, readOnly = true)
	@Override
	public Iterable<T> findById(Iterable<ID> ids) {
		return super.findById(ids);
	}

	@Transactional(rollbackFor = Throwable.class, propagation = Propagation.REQUIRED, readOnly = true)
	@Override
	public long count() {
		return super.count();
	}

	@Transactional(rollbackFor = Throwable.class, propagation = Propagation.REQUIRED, readOnly = false)
	@Override
	public void removeById(ID id) {
		super.removeById(id);
	}

	@Transactional(rollbackFor = Throwable.class, propagation = Propagation.REQUIRED, readOnly = false)
	@Override
	public void remove(T entity) {
		super.remove(entity);
	}

	@Transactional(rollbackFor = Throwable.class, propagation = Propagation.REQUIRED, readOnly = false)
	@Override
	public void remove(Iterable<? extends T> entities) {
		super.remove(entities);
	}

	@Transactional(rollbackFor = Throwable.class, propagation = Propagation.REQUIRED, readOnly = false)
	@Override
	public void removeAll() {
		super.removeAll();
	}

	@Transactional(rollbackFor = Throwable.class, propagation = Propagation.REQUIRED, readOnly = true)
	@Override
	public Iterable<T> findAll(Sort sort) {
		return super.findAll(sort);
	}

	@Transactional(rollbackFor = Throwable.class, propagation = Propagation.REQUIRED, readOnly = true)
	@Override
	public Page<T> findAll(Pageable pageable) {
		return super.findAll(pageable);
	}

	@Transactional(rollbackFor = Throwable.class, propagation = Propagation.REQUIRED, readOnly = true)
	@Override
	public <S extends T> Optional<S> findOne(Example<S> example) {
		return super.findOne(example);
	}

	@Transactional(rollbackFor = Throwable.class, propagation = Propagation.REQUIRED, readOnly = true)
	@Override
	public <S extends T> Iterable<S> find(Example<S> example) {
		return super.find(example);
	}

	@Transactional(rollbackFor = Throwable.class, propagation = Propagation.REQUIRED, readOnly = true)
	@Override
	public <S extends T> Iterable<S> find(Example<S> example, Sort sort) {
		return super.find(example, sort);
	}

	@Transactional(rollbackFor = Throwable.class, propagation = Propagation.REQUIRED, readOnly = true)
	@Override
	public <S extends T> Page<S> find(Example<S> example, Pageable pageable) {
		return super.find(example, pageable);
	}

	@Transactional(rollbackFor = Throwable.class, propagation = Propagation.REQUIRED, readOnly = true)
	@Override
	public <S extends T> long count(Example<S> example) {
		return super.count(example);
	}

	@Transactional(rollbackFor = Throwable.class, propagation = Propagation.REQUIRED, readOnly = true)
	@Override
	public <S extends T> boolean exists(Example<S> example) {
		return super.exists(example);
	}

}
