import Mapper.TeacherMapper;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import pojo.Teacher;
import utility.Mybatis;

import java.util.List;

public class MyTest {
    @Test
    public void getTeacher(){
        SqlSession sqlSession = Mybatis.getSqlSession();
        TeacherMapper mapper = sqlSession.getMapper(TeacherMapper.class);
        Teacher teacher = mapper.getTeacher(1);
        System.out.println(teacher);
    }

    @Test
    public void getTeacher2(){
        SqlSession sqlSession = Mybatis.getSqlSession();
        TeacherMapper mapper = sqlSession.getMapper(TeacherMapper.class);
        Teacher teacher =  mapper.getTeacher2(1);
        System.out.println(teacher);
    }
}
