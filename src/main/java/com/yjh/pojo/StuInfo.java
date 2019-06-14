package com.yjh.pojo;

import com.yjh.vo.TeacherInfoVo;

public class StuInfo {
    int stuId;
    int classId;
    String stuName;
    int stuAge;
    String stuSex;
    TeacherInfoVo teacherInfoVo;

    public TeacherInfoVo getTeacherInfoVo() {
        return teacherInfoVo;
    }

    public void setTeacherInfoVo(TeacherInfoVo teacherInfoVo) {
        this.teacherInfoVo = teacherInfoVo;
    }

    public int getStuId() {
        return stuId;
    }

    public void setStuId(int stuId) {
        this.stuId = stuId;
    }

    public int getClassId() {
        return classId;
    }

    public void setClassId(int classId) {
        this.classId = classId;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public int getStuAge() {
        return stuAge;
    }

    public void setStuAge(int stuAge) {
        this.stuAge = stuAge;
    }

    public String getStuSex() {
        return stuSex;
    }

    public void setStuSex(String stuSex) {
        this.stuSex = stuSex;
    }

    @Override
    public String toString() {
        return "StuInfo{" +
                "stuId=" + stuId +
                ", classId=" + classId +
                ", stuName='" + stuName + '\'' +
                ", stuAge=" + stuAge +
                ", stuSex='" + stuSex + '\'' +
                ", teacherInfoVo=" + teacherInfoVo +
                '}';
    }
}
