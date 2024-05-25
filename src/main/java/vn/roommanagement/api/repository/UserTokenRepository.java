package vn.roommanagement.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import vn.roommanagement.api.entity.UserToken;

import java.util.Optional;

@Repository
public interface UserTokenRepository extends JpaRepository<UserToken, String> {
    Optional<UserToken> findByTokenAndUserId(String token, String userId);

    Optional<UserToken> findByUserId(String userId);
}
