package vn.roommanagement.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import vn.roommanagement.api.entity.User;

public interface UserRepository extends JpaRepository<User, String> {

}
