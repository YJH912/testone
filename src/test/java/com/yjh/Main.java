package com.yjh;

import com.yjh.dao.BaseDao;
import com.yjh.mapper.StuInfoMapper;
import com.yjh.pojo.ClassInfo;
import com.yjh.pojo.StuInfo;
import com.yjh.pojo.TeacherInfo;
import com.yjh.vo.StuInfoVo;
import com.yjh.vo.TeacherInfoVo;
import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.List;

public class Main {

    BaseDao baseDao = new BaseDao();
    SqlSession sqlSession = baseDao.getSqlSession();
    StuInfoMapper mapper = sqlSession.getMapper(StuInfoMapper.class);


    /**
     * 找出所有女性学员信息
     */

    @Test
    public void Ts1(){
        StuInfo stuInfo = new StuInfo();
        stuInfo.setStuSex("女");
        List<StuInfo> stuInfoByGirl = mapper.getStuInfoByGirl(stuInfo);
        System.out.println(stuInfoByGirl);
        sqlSession.close();
    }

    /**
     * b)	找出年龄在20-25岁之间，男性学员的信息
     */
    @Test
    public void Ts2(){
        StuInfoVo stuInfoVo = new StuInfoVo();
        stuInfoVo.setMin(20);
        stuInfoVo.setMax(25);
        stuInfoVo.setStuSex("男");
        List<StuInfo> boyByAge = mapper.getBoyByAge(stuInfoVo);
        System.out.println(boyByAge);
        sqlSession.close();
    }

    /**
     * 	找出老江带过的学员信息
     */
    @Test
    public void Ts3(){
        TeacherInfo teacherInfo = new TeacherInfo();
        teacherInfo.setTeacherName("老江");
        List<StuInfo> laoJiangStuInfo = mapper.getLaoJiangStuInfo(teacherInfo);
        System.out.println(laoJiangStuInfo);
        sqlSession.close();
    }

    /**
     * e)	找出1807班所有学员及带班老师信息(学员及带班老师信息可重复)
     */
    @Test
    public void Ts4(){
        ClassInfo classInfo = new ClassInfo();
        classInfo.setClassName("Java1807");
        List<ClassInfo> allList = mapper.getAllList(classInfo);

        System.out.println(allList);

        sqlSession.close();
    }

    /**
     * d)	找出所有带过女性学员的老师带过的班级信息(去重复)
     */
    @Test
    public void Ts5(){
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("stuSex","女");
        List<ClassInfo> classList = mapper.getClassList(map);
        System.out.println(classList);
        sqlSession.close();

    }




}
