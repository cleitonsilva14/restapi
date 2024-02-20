package br.com.apirest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.apirest.entity.Like;

public interface LikeRepository extends JpaRepository<Like, Long>{

}
