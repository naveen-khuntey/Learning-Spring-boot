package com.naveen.SpringBootJDBC.repository;

import com.naveen.SpringBootJDBC.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Repository
public class StudentRepository {

    private JdbcTemplate jdbc;

    public JdbcTemplate getJdbc() {
        return jdbc;
    }

    @Autowired
    public void setJdbc(JdbcTemplate jdbc) {
        this.jdbc = jdbc;
    }

    public void save(Student s) {
        String query = "insert into student(rollNo,name,marks) values(?,?,?)";
        int rows = jdbc.update(query,s.getRollNo(),s.getName(),s.getMarks());
        System.out.println(rows + " effected");
    }

    public List<Student> findAll() {
        String qrl = "select * from student order by rollNo";
        RowMapper<Student> mapper = new RowMapper<Student>() {
            @Override
            public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
                Student s = new Student();
                s.setRollNo(rs.getInt("rollNo"));
                s.setName(rs.getString("name"));
                s.setMarks(rs.getInt("marks"));
                return s;
            }
        };
//        RowMapper<Student> mapper = (rs,rowNum) -> {
//            Student s = new Student();
//            s.setRollNo(rs.getInt("rollNo"));
//            s.setName(rs.getString("name"));
//            s.setMarks(rs.getInt("marks"));
//            return s;
//        };
        return jdbc.query(qrl,mapper);
//        List<Student> st = new ArrayList<>();
//        return st;
    }
}
