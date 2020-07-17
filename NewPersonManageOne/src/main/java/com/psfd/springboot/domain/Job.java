package com.psfd.springboot.domain;

import java.util.Date;

/**
 * 应聘人员类
 */


public class Job {
    private Long id;
    private String name;
    private Byte sex;
    private Integer age;
    private String job;
    private String specialty;           //所学专业
    private String experience;          //工作经验
    private String studyeffort;         //学历
    private String school;
    private String tel;
    private String email;
    private Date createtime;
    private String content;
    private Byte isstock;


    public Long getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Job{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sex=" + sex +
                ", age=" + age +
                ", job='" + job + '\'' +
                ", specialty='" + specialty + '\'' +
                ", experience='" + experience + '\'' +
                ", studyeffort='" + studyeffort + '\'' +
                ", school='" + school + '\'' +
                ", tel='" + tel + '\'' +
                ", email='" + email + '\'' +
                ", createtime=" + createtime +
                ", content='" + content + '\'' +
                ", isstock=" + isstock +
                '}';
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Byte getSex() {
        return sex;
    }

    public void setSex(Byte sex) {
        this.sex = sex;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

    public String getStudyeffort() {
        return studyeffort;
    }

    public void setStudyeffort(String studyeffort) {
        this.studyeffort = studyeffort;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Byte getIsstock() {
        return isstock;
    }

    public void setIsstock(Byte isstock) {
        this.isstock = isstock;
    }
}
