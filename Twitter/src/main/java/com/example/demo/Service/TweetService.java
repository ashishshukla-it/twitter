package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Model.Tweet;
import com.example.demo.Repository.TweetRepository;

@Service
public class TweetService {

	@Autowired
	public TweetRepository tweetRepository;

	// Get all tweets on the basis of hashtag
	public List<Tweet> getTweetsByHashtag(String hashtag) {
		return tweetRepository.findByHashtag(hashtag);
	}

	// Get all tweets on the basis of userid
	public List<Tweet> getTweetsByUserId(String userid) {
		return tweetRepository.findByUserId(userid);
	}

}
