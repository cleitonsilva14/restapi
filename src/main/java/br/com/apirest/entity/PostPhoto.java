package br.com.apirest.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name="posts_photos", schema = "restapi")
public class PostPhoto {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "posts_photos_sq")
	@SequenceGenerator(schema = "restapi", name = "posts_photos_sq", sequenceName = "posts_photos_sq", initialValue = 1, allocationSize = 1)
	private Long id;
	
	@Column(name="photo_name")
	private String photoName;
	
	private String url;
	
	@ManyToOne
	@JoinColumn(name="posts_id")
	private Post post;
	
	
}
