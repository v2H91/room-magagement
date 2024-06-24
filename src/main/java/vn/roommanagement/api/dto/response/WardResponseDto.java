package vn.roommanagement.api.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import vn.roommanagement.api.entity.AdministrativeUnit;
import vn.roommanagement.api.entity.District;
import vn.roommanagement.api.entity.Ward;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class WardResponseDto {
    private String code;

    private String name;

    private String nameEn;

    private String fullName;

    private String fullNameEn;

    private String codeName;

    private District district;

    private AdministrativeUnit administrativeUnit;

    public static  WardResponseDto wardResponseDto(Ward data){
        WardResponseDto res = new WardResponseDto();
        res.setCode(data.getCode());
        res.setNameEn(data.getNameEn());
        res.setName(data.getName());
        res.setCodeName(data.getCodeName());
        res.setFullName(data.getFullName());
        res.setDistrict(data.getDistrict());
        res.setFullNameEn(data.getFullNameEn());
        res.setAdministrativeUnit(data.getAdministrativeUnit());
        return res;
    }
}
