package vn.roommanagement.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vn.roommanagement.api.entity.District;
import vn.roommanagement.api.repository.DistrictRepository;

import java.util.List;

@Service
public interface DistrictService {

    List<District> getDistrictsByProvince(String provinceCode);
}