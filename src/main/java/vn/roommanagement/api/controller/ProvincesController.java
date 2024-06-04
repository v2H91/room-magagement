package vn.roommanagement.api.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import vn.roommanagement.api.entity.Province;
import vn.roommanagement.api.service.ProvinceService;

import java.util.List;

@RestController
@RequestMapping("/api/v1/province")
@RequiredArgsConstructor
public class ProvincesController {

    @Autowired
    private ProvinceService provinceService;

    @GetMapping("/get-all")
    public ResponseEntity<List<Province>> getAllProvinces(){
        return ResponseEntity.ok(provinceService.getAllProvinces());
    }

}
