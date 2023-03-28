package com.rpx.workshopmongo.service;

import com.rpx.workshopmongo.domain.Post;
import com.rpx.workshopmongo.domain.User;
import com.rpx.workshopmongo.repository.PostRepository;
import com.rpx.workshopmongo.service.exception.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PostService {

    @Autowired
    private PostRepository repository;

    public Post findById(String id) {
        Optional<Post> obj = repository.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
    }
    public List<Post> findByTitle(String text){
//        return repository.findByTitleContainingIgnoreCase(text);
        return repository.searchTitle(text);
    }
}
