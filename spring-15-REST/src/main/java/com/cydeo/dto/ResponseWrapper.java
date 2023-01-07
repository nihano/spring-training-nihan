package com.cydeo.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.http.HttpStatus;

@Getter
@Setter
@NoArgsConstructor
public class ResponseWrapper {

    //to make JSON custom we added some fields and Object for dto
    private boolean success;
    private String message;
    private Integer code;
    private Object data; //DTOs

    public ResponseWrapper(String message, Object data){
        this.message =message;
        this.data = data;
        this.code= HttpStatus.OK.value();
        this.success=true;
    }

    //ex: for delete we will not show data
    public ResponseWrapper(String message){
        this.message=message;
        this.code=HttpStatus.OK.value();
        this.success=true;
    }

}
