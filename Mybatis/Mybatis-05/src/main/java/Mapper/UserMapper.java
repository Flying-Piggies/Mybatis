package Mapper;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import pojo.User;

import java.util.List;
import java.util.Map;

public interface UserMapper {
        @Select("select * from mybatis.user")
        List<User> getUserList();
        @Select("select * from mybatis.user where id=#{id}")
        List<User> getUserList2(Map map);
        @Insert("insert into mybatis.user(id,name)values(#{id},#{name})")
        void add(User user);
        @Delete("delete from mybatis.user where id=#{id}")
        void delete(@Param("id") int id); //只在基本数据类型的前面加上Param，确保括号里面的要和Mysql中的字段名一致，java优先遍历Param；
        void Update(User user);

        //        分页查询
        List<User> getUserLimit(Map<Object,Integer> map);
}
