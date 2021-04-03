import Mapper.UserMapper;
import org.apache.ibatis.session.SqlSession;
import pojo.User;
import utility.Mybatis;

import java.util.HashMap;
import java.util.List;

public class Test {

    @org.junit.Test
    public void TestUserList(){
        SqlSession sqlSession = Mybatis.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> userList = mapper.getUserList(1);
        for (User user : userList) {
            System.out.println(user);
        }
    }

    @org.junit.Test
    public void TestUserList2(){
        SqlSession sqlSession = Mybatis.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        HashMap<Object, Object> map = new HashMap<>();
        map.put("userid",1);
        List<User> userList2 = mapper.getUserList2(map);
        for (User user : userList2) {
            System.out.println(user);
        }
        sqlSession.close();
    }

    @org.junit.Test
    public void TestAdd(){
        SqlSession sqlSession = Mybatis.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        mapper.add(new User(2,"小王","12345"));
        sqlSession.commit();
        sqlSession.close();
    }

    @org.junit.Test
    public void TestUpdate(){
        SqlSession sqlSession = Mybatis.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        mapper.Update(new User(3,"老李","524987"));
        sqlSession.commit();
        sqlSession.close();
    }

    @org.junit.Test
    public void TestDelete(){
        SqlSession sqlSession = Mybatis.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        mapper.delete(3);
        sqlSession.commit();
        sqlSession.close();
    }

}
