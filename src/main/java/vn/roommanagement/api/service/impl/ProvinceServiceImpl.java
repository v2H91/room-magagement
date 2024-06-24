package vn.roommanagement.api.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vn.roommanagement.api.dto.response.ProvinceResponseDto;
import vn.roommanagement.api.entity.Province;
import vn.roommanagement.api.repository.ProvinceRepository;
import vn.roommanagement.api.service.ProvinceService;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ProvinceServiceImpl implements ProvinceService {

    @Autowired
    private  ProvinceRepository provinceRepository;

    @Override
    public List<ProvinceResponseDto> getAllProvinces() {

     List<Province> provinces = provinceRepository.findAll();
        return provinces.stream().map(ProvinceResponseDto::provinceDto).collect(Collectors.toList());
    }

    @Override
    public List<ProvinceResponseDto> getByProvinceCode(String provinceCode) {
        List<Province> provinces = provinceRepository.findByCode(provinceCode);
        return provinces.stream().map(ProvinceResponseDto::provinceDto).collect(Collectors.toList());
    }
}
