package vn.roommanagement.api.common;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class ResponseApi extends ResponseEntity<ObjectResponse> {
    public ResponseApi(Object data) {
        super(new ObjectResponse(HttpStatus.OK.value(), data, "Success", ""), HttpStatus.OK);
    }

    public ResponseApi(int status, Object data, String messageId, Object errorMessage, int statusApi) {
        super(new ObjectResponse(status, data, messageId, errorMessage), HttpStatus.OK);
    }

    public ResponseApi(int status, Object data, String messageId, Object errorMessage, String statusApi) {
        super(new ObjectResponse(status, data, messageId, errorMessage), HttpStatus.OK);
    }

}
