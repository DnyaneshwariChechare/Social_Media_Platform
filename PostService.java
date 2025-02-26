package com.service;

public class PostService {

    private final PostDAO postDAO = new PostDAO();

    public void createPost(Post post) {
        postDAO.savePost(post);
    }
}
