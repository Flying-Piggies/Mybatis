import Mapper.UserMapper;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import pojo.User;
import utility.Mybatis;

import java.util.HashMap;
import java.util.List;

public class MyTest {
    @Test
    public void Test(){
        SqlSession sqlSession = Mybatis.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> userList = mapper.getUserList();
        for (User user : userList) {
            System.out.println(user);
        }
    }

    @Test
    public void TestList2(){
        SqlSession sqlSession = Mybatis.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        HashMap<Object,Object> map = new HashMap<>();
        map.put("id",1);
        List<User> userList2 = mapper.getUserList2(map);
        userList2.forEach(user -> {
            System.out.println(userList2);
        });
    }

    @Test
    public void Insert(){
        SqlSession sqlSession = Mybatis.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        mapper.add(new User(3,"小王","123456897"));
        sqlSession.close();
    }
}
