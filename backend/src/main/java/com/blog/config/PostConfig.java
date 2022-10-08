package com.blog.config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.blog.entities.Post;
import com.blog.repositories.PostRepository;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class PostConfig {

    @Bean
    CommandLineRunner commandLineRunner(PostRepository repo) {
        return args -> {

            repo.deleteAll();

            Post post1 = new Post(
                    "Tim",
                    "Moin",
                    "Servus",
                    LocalDate.of(2022, Month.FEBRUARY, 5));

            Post post2 = new Post(
                    "Seb",
                    "Title",
                    "Text",
                    LocalDate.of(2022, Month.FEBRUARY, 5));

            repo.saveAll(List.of(post1, post2));
        };
    }
    
}
