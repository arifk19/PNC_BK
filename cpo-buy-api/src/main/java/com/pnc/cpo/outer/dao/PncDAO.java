package com.pnc.cpo.outer.dao;
import org.springframework.data.jpa.repository.JpaRepository;

import com.pnc.cpo.outer.model.UserInfo;

public interface PncDAO extends JpaRepository<UserInfo, Long> {

}