package pojo;

public class Student {
    private int id;
    private String name;
    private Teacher Teacher;

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", tid=" + Teacher +
                '}';
    }
}
