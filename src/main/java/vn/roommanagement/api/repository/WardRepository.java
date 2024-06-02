package vn.roommanagement.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import vn.roommanagement.api.entity.Ward;

@Repository
public interface WardRepository extends JpaRepository<Ward, String> {
}
