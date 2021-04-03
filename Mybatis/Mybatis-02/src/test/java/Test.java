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

}
