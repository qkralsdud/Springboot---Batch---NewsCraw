package com.cos.newscraw.wed.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class CMRespDto<T> {
	   private int code;
	   private String msg;
	   private T data;
}
