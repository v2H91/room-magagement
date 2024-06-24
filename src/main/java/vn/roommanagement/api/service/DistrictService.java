package vn.roommanagement.api.service;

import org.springframework.stereotype.Service;
import vn.roommanagement.api.dto.response.DistrictResponseDto;
import vn.roommanagement.api.entity.District;

import java.util.List;
import java.util.Optional;

@Service
public interface DistrictService {

    List<DistrictResponseDto> getDistrictsByProvince(String provinceCode);
    District getById(String id);
}
