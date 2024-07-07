package com.naveen.SpringRest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.naveen.SpringRest.repo.JobRepo;
import com.naveen.SpringRest.model.JobPost;

@Service
public class JobService {
	@Autowired
	public JobRepo repo;

	//method to return all JobPosts
	public List<JobPost> returnAllJobPosts() {
		return repo.returnAllJobPosts();
	}
	
	// method to add a jobPost
	public void addJobPost(JobPost jobPost) {
		 repo.addJobPost(jobPost);
	
	}

	public JobPost getJob(int postId){
		return repo.getPost(postId);
	}

	public void updateJob(JobPost job) {
		repo.updateJob(job);
	}

	public void deleteJob(int postId) {
		repo.deleteJob(postId);
	}
}
