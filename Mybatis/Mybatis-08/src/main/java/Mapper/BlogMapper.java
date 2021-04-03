package Mapper;

import pojo.Blog;

import java.util.List;
import java.util.Map;

public interface BlogMapper {
    void add(Blog blog);

    List<Blog> add2(Map<Object,Object> map);

    List<Blog> add3(Map<Object,Object> map);

    List<Blog> add4(Map<Object,Object> map);

    List<Blog> update(Map map);


}
