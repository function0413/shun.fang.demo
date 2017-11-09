package com.user.domain;

import org.apache.ibatis.type.Alias;

@Alias("UsrDtoID")
public class UsrDto {

	private String USR_KEY;
	private String ACT_KEY;
	private String USR_LAST_NAME;
	private String USR_LOGIN;
	private String ACT_NAME;


	public String getACT_NAME() {
		return ACT_NAME;
	}

	public void setACT_NAME(String aCT_NAME) {
		ACT_NAME = aCT_NAME;
	}

	public String getUSR_KEY() {
		return USR_KEY;
	}

	public void setUSR_KEY(String uSR_KEY) {
		USR_KEY = uSR_KEY;
	}

	public String getACT_KEY() {
		return ACT_KEY;
	}

	public void setACT_KEY(String aCT_KEY) {
		ACT_KEY = aCT_KEY;
	}

	public String getUSR_LAST_NAME() {
		return USR_LAST_NAME;
	}

	public void setUSR_LAST_NAME(String uSR_LAST_NAME) {
		USR_LAST_NAME = uSR_LAST_NAME;
	}

	public String getUSR_LOGIN() {
		return USR_LOGIN;
	}

	public void setUSR_LOGIN(String uSR_LOGIN) {
		USR_LOGIN = uSR_LOGIN;
	}

	@Override
	public String toString() {
		return "UsrDto [USR_KEY=" + USR_KEY + ", ACT_KEY=" + ACT_KEY + ", USR_LAST_NAME=" + USR_LAST_NAME + ", USR_LOGIN=" + USR_LOGIN
				+ ", ACT_NAME=" + ACT_NAME + "]";
	}

}
