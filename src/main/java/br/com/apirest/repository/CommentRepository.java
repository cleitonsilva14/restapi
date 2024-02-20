package br.com.apirest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.apirest.entity.Comment;

public interface CommentRepository extends JpaRepository<Comment, Long>{

}
