package vn.roommanagement.api.dto.response;



import vn.roommanagement.api.entity.AdministrativeRegion;
import vn.roommanagement.api.entity.AdministrativeUnit;
import vn.roommanagement.api.entity.Province;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProvinceResponseDto {

    private String code;

    private String name;

    private String nameEn;

    private String fullName;

    private String fullNameEn;

    private String codeName;

    private AdministrativeUnit administrativeUnit;

    private AdministrativeRegion administrativeRegion;

    public static ProvinceResponseDto provinceDto(Province data){
        ProvinceResponseDto res = new ProvinceResponseDto();
        res.setCode(data.getCode());
        res.setName(data.getName());
        res.setNameEn(data.getNameEn());
        res.setFullName(data.getFullName());
        res.setFullNameEn(data.getFullNameEn());
        res.setCodeName(data.getCodeName());
        res.setAdministrativeRegion(data.getAdministrativeRegion());
        res.setAdministrativeUnit(data.getAdministrativeUnit());
        return res;
    }
}
