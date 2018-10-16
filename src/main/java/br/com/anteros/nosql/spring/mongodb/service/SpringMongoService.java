package br.com.anteros.nosql.spring.mongodb.service;

import org.springframework.beans.factory.annotation.Autowired;

import br.com.anteros.nosql.persistence.mongodb.session.service.MongoSimpleService;
import br.com.anteros.nosql.persistence.session.NoSQLSessionFactory;


public class SpringMongoService<T, ID> extends MongoSimpleService<T, ID> {


	@Override
	@Autowired 
	public void setSessionFactory(NoSQLSessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

}
