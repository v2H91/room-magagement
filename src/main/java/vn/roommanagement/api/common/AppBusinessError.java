package vn.roommanagement.api.common;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.http.HttpStatus;

@Getter
@Setter
@AllArgsConstructor
public class AppBusinessError {
    private int code;
    private String message;
    private HttpStatus httpStatus;

    public AppBusinessError(String resource){
        this.code = 404;
        this.message = resource + " is not found";
        this.httpStatus = HttpStatus.NOT_FOUND;
    }
}
