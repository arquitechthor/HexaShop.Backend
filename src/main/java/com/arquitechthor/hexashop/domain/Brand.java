package com.arquitechthor.hexashop.domain;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Brand {

    private Long id;
    private String name;
}
