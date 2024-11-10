package com.sky.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(description = "The data format returned by the employee login")
public class EmployeeLoginVO implements Serializable {

    @ApiModelProperty("primary key value")
    private Long id;

    @ApiModelProperty("user name")
    private String userName;

    @ApiModelProperty("name")
    private String name;

    @ApiModelProperty("jwt token")
    private String token;

}
