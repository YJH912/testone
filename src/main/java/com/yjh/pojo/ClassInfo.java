package com.yjh.pojo;

public class ClassInfo {
    int classId;
    String className;
    String Dsc;
    TeacherInfo teacherInfo;
    StuInfo stuInfo;

    public int getClassId() {
        return classId;
    }

    public void setClassId(int classId) {
        this.classId = classId;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getDsc() {
        return Dsc;
    }

    public void setDsc(String dsc) {
        Dsc = dsc;
    }

    public TeacherInfo getTeacherInfo() {
        return teacherInfo;
    }

    public void setTeacherInfo(TeacherInfo teacherInfo) {
        this.teacherInfo = teacherInfo;
    }

    public StuInfo getStuInfo() {
        return stuInfo;
    }

    public void setStuInfo(StuInfo stuInfo) {
        this.stuInfo = stuInfo;
    }

    @Override
    public String toString() {
        return "ClassInfo{" +
                "classId=" + classId +
                ", className='" + className + '\'' +
                ", Dsc='" + Dsc + '\'' +
                ", teacherInfo=" + teacherInfo +
                ", stuInfo=" + stuInfo +
                '}';
    }
}
