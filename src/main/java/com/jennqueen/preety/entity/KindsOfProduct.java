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
@Builder
@AllArgsConstructor // 이거 안해주면 저 위에 @Builder 때매 에러남;; @Builder 달거면 이것도 같이 해주던가 아님 둘다 지우던가;
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Setter
@Entity
@Table(name = "kinds_of_product")
public class KindsOfProduct {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(columnDefinition = "BIGINT UNSIGNED COMMENT '상품 종류 PK'")
    private BigInteger id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "product_id", columnDefinition = "BIGINT UNSIGNED COMMENT '상품 PK'", nullable = false)
    private Product product;

    @Column(name = "size_name", columnDefinition = "VARCHAR(10)  DEFAULT 'FREE' COMMENT '사이즈명'" , nullable = false)
    private String sizeName;

    @Column(name = "color_name", columnDefinition = "VARCHAR(20) COMMENT '색상명'")
    private String colorName;

    @Embedded
    private Size size;

    @Column(name = "created_datetime", nullable = false, updatable = false,
            columnDefinition = "TIMESTAMP(6) DEFAULT NOW(6) COMMENT '등록 날짜'")
    private Timestamp createdDateTime;

    @Builder
    public KindsOfProduct(Product product, String sizeName, String colorName, Size size) {
        this.product = product;
        this.sizeName = sizeName;
        this.colorName = colorName;
        this.size = size;
    }
}
