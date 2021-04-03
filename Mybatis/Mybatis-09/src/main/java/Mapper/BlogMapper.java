package Mapper;

import org.apache.ibatis.annotations.Param;
import pojo.Blog;

import java.util.List;
import java.util.Map;

public interface BlogMapper {
    Blog getUser(@Param("id") String id);
}
