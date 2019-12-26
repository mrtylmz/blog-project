package com.murat.blogproject.model;

import java.util.Date;
import java.util.Set;

import javax.validation.constraints.NotEmpty;

import com.murat.blogproject.entity.Category;

public class PostModel {

	private String postId;
	private String url;
	@NotEmpty
	private String title;
	@NotEmpty
	private String content;
	private Date dateCreated;
	private Date dateUpdated;
	@NotEmpty
	private Set<Category> categories;
	private boolean active;
	
	public String getPostId() {
		return postId;
	}
	public void setPostId(String postId) {
		this.postId = postId;
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
	public Set<Category> getCategories() {
		return categories;
	}
	public void setCategories(Set<Category> categories) {
		this.categories = categories;
	}
}
