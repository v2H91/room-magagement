package vn.roommanagement.api.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import vn.roommanagement.api.dto.response.ProvinceResponseDto;
import vn.roommanagement.api.entity.Province;
import vn.roommanagement.api.service.ProvinceService;
import vn.roommanagement.config.BaseResponse;

import java.util.List;

@RestController
@RequestMapping("/api/v1/province")
@RequiredArgsConstructor
public class ProvincesController {

    @Autowired
    private ProvinceService provinceService;

    @GetMapping("/get-all")
    public BaseResponse<List<ProvinceResponseDto>> getAllProvinces(){

        return BaseResponse.ofSucceeded(provinceService.getAllProvinces());
    }

    @GetMapping("/{provinceCode}")
    public BaseResponse<List<ProvinceResponseDto>>getByCode(@PathVariable String provinceCode){
        return  BaseResponse.ofSucceeded(provinceService.getByProvinceCode(provinceCode));
    }
}
