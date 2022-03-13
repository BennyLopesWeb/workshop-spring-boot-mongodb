package com.treinamentoJava.curso.workshopmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.treinamentoJava.curso.workshopmongo.domain.User;

public interface UserRepository extends MongoRepository <User, String> {


}
