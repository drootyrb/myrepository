package com.psfd.springboot.controller;

import com.psfd.springboot.domain.Job;
import com.psfd.springboot.service.IJobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.Date;
import java.util.List;

@Controller
public class JobController {
    @Autowired
    private IJobService jobService;

    @RequestMapping("/addJob")
    @ResponseBody
    public String addJob(Job job) {
        System.out.println("job = " + job);
        Byte b = 0;
        job.setCreatetime(new Date());
        job.setIsstock(b);
        jobService.addJob(job);
        return "增加應聘人員成功";
    }

    @RequestMapping("/addjobTemp")
    public String addjobTemp() {
        return "job/addjob";
    }


    @RequestMapping("/queryAllJob")
    public ModelAndView queryAll(ModelAndView modelAndView) {
        List<Job> jobList = jobService.queryAllJob();
        System.out.println("jobList = " + jobList);
        modelAndView.setViewName("job/listjob");
        modelAndView.addObject("jobList", jobList);
        return modelAndView;
    }

    @RequestMapping("/queryAllJobOne")
    public ModelAndView queryAllOne(ModelAndView modelAndView) {
        List<Job> jobList = jobService.queryAllJobOne();
        System.out.println("jobList = " + jobList);
        modelAndView.setViewName("job/listjobone");
        modelAndView.addObject("jobList", jobList);
        return modelAndView;
    }


    @RequestMapping("/queryJobById")
    public ModelAndView queryJobById(ModelAndView modelAndView, Integer id) {
        System.out.println("id = " + id);
        Job job = jobService.queryJobById(id);
        System.out.println("job = " + job);
        modelAndView.setViewName("job/detailjob");
        modelAndView.addObject("job", job);
        return modelAndView;

    }


    @RequestMapping("/deleteJob")
    public String deleteJob(Job job) {
        System.out.println("job = " + job);
        jobService.deleteJob(job);
        return "success";
    }

    @RequestMapping("/updateJobById")
    public String updateJobById(Job job) {
        System.out.println(job.getId());
        jobService.updateJobById(job);
        return "success";
    }

}
