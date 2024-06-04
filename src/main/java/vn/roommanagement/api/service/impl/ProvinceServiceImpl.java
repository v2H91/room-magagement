package vn.roommanagement.api.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vn.roommanagement.api.entity.Province;
import vn.roommanagement.api.repository.ProvinceRepository;
import vn.roommanagement.api.service.ProvinceService;

import java.util.List;
@Service
@RequiredArgsConstructor
public class ProvinceServiceImpl implements ProvinceService {

    @Autowired
    private  ProvinceRepository provinceRepository;

    @Override
    public List<Province> getAllProvinces() {
        return provinceRepository.findAll();
    }
}
