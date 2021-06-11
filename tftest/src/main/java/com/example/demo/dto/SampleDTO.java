package com.example.demo.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder(toBuilder=true)  //toString을 런타임시 대신 만들어줌
public class SampleDTO {
	private Long  sno;
}
