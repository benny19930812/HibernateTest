package hibernate.test.model;

import java.util.ArrayList;
import java.util.HashMap;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity  //宣告此class為javabean
@Table(name = "MAINTABLE")
public class ShowBean_old {
	
	@Id //設定primary key
	@Column(name = "ACT_NO")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int ACT_NO;
	
	@Column(name = "ACT_UID")
	private String ACT_UID;
	
	@Column(name = "ACT_TITLE")
	private String ACT_TITLE;
	
	@Column(name = "ACT_CATEGORY")
	private int ACT_CATEGORY;
	
	@Column(name = "ACT_LOCATION")
	private String ACT_LOCATION;
	
	@Column(name = "ACT_LOCATION_NAME")
	private String ACT_LOCATION_NAME;
	
	@Column(name = "ACT_ON_SALES")
	private String ACT_ON_SALES;
	
	@Column(name = "ACT_PRICE")
	private String ACT_PRICE;
	
	@Column(name = "ACT_TIME")
	private String ACT_TIME;
	
	@Column(name = "ACT_END_TIME")
	private String ACT_END_TIME;
	
	@Column(name = "ACT_MAIN_UNIT")
	private String ACT_MAIN_UNIT;
	
	@Column(name = "ACT_SHOW_UNIT")
	private String ACT_SHOW_UNIT;
	
	@Column(name = "ACT_COMMENT")
	private String ACT_COMMENT;
	
	@Column(name = "ACT_DESCRIPTION")
	private String ACT_DESCRIPTION;
	
	@Column(name = "ACT_IMAGE")
	private String ACT_IMAGE;
	
	@Column(name = "ACT_START_DATE")
	private String ACT_START_DATE;
	
	@Column(name = "ACT_END_DATE")
	private String ACT_END_DATE;

//	public ShowBean(int ACT_NO, String ACT_UID, String ACT_TITLE, int ACT_CATEGORY, String ACT_LOCATION,
//			String ACT_LOCATION_NAME, String ACT_ON_SALES, String ACT_PRICE, String ACT_TIME, String ACT_END_TIME,
//			String ACT_MAIN_UNIT, String ACT_SHOW_UNIT, String ACT_COMMENT, String ACT_DESCRIPTION, String ACT_IMAGE,
//			String ACT_START_DATE, String ACT_END_DATE
//
//	) {
//		this.ACT_NO=ACT_NO;
//		this.ACT_UID= ACT_UID;
//	}
	//建構子
	public ShowBean_old() {

	}

	public int getACT_NO() {
		return ACT_NO;
	}

	public void setACT_NO(int aCT_NO) {
		ACT_NO = aCT_NO;
	}

	public String getACT_UID() {
		return ACT_UID;
	}

	public void setACT_UID(String aCT_UID) {
		ACT_UID = aCT_UID;
	}

	public String getACT_TITLE() {
		return ACT_TITLE;
	}

	public void setACT_TITLE(String aCT_TITLE) {
		ACT_TITLE = aCT_TITLE;
	}

	public int getACT_CATEGORY() {
		return ACT_CATEGORY;
	}

	public void setACT_CATEGORY(int aCT_CATEGORY) {
		ACT_CATEGORY = aCT_CATEGORY;
	}

	public String getACT_LOCATION() {
		return ACT_LOCATION;
	}

	public void setACT_LOCATION(String aCT_LOCATION) {
		ACT_LOCATION = aCT_LOCATION;
	}

	public String getACT_LOCATION_NAME() {
		return ACT_LOCATION_NAME;
	}

	public void setACT_LOCATION_NAME(String aCT_LOCATION_NAME) {
		ACT_LOCATION_NAME = aCT_LOCATION_NAME;
	}

	public String getACT_ON_SALES() {
		return ACT_ON_SALES;
	}

	public void setACT_ON_SALES(String aCT_ON_SALES) {
		ACT_ON_SALES = aCT_ON_SALES;
	}

	public String getACT_PRICE() {
		return ACT_PRICE;
	}

	public void setACT_PRICE(String aCT_PRICE) {
		ACT_PRICE = aCT_PRICE;
	}

	public String getACT_TIME() {
		return ACT_TIME;
	}

	public void setACT_TIME(String aCT_TIME) {
		ACT_TIME = aCT_TIME;
	}

	public String getACT_END_TIME() {
		return ACT_END_TIME;
	}

	public void setACT_END_TIME(String aCT_END_TIME) {
		ACT_END_TIME = aCT_END_TIME;
	}

	public String getACT_MAIN_UNIT() {
		return ACT_MAIN_UNIT;
	}

	public void setACT_MAIN_UNIT(String aCT_MAIN_UNIT) {
		ACT_MAIN_UNIT = aCT_MAIN_UNIT;
	}

	public String getACT_SHOW_UNIT() {
		return ACT_SHOW_UNIT;
	}

	public void setACT_SHOW_UNIT(String aCT_SHOW_UNIT) {
		ACT_SHOW_UNIT = aCT_SHOW_UNIT;
	}

	public String getACT_COMMENT() {
		return ACT_COMMENT;
	}

	public void setACT_COMMENT(String aCT_COMMENT) {
		ACT_COMMENT = aCT_COMMENT;
	}

	public String getACT_DESCRIPTION() {
		return ACT_DESCRIPTION;
	}

	public void setACT_DESCRIPTION(String aCT_DESCRIPTION) {
		ACT_DESCRIPTION = aCT_DESCRIPTION;
	}

	public String getACT_IMAGE() {
		return ACT_IMAGE;
	}

	public void setACT_IMAGE(String aCT_IMAGE) {
		ACT_IMAGE = aCT_IMAGE;
	}

	public String getACT_START_DATE() {
		return ACT_START_DATE;
	}

	public void setACT_START_DATE(String aCT_START_DATE) {
		ACT_START_DATE = aCT_START_DATE;
	}

	public String getACT_END_DATE() {
		return ACT_END_DATE;
	}

	public void setACT_END_DATE(String aCT_END_DATE) {
		ACT_END_DATE = aCT_END_DATE;
	}

}
