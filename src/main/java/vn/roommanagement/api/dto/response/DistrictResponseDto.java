package vn.roommanagement.api.dto.response;

import jakarta.persistence.Column;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import vn.roommanagement.api.entity.District;
import vn.roommanagement.api.entity.Province;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DistrictResponseDto {

    private String code;

    private String name;

    private String nameEn;

    private String fullName;

    private String fullNameEn;

    private String codeName;

    private Province provinceCode;

    public static DistrictResponseDto districtResponseDto (District data){
        DistrictResponseDto res = new DistrictResponseDto();
        res.setCode(data.getCode());
        res.setNameEn(data.getNameEn());
        res.setName(data.getName());
        res.setCodeName(data.getCodeName());
        res.setFullName(data.getFullName());
        res.setFullNameEn(data.getFullNameEn());
        res.setProvinceCode(data.getProvince());
        return  res;
    }


}
