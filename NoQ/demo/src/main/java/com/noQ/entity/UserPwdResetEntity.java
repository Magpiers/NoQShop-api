package com.noQ.entity;

public class UserPwdResetEntity {
	
	public String regMailId;
	public String regMobileNo;
	public String mailOTP;
	public String mobileOTP;
	public String password;
	/**
	 * @return the regMailId
	 */
	public String getRegMailId() {
		return regMailId;
	}
	/**
	 * @param regMailId the regMailId to set
	 */
	public void setRegMailId(String regMailId) {
		this.regMailId = regMailId;
	}
	/**
	 * @return the regMobileNo
	 */
	public String getRegMobileNo() {
		return regMobileNo;
	}
	/**
	 * @param regMobileNo the regMobileNo to set
	 */
	public void setRegMobileNo(String regMobileNo) {
		this.regMobileNo = regMobileNo;
	}
	/**
	 * @return the mailOTP
	 */
	public String getMailOTP() {
		return mailOTP;
	}
	/**
	 * @param mailOTP the mailOTP to set
	 */
	public void setMailOTP(String mailOTP) {
		this.mailOTP = mailOTP;
	}
	/**
	 * @return the mobileOTP
	 */
	public String getMobileOTP() {
		return mobileOTP;
	}
	/**
	 * @param mobileOTP the mobileOTP to set
	 */
	public void setMobileOTP(String mobileOTP) {
		this.mobileOTP = mobileOTP;
	}
	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((mailOTP == null) ? 0 : mailOTP.hashCode());
		result = prime * result + ((mobileOTP == null) ? 0 : mobileOTP.hashCode());
		result = prime * result + ((password == null) ? 0 : password.hashCode());
		result = prime * result + ((regMailId == null) ? 0 : regMailId.hashCode());
		result = prime * result + ((regMobileNo == null) ? 0 : regMobileNo.hashCode());
		return result;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof UserPwdResetEntity))
			return false;
		UserPwdResetEntity other = (UserPwdResetEntity) obj;
		if (mailOTP == null) {
			if (other.mailOTP != null)
				return false;
		} else if (!mailOTP.equals(other.mailOTP))
			return false;
		if (mobileOTP == null) {
			if (other.mobileOTP != null)
				return false;
		} else if (!mobileOTP.equals(other.mobileOTP))
			return false;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		if (regMailId == null) {
			if (other.regMailId != null)
				return false;
		} else if (!regMailId.equals(other.regMailId))
			return false;
		if (regMobileNo == null) {
			if (other.regMobileNo != null)
				return false;
		} else if (!regMobileNo.equals(other.regMobileNo))
			return false;
		return true;
	}
	

}
