package com.murat.blogproject.service;

import java.util.List;

import com.murat.blogproject.entity.Post;
import com.murat.blogproject.shared.PostDto;

public interface PostService {
	PostDto createPost(Post post);
	PostDto updatePost(String postId,Post post);
	PostDto getPostByPostId(String postId);
	List<PostDto> getPosts(int page, int limit);
}
