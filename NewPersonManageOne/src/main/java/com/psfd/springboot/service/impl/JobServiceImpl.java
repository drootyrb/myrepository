package com.psfd.springboot.service.impl;

import com.psfd.springboot.dao.JobDao;
import com.psfd.springboot.domain.Job;
import com.psfd.springboot.service.IJobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobServiceImpl implements IJobService {

    @Autowired
    private JobDao jobDao;

    @Override
    public void addJob(Job job) {
        jobDao.addJob(job);
    }

    @Override
    public List<Job> queryAllJob() {
        return jobDao.queryAllJob();
    }

    @Override
    public void deleteJob(Job job) {
        jobDao.deleteJob(job);
    }

    @Override
    public Job queryJobById(Integer id) {
        return jobDao.queryJobById(id);
    }

    @Override
    public void updateJobById(Job job) {
        jobDao.updateJobById(job);
    }

    @Override
    public List<Job> queryAllJobOne() {
        return jobDao.queryAllJobOne();
    }
}
