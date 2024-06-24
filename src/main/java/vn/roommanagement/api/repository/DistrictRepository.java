package vn.roommanagement.api.repository;

import jakarta.validation.Valid;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import vn.roommanagement.api.entity.District;
import java.util.List;

@Repository
public interface DistrictRepository extends JpaRepository<District, String> {

    List<District> findByProvinceCode(String provinceCode);

    @Query(value = "SELECT a from District a where code = :id")
    District findByCode(@Param("id") String id);
}
