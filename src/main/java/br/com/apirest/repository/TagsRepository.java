package br.com.apirest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.apirest.entity.Tags;

public interface TagsRepository extends JpaRepository<Tags, Long> {

}
