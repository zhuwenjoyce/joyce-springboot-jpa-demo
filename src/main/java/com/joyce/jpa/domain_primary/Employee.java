package com.joyce.jpa.domain_primary;

import javax.persistence.*;
import java.util.Date;
import java.sql.Timestamp;

@Entity
@Table(name = "employee")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "username")
    private String username;

    @Column(name = "email")
    private String email;

    private String remark;

//    　　第一种：@Temporal(TemporalType.DATE)——>实体类会封装成日期“yyyy-MM-dd”的 Date类型。
//            　　第二种：@Temporal(TemporalType.TIME)——>实体类会封装成时间“hh-MM-ss”的 Date类型。
//            　　第三种：@Temporal(TemporalType.TIMESTAMP)——>实体类会封装成完整的时间“yyyy-MM-dd hh:MM:ss”的 Date类型。
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "birthday")
    private Date birthday;

    public String getEmail() {
        return email;
    }

    public Employee setEmail(String email) {
        this.email = email;
        return this;
    }

    public Integer getId() {
        return id;
    }

    public Employee setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getUsername() {
        return username;
    }

    public Employee setUsername(String username) {
        this.username = username;
        return this;
    }

    public String getRemark() {
        return remark;
    }

    public Employee setRemark(String remark) {
        this.remark = remark;
        return this;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
}
