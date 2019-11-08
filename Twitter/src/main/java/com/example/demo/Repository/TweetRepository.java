package com.example.demo.Repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Model.Tweet;

@Repository
public interface TweetRepository extends MongoRepository<Tweet,String>{
	public List<Tweet> findByHashtag(String hashtag);
	public List<Tweet> findByUserId(String userId);
}
