import Mapper.UserMapper;
import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import pojo.User;
import utility.Mybatis;

import java.util.HashMap;
import java.util.List;

public class Test {
    static Logger logger = Logger.getLogger(Test.class);
    @org.junit.Test
    public void TestUserList(){
        SqlSession sqlSession = Mybatis.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> userList = mapper.getUserList(2);
        for (User user : userList) {
//          类似于System.out.println(user);
            logger.info(user);
//            debug形式输出
            logger.debug(user);

        }
        userList.forEach(user -> {
//       forEach中建议使用
            logger.error(user);
        });
    }

    @org.junit.Test
    public void TestUserLimit(){
        SqlSession sqlSession = Mybatis.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        HashMap<Object,Integer> map = new HashMap<>();
        map.put("head",0);
        map.put("end",2);
        List<User> user = mapper.getUserLimit(map);
        for (User user1 : user) {
            System.out.println(user1);
        }
    }
}
