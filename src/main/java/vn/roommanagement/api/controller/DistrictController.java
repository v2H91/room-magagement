package vn.roommanagement.api.controller;


import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import vn.roommanagement.api.dto.response.DistrictResponseDto;

import vn.roommanagement.api.entity.District;
import vn.roommanagement.api.service.DistrictService;
import vn.roommanagement.config.BaseResponse;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/district")
@RequiredArgsConstructor
public class DistrictController {

    @Autowired
    private DistrictService districtService;

    @GetMapping("/{provinceCode}")
    public BaseResponse<List<DistrictResponseDto>> getDistrictsByProvince(@PathVariable String provinceCode) {
        return  BaseResponse.ofSucceeded( districtService.getDistrictsByProvince(provinceCode));
    }


}
