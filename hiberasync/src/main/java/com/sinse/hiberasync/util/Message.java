package com.sinse.hiberasync.util;

import lombok.Data;

@Data
public class Message {
	private String result; //success(200), fail(에러)
	private String msg; // 에러 메시지
}
