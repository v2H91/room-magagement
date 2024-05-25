package vn.roommanagement.api.dto.request;


import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class LoginRequest {
    @NotBlank
    private String id;
    @NotBlank
    private String name;
    @NotBlank
    private String avatar;

}
