package vn.roommanagement.api.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vn.roommanagement.api.dto.response.WardResponseDto;
import vn.roommanagement.api.entity.Ward;
import vn.roommanagement.api.repository.WardRepository;
import vn.roommanagement.api.service.WardService;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class WardServiceImpl implements WardService {

    @Autowired
    WardRepository wardRepository;
    @Override
    public List<WardResponseDto> getByDistrictCode(String districtCode) {
        List<Ward> list = wardRepository.findByDistrictCode(districtCode);
        return list.stream().map(WardResponseDto::wardResponseDto).collect(Collectors.toList());
    }
}
