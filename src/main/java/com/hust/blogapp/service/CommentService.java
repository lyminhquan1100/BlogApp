package com.hust.blogapp.service;

import com.hust.blogapp.payload.CommentDTO;

public interface CommentService {
    CommentDTO createComment(long postId,CommentDTO commentDTO);
}
