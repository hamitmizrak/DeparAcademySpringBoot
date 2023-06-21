package com.hamitmizrak.error;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j2;

import java.util.Date;
import java.util.Map;

// LOMBOK
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Log4j2

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ApiResult {

    // Field
    private int status;
    private String path;
    private String message;
    private String error;
    private Map<String,String> validationErrors;
    private java.util.Date createdDate=new Date(System.currentTimeMillis());

    //parametreli constructor
    public ApiResult(int status, String path, String message) {
        this.status = status;
        this.path = path;
        this.message = message;
    }
}
