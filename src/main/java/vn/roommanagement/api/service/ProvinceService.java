package vn.roommanagement.api.service;

import org.springframework.stereotype.Service;
import vn.roommanagement.api.dto.response.ProvinceResponseDto;
import vn.roommanagement.api.entity.Province;

import java.util.List;
@Service
public interface ProvinceService {

    List<ProvinceResponseDto> getAllProvinces();
    List<ProvinceResponseDto>getByProvinceCode(String provinceCode);
}
