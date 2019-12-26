package com.murat.blogproject.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
@Entity
@Table(name="post")
public class Post implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue
	@Column(name="id")
	private int id;
	@Column(name="post_id")
	private String postId;
	@Column(name="url")
	private String url;
	@Column(name="title")
	private String title;
	@Column(name="content")
	private String content;
	@Column(name="created_date")
	@CreationTimestamp
	private Date dateCreated;
	@Column(name="updated_date")
	@UpdateTimestamp
	private Date dateUpdated;
	@Column(name="active")
	private boolean active=true;
	
	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name="post_category",
	joinColumns = @JoinColumn(name="post_id"),
	inverseJoinColumns = @JoinColumn(name="category_id"))
	private Set<Category> categories;
	
	public Set<Category> getCategories() {
		return categories;
	}
	public void setCategories(Set<Category> categories) {
		this.categories = categories;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Date getDateCreated() {
		return dateCreated;
	}
	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}
	public Date getDateUpdated() {
		return dateUpdated;
	}
	public void setDateUpdated(Date dateUpdated) {
		this.dateUpdated = dateUpdated;
	}
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}
	public String getPostId() {
		return postId;
	}
	public void setPostId(String postId) {
		this.postId = postId;
	}
	
	
}
