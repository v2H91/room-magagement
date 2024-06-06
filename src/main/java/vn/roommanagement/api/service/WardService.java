package vn.roommanagement.api.service;

import org.springframework.stereotype.Service;
import vn.roommanagement.api.dto.response.WardResponseDto;

import java.util.List;

@Service
public interface  WardService {
    List<WardResponseDto> getByDistrictCode(String districtCode);


}
