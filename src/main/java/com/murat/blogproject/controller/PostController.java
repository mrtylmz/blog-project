package com.murat.blogproject.controller;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.murat.blogproject.model.PostModel;
import com.murat.blogproject.service.PostService;
import com.murat.blogproject.shared.PostDto;

@RestController
@RequestMapping("/api/posts")
public class PostController {

	@Autowired
	PostService postService;
	
	@GetMapping("/{postId}")
	public PostModel getPost(@PathVariable String postId) {
		PostModel model=new PostModel();
		PostDto postDto=postService.getPostByPostId(postId);
		model=new ModelMapper().map(postDto, PostModel.class);
		return model;
		
	}
}
