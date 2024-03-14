package com.TrueSpot.ts2.dto;

import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data@NoArgsConstructor@AllArgsConstructor@Builder
public class CompanyDto {
	private String comId,comPw,comName,comPost,comAddr1,comAddr2,comTel,comBs,comRegionm,comEmail;
	private int comPayStaus;
	private Date comJoinDate;
}
