package vn.roommanagement.api.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import vn.roommanagement.api.dto.response.WardResponseDto;
import vn.roommanagement.api.entity.Ward;
import vn.roommanagement.api.service.WardService;
import vn.roommanagement.config.BaseResponse;

import java.util.List;

@RestController
@RequestMapping("/api/v1/ward")
@RequiredArgsConstructor
public class WardController {

    @Autowired
    WardService wardService;

    @GetMapping("/{districtCode}")
    public BaseResponse<List<WardResponseDto>> getByDistrictCode( @PathVariable("districtCode") String districtCode){
        return BaseResponse.ofSucceeded(wardService.getByDistrictCode(districtCode));
    }
    @GetMapping("/get-all")
    public BaseResponse<List<WardResponseDto>> getAll(){
        return  BaseResponse.ofSucceeded(wardService.getAll());
    }
}
