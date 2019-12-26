package com.murat.blogproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.murat.blogproject.entity.Post;
@Repository
public interface PostRepository extends JpaRepository<Post, Integer> {

	Post findByPostId(String postId);
	Post findByUrl(String url);
}
