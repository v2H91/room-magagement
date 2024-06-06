package vn.roommanagement.api.controller;


import lombok.RequiredArgsConstructor;
import org.apache.catalina.util.StringUtil;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import vn.roommanagement.api.common.ObjectResponse;
import vn.roommanagement.api.common.ResponseApi;
import vn.roommanagement.api.dto.response.DistrictResponseDto;
import vn.roommanagement.api.entity.District;
import vn.roommanagement.api.repository.DistrictRepository;
import vn.roommanagement.api.service.DistrictService;
import vn.roommanagement.config.BaseResponse;

import java.util.List;

@RestController
@RequestMapping("/api/v1/district")
@RequiredArgsConstructor
public class DistrictController {

    @Autowired
    private DistrictService districtService;

    @GetMapping("/{provinceCode}")
    public BaseResponse<List<DistrictResponseDto>> getDistrictsByProvince(@PathVariable String provinceCode) {
//        return new ResponseApi(districtService.getDistrictsByProvince(provinceCode));
        return  BaseResponse.ofSucceeded( districtService.getDistrictsByProvince(provinceCode));
    }


}
