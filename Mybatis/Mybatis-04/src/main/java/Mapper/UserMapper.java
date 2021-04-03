package Mapper;

import pojo.User;

import java.util.List;
import java.util.Map;

public interface UserMapper {
        List<User> getUserList(int id);
        List<User> getUserList2(Map map);
        void add(User user);
        void delete(int id);
        void Update(User user);

//        分页查询
        List<User> getUserLimit(Map<Object,Integer> map);
}
