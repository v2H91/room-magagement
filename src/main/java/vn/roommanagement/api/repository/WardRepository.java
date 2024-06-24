package vn.roommanagement.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import vn.roommanagement.api.entity.District;
import vn.roommanagement.api.entity.Ward;

import java.util.List;
import java.util.Optional;

@Repository
public interface WardRepository extends JpaRepository<Ward, String> {

    @Query(value ="select a from Ward a where a.district = :district")
    List<Ward>findByDistrictCode(@Param("district") Optional<District> district);
}
