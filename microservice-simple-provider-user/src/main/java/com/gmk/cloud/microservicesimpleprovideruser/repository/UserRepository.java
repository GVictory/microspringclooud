package com.gmk.cloud.microservicesimpleprovideruser.repository;

import com.gmk.cloud.microservicesimpleprovideruser.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.ResponseBody;

@ResponseBody
public interface UserRepository extends JpaRepository<User, Long> {

}
