package com.blog.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.blog.repositories.PostRepository;
import com.blog.entities.Post;

import java.util.List;
import java.util.Optional;

@Service
public class PostService {

    private final PostRepository repo;

    @Autowired
    public PostService(PostRepository repo) {
        this.repo = repo;
    }

    public List<Post> getAllPosts() {
        return repo.findAll();

    }

    public void addPost(Post post) {
        repo.save(post);
    }

    public void deletePost(Long postId) {
        Optional<Post> post = repo.findById(postId);

        if (post.isPresent()) {
            repo.deleteById(postId);
        } else {
            throw new IllegalStateException("Post with ID: " + postId + " does not exist.");
        }

    }

}
