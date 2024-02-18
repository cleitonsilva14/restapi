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
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="likes", schema="restapi")
public class Like {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "likes_sq")
	@SequenceGenerator(schema="restapi", name="likes_sq", sequenceName = "likes_sq", initialValue = 1, allocationSize = 1)
	private Long id;
	
	@CreationTimestamp
	@Column(name="created_at")
	private Date createdAt;
	
	@UpdateTimestamp
	@Column(name="updated_at")
	private Date updatedAt;
	
	@ManyToOne
	@JoinColumn(name = "posts_id")
	private Post post;
	
	@ManyToOne
	@JoinColumn(name="users_id")
	private User user;
	
	
}
