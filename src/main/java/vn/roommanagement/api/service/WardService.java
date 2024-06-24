package vn.roommanagement.api.service;

import org.springframework.stereotype.Service;
import vn.roommanagement.api.dto.response.WardResponseDto;
import vn.roommanagement.api.entity.Ward;

import java.util.List;
import java.util.Optional;

@Service
public interface  WardService {
    List<WardResponseDto> getByDistrictCode(String districtCode);
    List<WardResponseDto> getAll ();


}
