package com.pnc.cpo.outer.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pnc.cpo.outer.dto.UserInfoDTO;
import com.pnc.cpo.outer.service.PncService;

@Service
public class PncServiceImpl implements PncService {

	@Override
	@Transactional
	public long saveUserInfo(UserInfoDTO userInfoDTO) {

		// need to validate the company is valid or not.

		// if valid check the number
		// if valid save in the database by calling dao
		return 0;
	}

}