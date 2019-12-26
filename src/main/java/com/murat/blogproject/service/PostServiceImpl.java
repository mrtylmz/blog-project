package com.murat.blogproject.service;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import com.murat.blogproject.entity.Post;
import com.murat.blogproject.exception.PostNotFoundException;
import com.murat.blogproject.repository.PostRepository;
import com.murat.blogproject.shared.PostDto;
@Service
public class PostServiceImpl implements PostService {

	@Autowired
	PostRepository postRepository;
	
	@Override
	public PostDto createPost(Post post) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PostDto updatePost(String postId,Post post) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PostDto getPostByPostId(String postId) {
		Post result=postRepository.findByPostId(postId);
		ModelMapper modelMapper = new ModelMapper();
		if(result==null) {
			throw new PostNotFoundException("Post ID Not Found " +postId);
		}
		PostDto resultDto=modelMapper.map(result, PostDto.class);
		return resultDto;
	}

	@Override
	public List<PostDto> getPosts(int page, int limit) {
		List<PostDto> resultList=new ArrayList<>();
		if(page>0) page = page-1;
		Pageable pageableRequest = PageRequest.of(page, limit);
		Page<Post> postPages=postRepository.findAll(pageableRequest);
		List<Post> getAllPosts = postPages.getContent();
		if(!CollectionUtils.isEmpty(getAllPosts)) {
			Type listType = new TypeToken<List<PostDto>>() {
			}.getType();
			resultList=new ModelMapper().map(getAllPosts,listType);
		}
		return resultList;
	}

}
