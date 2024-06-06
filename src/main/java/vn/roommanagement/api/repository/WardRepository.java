package vn.roommanagement.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import vn.roommanagement.api.entity.Ward;

import java.util.List;

@Repository
public interface WardRepository extends JpaRepository<Ward, String> {

    @Query(value ="select * from wards a where a.district_code = :districtCode", nativeQuery = true)
    List<Ward>findByDistrictCode(String districtCode);
}
