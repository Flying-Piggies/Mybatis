import Mapper.StudentMapper;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import pojo.Student;
import utility.Mybatis;

import java.util.List;

public class MyTest {
    public static void main(String[] args) {
        SqlSession sqlSession = Mybatis.getSqlSession();
        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
        List<Student> student = mapper.getStudent();
        for (Student student1 : student) {
            System.out.println(student1);
        }
    }

    @Test
    public void TestTeacher(){
        SqlSession sqlSession = Mybatis.getSqlSession();
        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
        List<Student> student = mapper.getStudent2();
        for (Student student1 : student) {
            System.out.println(student1);
        }
    }
}
