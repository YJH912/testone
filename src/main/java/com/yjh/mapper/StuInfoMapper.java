package com.yjh.mapper;

import com.yjh.pojo.ClassInfo;
import com.yjh.pojo.StuInfo;
import com.yjh.pojo.TeacherInfo;
import com.yjh.vo.StuInfoVo;
import com.yjh.vo.TeacherInfoVo;

import java.util.List;
import java.util.Map;

public interface StuInfoMapper {

    public List<StuInfo>getStuInfoByGirl(StuInfo stuInfo);

    public List<StuInfo>getBoyByAge(StuInfoVo stuInfoVo);

    public List<StuInfo>getLaoJiangStuInfo(TeacherInfo teacherInfo);

    public List<ClassInfo>getClassList(Map map);

    public List<ClassInfo>getAllList(ClassInfo classInfo);
}
