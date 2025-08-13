package com.alibaba.aidc.unitTest;

import com.alibaba.aidc.middleware.demo.dto.InnerDTO;
import com.alibaba.aidc.middleware.demo.dto.OuterDTO;
import com.taobao.pandora.boot.test.junit4.DelegateTo;
import com.taobao.pandora.boot.test.junit4.PandoraBootRunner;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;
import java.util.Map;

/**
 * 测试比较DTO是否相等
 */
//@RunWith(PandoraBootRunner.class)
//@DelegateTo(MockitoJUnitRunner.class)
public class EqualTest {
    private static InnerDTO buildInnerDTO() {
        return InnerDTO.builder()
                .iField1("iField1")
                .iField2("iField2")
                .list(List.of("str1", "str2"))
                .map(Map.of(
                        "k1", "v1",
                        "k2", "v2"
                ))
                .build();
    }

    private static OuterDTO buildOuterDTO() {
        return OuterDTO.builder()
                .oField1("oField1")
                .oField2("oField2")
                .innerDTO(buildInnerDTO())
                .build();
    }

    /**
     * 测试能否判断含嵌套结构和List、Map集合的DTO是否相等
     */
    @Test
    public void test1() {
        OuterDTO outerDTO1 = buildOuterDTO();
        OuterDTO outerDTO2 = buildOuterDTO();
        Assert.assertTrue(EqualsBuilder.reflectionEquals(outerDTO1, outerDTO2, true));
    }
}
