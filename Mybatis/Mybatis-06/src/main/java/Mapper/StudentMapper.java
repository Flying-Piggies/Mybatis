package Mapper;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import pojo.Student;

import java.util.List;

public interface StudentMapper {

     List<Student> getStudent();
     List<Student> getStudent2();
}
