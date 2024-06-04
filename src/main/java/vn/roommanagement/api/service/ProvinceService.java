package vn.roommanagement.api.service;

import vn.roommanagement.api.entity.Province;

import java.util.List;

public interface ProvinceService {

    List<Province>getAllProvinces();
    List<Province>getByProvinceCode(String provinceCode);
}
