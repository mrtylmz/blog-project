package com.murat.blogproject.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="category")
public class Category implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue
	@Column(name="id")
	private int id;
	@Column(name="name")
	private String name;
	
	
//	public void addPost(Post tempPost) {
//		if (posts == null) {
//			posts = new HashSet<>();
//		}
//		posts.add(tempPost);
//		tempPost.setCategory(this);
//	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return getId()+ " " +getName();
	}

}
