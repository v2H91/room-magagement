package vn.roommanagement.api.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;
import java.util.UUID;

@Entity
@Data
@Table(name = "user_token_temp")
@NoArgsConstructor
@AllArgsConstructor
public class UserToken {
    @Id
    @Column(name = "id_token")
    private String id;

    @Column(name = "token")
    private String token;

    @Column(name = "is_active")
    private boolean isActive;

    @Column(name = "user_id")
    private String userId;

    @Column(name = "expired_time")
    private Timestamp expiredTime;

    public UserToken(String token, String userId, boolean isActive, Timestamp expiredTime) {
        this.token = token;
        this.isActive=  isActive;
        this.expiredTime = expiredTime;
        this.userId = userId;
        this.id = UUID.randomUUID().toString();
    }
}