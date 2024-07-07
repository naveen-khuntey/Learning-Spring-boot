package com.naveen.SpringRest.controller;

import com.naveen.SpringRest.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import com.naveen.SpringRest.model.JobPost;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class JobController {

    @Autowired
	private JobService service;

    @GetMapping("/posts")
    public List<JobPost> getAllJobs(){
        return service.returnAllJobPosts();
    }

    @GetMapping("/post/{postId}")
    public JobPost getJob(@PathVariable("postId") int postID){
        return service.getJob(postID);
    }

    @PostMapping("/posts")
    public JobPost addJob(@RequestBody JobPost job){
        service.addJobPost(job);
        return service.getJob(job.getPostId());
    }

    @PutMapping("/posts")
    public JobPost updateJob(@RequestBody JobPost job){
        service.updateJob(job);
        return service.getJob(job.getPostId());
    }

    @DeleteMapping("/post/{PostId}")
    public String deleteJob(@PathVariable("PostId") int postId){
        service.deleteJob(postId);
        return "deleted";
    }
}
