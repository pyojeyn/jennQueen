package com.jennqueen.preety.entity;

import lombok.*;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@DynamicInsert
@DynamicUpdate
@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
public class ProductCategory {

    @Id
    @Column(name = "category_code", columnDefinition = "VARCHAR(30) COMMENT '카테고리 코드'", nullable = false)
    private String categoryCode;

    @Column(name = "category_name", columnDefinition = "VARCHAR(50) COMMENT '카테고리 이름'", nullable = false)
    private String categoryName;

    @Column(name = "category_ref_code", columnDefinition = "VARCHAR(30) COMMENT '참조 코드'")
    private String categoryRefCode;

    @Builder
    public ProductCategory(String categoryName, String categoryRefCode){
        this.categoryCode = categoryName;
        this.categoryRefCode = categoryRefCode;
    }
}
