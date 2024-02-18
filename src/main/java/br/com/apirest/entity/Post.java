package br.com.apirest.entity;

import java.util.Date;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

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
@Table(name = "posts", schema = "restapi")
public class Post {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "posts_sq")
	@SequenceGenerator(schema = "restapi", name="posts_sq", sequenceName = "posts_sq", initialValue = 1, allocationSize = 1)
	private Long id;
	
	@Column(name = "text_content")
	private String textContend;
	
	@CreationTimestamp
	@Column(name = "created_at")
	private Date createdAt;
	
	@UpdateTimestamp
	@Column(name="updated_at")
	private Date updatedAt;
	
	@ManyToOne
	@JoinColumn(name = "users_id")
	private User user;
	
}
