package com.fnc.thymeleaf.dto;

import java.time.LocalDateTime;

import lombok.Builder;
import lombok.Data;

@Data //get,set,constructor을 런타임시 대신 만들어줌
@Builder(toBuilder=true)  //toString을 런타임시 대신 만들어줌
public class SampleDTO  {

	private Long sno;
	private String first;
	private String last;
	private LocalDateTime regTime;
	
}
