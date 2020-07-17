package com.psfd.springboot.dao;

import com.psfd.springboot.domain.Job;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface JobDao {


    void addJob(Job job);

    List<Job> queryAllJob();

    void deleteJob(Job job);

    Job queryJobById(Integer id);

    void updateJobById(Job job);

    List<Job> queryAllJobOne();
}
