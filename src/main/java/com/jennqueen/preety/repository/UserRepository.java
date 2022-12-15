package com.jennqueen.preety.repository;

import com.jennqueen.preety.entity.User;
import com.jennqueen.preety.entity.embeddable.Address;
import com.jennqueen.preety.enums.Role;
import com.jennqueen.preety.service.UserService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.math.BigInteger;
import java.util.List;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User, BigInteger> {

    Optional<List<User>> findAllDistinctByAddress(Address address);

    Page<User> findAll(Pageable pageable);

    int countByName(String name); // 파생쿼리 : countBy + 엔티티프로퍼티명 => name 의 값이 ***인 사람의 카운트 가져와 !

    int countByRole(Role role); // role이 NN인 사람 갯수 가져와!

    List<User> removeByName(String name); // // 삭제 된 애들 리스트 반환.

    Optional<User> findByEmail(String email);


}
