package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.Tweet;
import com.example.demo.Service.TweetService;

@RestController
public class TweetController {
	
	@Autowired
	public TweetService tweetService;
	
	@RequestMapping("/getByHashtag")
	public List<Tweet> getTweetByHashtag(@RequestParam String hashtag){
		return tweetService.getTweetsByHashtag(hashtag);
	}
	
	@RequestMapping("/getByUserid")
	public List<Tweet> getTweetByUserid(@RequestParam String userid){
		return tweetService.getTweetsByUserId(userid);
	}
}
