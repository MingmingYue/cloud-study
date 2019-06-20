package com.ming.cloud.zuul.entity;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by 2019-06-20
 */
@Getter
@Setter
@Builder
public class User {

    private Long id;
    private String username;
    private Integer age;
}
