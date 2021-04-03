package pojo;
@SuppressWarnings("all")//压制书写错误
public class Blog {
    private String id;
    private String title;
    private String authoe;
    private String createTime;
    private int views;

    public Blog() {
    }

    public Blog(String id, String title, String authoe, String createTime, int views) {
        this.id = id;
        this.title = title;
        this.authoe = authoe;
        this.createTime = createTime;
        this.views = views;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthoe() {
        return authoe;
    }

    public void setAuthoe(String authoe) {
        this.authoe = authoe;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }

    @Override
    public String toString() {
        return "Blog{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", authoe='" + authoe + '\'' +
                ", createTime='" + createTime + '\'' +
                ", views=" + views +
                '}';
    }
}
