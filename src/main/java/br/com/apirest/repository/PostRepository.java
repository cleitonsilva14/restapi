package br.com.apirest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.apirest.entity.Post;

public interface PostRepository extends JpaRepository<Post, Long> {

}
