package com.hust.blogapp.service.impl;

import com.hust.blogapp.entity.Comment;
import com.hust.blogapp.payload.CommentDTO;
import com.hust.blogapp.repository.CommentRepository;
import com.hust.blogapp.service.CommentService;
import org.springframework.stereotype.Service;

@Service
public class CommentServiceImpl implements CommentService {

    private final CommentRepository commentRepository;

    public CommentServiceImpl(CommentRepository commentRepository) {
        this.commentRepository = commentRepository;
    }

    @Override
    public CommentDTO createComment(long postId, CommentDTO commentDTO) {
        return null;
    }

    private CommentDTO mapToDTO(Comment comment) {
        CommentDTO commentDTO = new CommentDTO();
        commentDTO.setId(comment.getId());
        commentDTO.setBody(comment.getBody());
        commentDTO.setEmail(comment.getEmail());
        commentDTO.setName(comment.getName());
    }
}
