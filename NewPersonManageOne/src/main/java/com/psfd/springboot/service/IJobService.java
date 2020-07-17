package com.psfd.springboot.service;

import com.psfd.springboot.domain.Job;

import java.util.List;

public interface IJobService {

    void addJob(Job job);

    List<Job> queryAllJob();

    void deleteJob(Job job);

    Job queryJobById(Integer id);

    void updateJobById(Job job);

    List<Job> queryAllJobOne();
}
