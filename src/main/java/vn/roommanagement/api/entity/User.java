package vn.roommanagement.api.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

import java.sql.Timestamp;

@Entity
@Table(name = "user")
@Data
public class User {
    @Id
    @Column(name = "id", nullable = false)
    private String id;

    @Column(name = "name")
    private String name;

    @Column(name = "phone")
    private String phone;

    @Column(name = "birthday")
    private Timestamp birthday;

    @Column(name = "address")
    private String address;

    @Column(name = "email")
    private String email;

    @Column(name = "password")
    private String password;

    @Column(name = "roles_id")
    private short rolesId;

    @Column(name = "url_avatar", columnDefinition = "VARCHAR(255) DEFAULT ''")
    private String urlAvatar;

    @Column(name = "delete_flag", columnDefinition = "TINYINT(1) DEFAULT '0'")
    private boolean deleteFlag;

    @Column(name = "status", columnDefinition = "TINYINT(1) DEFAULT '1'")
    private boolean status;

}

