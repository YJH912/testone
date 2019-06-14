package com.yjh.vo;

public class TeacherInfoVo {
    int teacherId;
    String teacherName;
    StuInfoVo stuInfoVo;

    public int getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(int teacherId) {
        this.teacherId = teacherId;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public StuInfoVo getStuInfoVo() {
        return stuInfoVo;
    }

    public void setStuInfoVo(StuInfoVo stuInfoVo) {
        this.stuInfoVo = stuInfoVo;
    }

    @Override
    public String toString() {
        return "TeacherInfoVo{" +
                "teacherId=" + teacherId +
                ", teacherName='" + teacherName + '\'' +
                ", stuInfoVo=" + stuInfoVo +
                '}';
    }
}
