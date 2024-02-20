package br.com.apirest.entity;

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
@Table(name="tags", schema = "restapi")
public class Tags {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "tags_sq")
	@SequenceGenerator(schema = "restapi", name = "tags_sq", sequenceName = "tags_sq", initialValue = 1, allocationSize = 1)
	private Long id;
	
	@ManyToOne
	@JoinColumn(name="posts_id")
	private Post post;
	
	@ManyToOne
	@JoinColumn(name="users")
	private User user;
	
	
}
