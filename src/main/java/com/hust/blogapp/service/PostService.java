package com.hust.blogapp.service;

import com.hust.blogapp.payload.PostDTO;
import com.hust.blogapp.payload.PostResponse;

public interface PostService {
    PostDTO createPost(PostDTO postDTO);

    PostResponse getAllPost(int page, int size, String sortBy,String sortDir);

    PostDTO getPostById(Long id);

    PostDTO updatePost (PostDTO postDTO, long id);

    void deletePostById(Long id);
}
