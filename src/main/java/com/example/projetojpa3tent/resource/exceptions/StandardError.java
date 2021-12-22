package com.example.projetojpa3tent.resource.exceptions;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@AllArgsConstructor
@Getter
@Setter
public class StandardError implements Serializable {
    private Integer status;
    private String msg;
    private Long timeStamp;
}
