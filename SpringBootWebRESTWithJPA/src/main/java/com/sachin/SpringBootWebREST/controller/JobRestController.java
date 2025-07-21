package com.sachin.SpringBootWebREST.controller;

import com.sachin.SpringBootWebREST.model.JobPost;
import com.sachin.SpringBootWebREST.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//@Controller
@RestController
@CrossOrigin(origins = "http://localhost:3000/")
public class JobRestController {

    @Autowired
    private JobService service;

    @GetMapping("jobPosts")
    //@ResponseBody
    public List<JobPost>  getAllJobs(){
        return service.getAllJobs();
    }

    @GetMapping("jobPost/{postId}")
    public JobPost getJob(@PathVariable("postId") int  postId){
        return service.getJob(postId);

    }


    @PostMapping("jobPost")
    public void addJob(@RequestBody JobPost jobPost){
        service.addJob(jobPost);
    }


    @PutMapping("jobPost")
    public JobPost updateJob(@RequestBody JobPost jobPost){
        service.updateJob(jobPost);
        return service.getJob(jobPost.getPostId());
    }


    @DeleteMapping("jobPost/{postId}")
    public String deleteJob(@PathVariable int postId){
         service.deleteJob(postId);
         return "Deleted";
    }


    @GetMapping("jobPosts/keyword/{keyword}")
    public List<JobPost> searchByKeyword(@PathVariable("keyword")  String keyword){
        return service.search(keyword);
    }

    @GetMapping("load")
    public String loadData(){
        service.load();
        return "success";
    }


}


