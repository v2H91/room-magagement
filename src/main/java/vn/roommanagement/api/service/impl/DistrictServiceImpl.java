package vn.roommanagement.api.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import vn.roommanagement.api.entity.District;
import vn.roommanagement.api.repository.DistrictRepository;
import vn.roommanagement.api.service.DistrictService;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DistrictServiceImpl implements DistrictService {

    private final DistrictRepository districtRepository;

    @Override
    public List<District> getDistrictsByProvince(String provinceCode) {
        return districtRepository.findByProvinceCode(provinceCode);
    }
}
