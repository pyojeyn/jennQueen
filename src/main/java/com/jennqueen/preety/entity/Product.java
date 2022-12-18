package com.jennqueen.preety.entity;

import com.jennqueen.preety.entity.embeddable.Size;
import lombok.*;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;
import java.math.BigInteger;
import java.sql.Timestamp;

@DynamicUpdate
@DynamicInsert
@Setter
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
public class Product {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "product_number", columnDefinition ="BIGINT UNSIGNED COMMENT '상품번호 PK'")
    private BigInteger productNumber;

    @Column(name = "product_name", columnDefinition = "VARCHAR(50) COMMENT '상품 이름'", nullable = false)
    private String productName;

    @Column(name = "product_price", columnDefinition = "BIGINT UNSIGNED COMMENT '상품 가격'", nullable = false)
    private BigInteger productPrice;

    @Column(name = "created_datetime", nullable = false, updatable = false,
            columnDefinition = "TIMESTAMP(6) DEFAULT NOW(6) COMMENT '등록 날짜'")
    private Timestamp createdDateTime;

    @Column(name = "product_hits", columnDefinition = "BIGINT UNSIGNED COMMENT '조회수'", nullable = false)
    private BigInteger productHits;

    @Column(name = "product_description", columnDefinition = "TEXT COMMENT '상품 설명'")
    private String description;

    @Column(name = "care_instructions", columnDefinition = "TEXT COMMENT '의류 관리 지침'")
    private String careInstructions;

    @Column(columnDefinition = "VARCHAR(100) COMMENT '옷감 구성 요소'")
    private String composition;

    @Column(columnDefinition = "TEXT COMMENT '모델 신체 사이즈와 그들이 입은 옷 사이즈'")
    private String detail;


    @Builder
    public Product(String productName, BigInteger productPrice, BigInteger productHits,
                   String description, String careInstructions, String composition,
                   String detail) {
        this.productName = productName;
        this.productPrice = productPrice;
        this.productHits = productHits;
        this.description = description;
        this.careInstructions = careInstructions;
        this.composition = composition;
        this.detail = detail;
    }
}
