package com.yjh.pojo;

public class TeacherInfo {
    int teacherId;
    String teacherName;
    StuInfo stuInfo;

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

    public StuInfo getStuInfo() {
        return stuInfo;
    }

    public void setStuInfo(StuInfo stuInfo) {
        this.stuInfo = stuInfo;
    }

    @Override
    public String toString() {
        return "TeacherInfo{" +
                "teacherId=" + teacherId +
                ", teacherName='" + teacherName + '\'' +
                ", stuInfo=" + stuInfo +
                '}';
    }
}
