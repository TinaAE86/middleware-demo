package com.alibaba.aidc.middleware.demo.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class OuterDTO {
    private String oField1;

    private String oField2;

    private InnerDTO innerDTO;
}
