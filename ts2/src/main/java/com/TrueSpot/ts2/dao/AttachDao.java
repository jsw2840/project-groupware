package com.TrueSpot.ts2.dao;

import com.TrueSpot.ts2.dto.AttachDto;

public interface AttachDao {
	int sequence();
	void insert(AttachDto attachDto);
	AttachDto selectOne(int attachNo);
	boolean delete(int attachNo);
}
