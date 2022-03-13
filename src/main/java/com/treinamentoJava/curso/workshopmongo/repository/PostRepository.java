package com.treinamentoJava.curso.workshopmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.treinamentoJava.curso.workshopmongo.domain.Post;

public interface PostRepository extends MongoRepository <Post, String> {


}
