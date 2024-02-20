package br.com.apirest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.apirest.entity.Follower;

public interface FollowerRepository extends JpaRepository<Follower, Long>{

}
