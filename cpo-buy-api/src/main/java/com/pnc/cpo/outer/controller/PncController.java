package com.pnc.cpo.outer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.NoSuchMessageException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.pnc.cpo.outer.dto.UserInfoDTO;
import com.pnc.cpo.outer.enums.SecurityError;
import com.pnc.cpo.outer.exception.OuterException;
import com.pnc.cpo.outer.response.BaseResponse;
import com.pnc.cpo.outer.service.PncService;

/**
 * 
 * @author arifk2
 *
 */
@RestController
@RequestMapping("/api")
public class PncController {

	@Autowired
	private PncService pncService;

	@Autowired
	private MessageSource messageSource;

	/**
	 * 
	 * @param userInfoDTO
	 * @return
	 * @throws NoSuchMessageException
	 * @throws OuterException
	 */
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public ResponseEntity<?> saveProducts(@RequestBody UserInfoDTO userInfoDTO)
			throws NoSuchMessageException, OuterException {
		final long UserInfoDTOResponse = pncService.saveUserInfo(userInfoDTO);
		if (UserInfoDTOResponse != 0) {
			return new ResponseEntity<Object>(
					new BaseResponse(HttpStatus.OK.value(),
							messageSource.getMessage("product.save.with.category", null, null), UserInfoDTOResponse),
					HttpStatus.OK);
		} else {
			return new ResponseEntity<Object>(new BaseResponse(HttpStatus.BAD_REQUEST.value(),
					SecurityError.OPERATION_FAILED.getDescription(), null), HttpStatus.BAD_REQUEST);
		}
	}
}