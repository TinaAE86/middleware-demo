package com.alibaba.aidc.middleware.demo.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Map;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class InnerDTO {
    private String iField1;

    private String iField2;

    private List<String> list;

    private Map<String, String> map;
}
