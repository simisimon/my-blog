package com.blog.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.blog.services.PostService;
import com.blog.entities.Post;

import java.util.List;

@RestController
@RequestMapping(value = "/api/blog")
public class PostController {

    private final PostService postService;

    @Autowired
    public PostController(PostService postService) {
        this.postService = postService;
    }

    @GetMapping(value = "test")
    public String test() {
        return "Hello from the Blog Controller!";
    }

    @GetMapping(value = "all")
    public List<Post> getAllPosts() {
        return postService.getAllPosts();
    }

    @PostMapping
    public void addPost(@RequestBody Post post) {
        postService.addPost(post);
    }

    @DeleteMapping(path = "{postID}")
    public void deletePost(@PathVariable Long postID) {
        postService.deletePost(postID);
    }

}