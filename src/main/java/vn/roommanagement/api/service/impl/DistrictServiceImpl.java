package vn.roommanagement.api.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import vn.roommanagement.api.dto.response.DistrictResponseDto;
import vn.roommanagement.api.entity.District;
import vn.roommanagement.api.repository.DistrictRepository;
import vn.roommanagement.api.service.DistrictService;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class DistrictServiceImpl implements DistrictService {

    private final DistrictRepository districtRepository;

    @Override
    public List<DistrictResponseDto> getDistrictsByProvince(String provinceCode) {
       List<District> districts =  districtRepository.findByProvinceCode(provinceCode);

        return districts.stream().map(DistrictResponseDto::districtResponseDto).collect(Collectors.toList());
    }
}
