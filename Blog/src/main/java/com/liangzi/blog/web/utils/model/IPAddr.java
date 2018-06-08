package com.liangzi.blog.web.utils.model;

/**
 * <p>Title			: IPAddr</p>
 * <p>Description	: IP地址Model</p>
 * <p>DevelopTools	: Eclipse_x64</p>
 * <p>DevelopSystem	: Windows_x64</p>
 * <p>Company		: liangzl.com</p>
 * @author			: Liangzl
 * @date			: 2016年12月5日 下午5:33:53
 * @version			: 1.0
 */
public class IPAddr {
	
	/**
	 * 国家
	 */
	private String country;
	
	/**
	 * 国家ID
	 */
	private String countryId;
	
	/**
	 * 地区
	 */
	private String area;
	
	/**
	 * 地区ID
	 */
	private String areaId;
	
	/**
	 * 区域
	 */
	private String region;
	
	/**
	 * 区域ID
	 */
	private String regionId;
	
	/**
	 * 城市
	 */
	private String city;
	
	/**
	 * 城市ID
	 */
	private String cityId;
	
	/**
	 * 县
	 */
	private String county;
	
	/**
	 * 县ID
	 */
	private String countyId;
	
	/**
	 * ISP互联网接入服务提供商
	 */
	private String isp;
	
	/**
	 * ISP-IP
	 */
	private String ispId;
	
	/**
	 * IP
	 */
	private String ip;

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getCountryId() {
		return countryId;
	}

	public void setCountryId(String countryId) {
		this.countryId = countryId;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getAreaId() {
		return areaId;
	}

	public void setAreaId(String areaId) {
		this.areaId = areaId;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public String getRegionId() {
		return regionId;
	}

	public void setRegionId(String regionId) {
		this.regionId = regionId;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCityId() {
		return cityId;
	}

	public void setCityId(String cityId) {
		this.cityId = cityId;
	}

	public String getCounty() {
		return county;
	}

	public void setCounty(String county) {
		this.county = county;
	}

	public String getCountyId() {
		return countyId;
	}

	public void setCountyId(String countyId) {
		this.countyId = countyId;
	}

	public String getIsp() {
		return isp;
	}

	public void setIsp(String isp) {
		this.isp = isp;
	}

	public String getIspId() {
		return ispId;
	}

	public void setIspId(String ispId) {
		this.ispId = ispId;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	/**
	 * ToString
	 */
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("IPAddr [country=");
		builder.append(country);
		builder.append(", countryId=");
		builder.append(countryId);
		builder.append(", area=");
		builder.append(area);
		builder.append(", areaId=");
		builder.append(areaId);
		builder.append(", region=");
		builder.append(region);
		builder.append(", regionId=");
		builder.append(regionId);
		builder.append(", city=");
		builder.append(city);
		builder.append(", cityId=");
		builder.append(cityId);
		builder.append(", county=");
		builder.append(county);
		builder.append(", countyId=");
		builder.append(countyId);
		builder.append(", isp=");
		builder.append(isp);
		builder.append(", ispId=");
		builder.append(ispId);
		builder.append(", ip=");
		builder.append(ip);
		builder.append("]");
		return builder.toString();
	}

}
