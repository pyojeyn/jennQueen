package com.jennqueen.preety.entity;

import com.jennqueen.preety.entity.embeddable.Address;
import com.jennqueen.preety.enums.Grade;
import com.jennqueen.preety.enums.Role;
import lombok.*;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;
import java.math.BigInteger;
import java.sql.Time;
import java.sql.Timestamp;

@DynamicUpdate
@DynamicInsert
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Setter
@Entity
public class User {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(columnDefinition = "BIGINT UNSIGNED COMMENT '쇼핑몰 회원 PK'")
    private BigInteger id;

    @Column(name = "created_datetime", nullable = false, updatable = false,
            columnDefinition = "TIMESTAMP(6) DEFAULT NOW(6) COMMENT '가입 날짜'")
    private Timestamp createdDateTime;

    @Column(columnDefinition = "VARCHAR(20) COMMENT '이름'", nullable = false)
    private String name;

    @Column(columnDefinition = "VARCHAR(100) COMMENT '암호'", nullable = false)
    private String password;

    @Column(name = "phone_number" , columnDefinition = "VARCHAR(20) COMMENT '회원 휴대폰 번호'", nullable = false, unique = true)
    private String phoneNumber;

    @Column(columnDefinition = "VARCHAR(50) COMMENT '회원 이메일 주소'", unique = true, nullable = false)
    private String email;

    @Embedded
    private Address address;

    @Enumerated(EnumType.STRING)
    private Role role;

    @Enumerated(EnumType.STRING)
    private Grade grade;

    @Builder
    public User(String name, String password, String phoneNumber, String email, Address address, Role role, Grade grade) {
        this.name = name;
        this.password = password;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.address = address;
        this.role = role;
        this.grade = grade;
    }
}
