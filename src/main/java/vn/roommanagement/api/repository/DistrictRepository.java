package vn.roommanagement.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import vn.roommanagement.api.entity.District;
@Repository
public interface DistrictRepository extends JpaRepository<District, String> {
}
