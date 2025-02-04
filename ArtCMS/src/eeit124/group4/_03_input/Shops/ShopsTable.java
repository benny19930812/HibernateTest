package eeit124.group4._03_input.Shops;

import com.google.gson.annotations.SerializedName;

public class ShopsTable {

	@SerializedName("shopId")
	private String shopId;	

	@SerializedName("name")
	private String name;	
	
	@SerializedName("representImage")
	private String representImage;
	
	@SerializedName("intro")
	private String intro;
	
	@SerializedName("cityName")
	private String cityName;
	
	//=====================

	@SerializedName("address")
	private String address;
		
	@SerializedName("longitude")
	private String longitude;
	
	@SerializedName("latitude")
	private String latitude;
	
	@SerializedName("openTime")
	private String openTime;
		
	@SerializedName("phone")
	private String phone;

	//==================
	
	@SerializedName("fax")
	private String fax;
	
	@SerializedName("email")
	private String email;
	
	@SerializedName("facebook")
	private String facebook;
	
	@SerializedName("website")
	private String website;
			
	@SerializedName("clicks")
	private String clicks;
	
	//==================

	public String getShopId() {
		return shopId;
	}

	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRepresentImage() {
		return representImage;
	}

	public void setRepresentImage(String representImage) {
		this.representImage = representImage;
	}

	public String getIntro() {
		return intro;
	}

	public void setIntro(String intro) {
		this.intro = intro;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	//==================
	
	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getLongitude() {
		return longitude;
	}

	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	public String getLatitude() {
		return latitude;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public String getOpenTime() {
		return openTime;
	}

	public void setOpenTime(String openTime) {
		this.openTime = openTime;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	//==================
	
	public String getFax() {
		return fax;
	}

	public void setFax(String fax) {
		this.fax = fax;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFacebook() {
		return facebook;
	}

	public void setFacebook(String facebook) {
		this.facebook = facebook;
	}

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	public String getClicks() {
		return clicks;
	}

	public void setClicks(String clicks) {
		this.clicks = clicks;
	}

	//==================
}
