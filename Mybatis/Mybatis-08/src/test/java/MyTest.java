import Mapper.BlogMapper;
import org.apache.ibatis.cache.Cache;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import pojo.Blog;
import utility.IDutils;
import utility.Mybatis;

import java.io.InputStream;
import java.io.OutputStream;
import java.sql.Blob;
import java.sql.Date;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MyTest {
    @Test
    public void addTest(){
        SqlSession sqlSession = Mybatis.getSqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
        Blog blog = new Blog();
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        blog.setAuthoe("老王");
        blog.setCreateTime(df.format(System.currentTimeMillis()));
        blog.setId(IDutils.getID());
        blog.setViews(99999);
        blog.setTitle("窗前明月光，地上鞋两双");
        mapper.add(blog);
    }

    @Test
    public void addTest2(){
        SqlSession sqlSession = Mybatis.getSqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
        HashMap<Object, Object> map = new HashMap<>();
        List<Blog> blogs = mapper.add2(map);
        for (Blog blog : blogs) {
            System.out.println(blog);
        }
    }

    @Test
    public void Update(){
        SqlSession sqlSession = Mybatis.getSqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
        HashMap<Object, Object> map = new HashMap<>();
        map.put("title","Hello");
        List<Blog> update = mapper.update(map);
        for (Blog blog : update) {
            System.out.println(blog);
        }
    }

    @Test
    public void if_SQL(){
        SqlSession sqlSession = Mybatis.getSqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
        HashMap<Object,Object> map = new HashMap<>();
        map.put("title","隔壁");
        List<Blog> blogs = mapper.add3(map);
        for (Blog blog : blogs) {
            System.out.println(blog);
        }
    }


    @Test
    public void Foreach(){
        SqlSession sqlSession = Mybatis.getSqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);

        HashMap<Object, Object> map = new HashMap<>();

        ArrayList<Object> ids = new ArrayList<>();
        map.put("ids",ids);
        List<Blog> blogs = mapper.add4(map);
        for (Blog blog : blogs) {
            System.out.println(blog);
        }

    }
}
