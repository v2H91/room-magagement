package vn.roommanagement.api.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vn.roommanagement.api.dto.response.DistrictResponseDto;
import vn.roommanagement.api.dto.response.WardResponseDto;
import vn.roommanagement.api.entity.District;
import vn.roommanagement.api.entity.Ward;
import vn.roommanagement.api.repository.DistrictRepository;
import vn.roommanagement.api.repository.WardRepository;
import vn.roommanagement.api.service.WardService;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class WardServiceImpl implements WardService {

    @Autowired
    private WardRepository wardRepository;

    @Autowired
    private DistrictRepository districtRepository;

    @Override
    public List<WardResponseDto> getByDistrictCode(String districtCode) {
        Optional<District> district = districtRepository.findById(districtCode);
        List<Ward> list = wardRepository.findByDistrictCode(district);
        return list.stream().map(WardResponseDto::wardResponseDto).collect(Collectors.toList());
    }

    @Override
    public List<WardResponseDto> getAll() {
        List<Ward> list  = wardRepository.findAll();
        return list.stream().map(WardResponseDto::wardResponseDto).collect(Collectors.toList());
    }
}
