import Mapper.BlogMapper;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import pojo.Blog;
import utility.Mybatis;

public class MyTest {


    @Test
    public void GetUser(){
        SqlSession sqlSession = Mybatis.getSqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
        Blog blog = mapper.getUser("hello");
        System.out.println(blog);

        System.out.println("====================================================");

        Blog blog1 = mapper.getUser("hello");
        System.out.println(blog1);
    }
}
