package br.com.apirest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.apirest.entity.User;

public interface UserRepository extends  JpaRepository<User, Long>{

}
