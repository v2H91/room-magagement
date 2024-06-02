package vn.roommanagement.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import vn.roommanagement.api.entity.Province;

@Repository
public interface ProvinceRepository extends JpaRepository<Province, String> {
}
