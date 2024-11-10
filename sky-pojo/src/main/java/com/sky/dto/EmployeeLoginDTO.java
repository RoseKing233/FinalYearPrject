package com.sky.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

@Data
@ApiModel(description = "The data model that is passed when the employee logs in")
public class EmployeeLoginDTO implements Serializable {

    @ApiModelProperty("username")
    private String username;

    @ApiModelProperty("password")
    private String password;

}
