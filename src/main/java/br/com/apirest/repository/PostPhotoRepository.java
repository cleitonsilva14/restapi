package br.com.apirest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.apirest.entity.PostPhoto;

public interface PostPhotoRepository extends JpaRepository<PostPhoto, Long> {

}
