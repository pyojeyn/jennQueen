package com.jennqueen.preety.entity.embeddable;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Embeddable
public class Size {
    @Column(columnDefinition = "SMALLINT COMMENT '사이즈 - 어깨'")
    private int shoulder;

    @Column(columnDefinition = "SMALLINT COMMENT '사이즈 - 가슴'")
    private int chest;

    @Column(columnDefinition = "SMALLINT COMMENT '사이즈 - 단'")
    private int hem;

    @Column(columnDefinition = "SMALLINT COMMENT '사이즈 - 암홀'")
    private int armhole;

    @Column(columnDefinition = "SMALLINT COMMENT '사이즈 - 슬리브'")
    private int sleeve;

    @Column(columnDefinition = "SMALLINT COMMENT '사이즈 - 길이'")
    private int length;

    @Column(columnDefinition = "SMALLINT COMMENT '사이즈 - 허리'")
    private int waist;

    @Column(columnDefinition = "SMALLINT COMMENT '사이즈 - 엉덩이 둘레'")
    private int hip;

    @Column(columnDefinition = "SMALLINT COMMENT '사이즈 - 허벅지'")
    private int thigh;

    @Column(columnDefinition = "SMALLINT COMMENT '사이즈 - 밑위'")
    private int rise;



}
