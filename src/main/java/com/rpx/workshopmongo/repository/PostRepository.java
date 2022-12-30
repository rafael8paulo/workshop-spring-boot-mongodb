package com.rpx.workshopmongo.repository;

import com.rpx.workshopmongo.domain.Post;
import com.rpx.workshopmongo.domain.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends MongoRepository<Post, String> { }