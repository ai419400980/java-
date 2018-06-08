package com.liangzi.blog.web.utils.model;

import java.io.Serializable;

/**
 * <p>Title			: IPAddrSina</p>
 * <p>Description	: IP地址Model(新浪)</p>
 * <p>DevelopTools	: Eclipse_x64</p>
 * <p>DevelopSystem	: Windows_x64</p>
 * <p>Company		: liangzl.com</p>
 * @author			: Liangzl
 * @date			: 2016年12月5日 下午5:33:31
 * @version			: 1.0
 */
public class IPAddrSina implements Serializable {
	
	/** SerialVersionUID **/
	private static final long serialVersionUID = 1L;
	
	/**
	 * 国家
	 */
	private String country;
	
	/**
	 * 省
	 */
	private String province;
	
	/**
	 * 城市
	 */
	private String city;
	
	/**
	 * 区
	 */
	private String district;
	
	/**
	 * 构造方法
	 */
	public IPAddrSina() {}
	
	/**
	 * 构造方法
	 * @param country 	国家
	 * @param province 	省
	 * @param city 		城市
	 * @param district 	区
	 */
	public IPAddrSina(String country, String province, String city, String district) {
		this.country = country;
		this.province = province;
		this.city = city;
		this.district = district;
	}



	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	/**
	 * toString
	 */
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("IPAddrSina [country=");
		builder.append(country);
		builder.append(", province=");
		builder.append(province);
		builder.append(", city=");
		builder.append(city);
		builder.append(", district=");
		builder.append(district);
		builder.append("]");
		return builder.toString();
	}
	
}
