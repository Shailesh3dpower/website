package com.my.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "preferences")
public class Preferences {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	@NotNull
	
	private long userId;
	
	//Basic preferences
	private int minAge;
	private int maxAge;
	private String maritalStatus;
	
	private String eatingHabits;
	private String drinkingHabits;
	private String smokingHabits;
	private String gothra;
	private String manglik;
	private String star;
	private String dosh;
	private String raasi;
	private int fromHeight;
	private int toHeight;
	private int weight; 
	private String bodyType;
	private String complexion;
	private String physicalStatus;
	
	private String familystatus;
	private String familytype;
	private String familyvalues;
	
	
	//Professional preferences
	private String education;
	private String occupation;
	private int income;
	
	
	//Location preferences
	private String country;
	private String state;
	private String citizenship;
	private String residingCity;
	
	@OneToOne
	@JoinColumn(name="memberId")
	private Member member;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public long getUserId() {
		return userId;
	}
	public void setUserId(long userId) {
		this.userId = userId;
	}
	public int getMinAge() {
		return minAge;
	}
	public void setMinAge(int minAge) {
		this.minAge = minAge;
	}
	public int getMaxAge() {
		return maxAge;
	}
	public void setMaxAge(int maxAge) {
		this.maxAge = maxAge;
	}
	public String getMaritalStatus() {
		return maritalStatus;
	}
	public void setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	}

	public String getEatingHabits() {
		return eatingHabits;
	}
	public void setEatingHabits(String eatingHabits) {
		this.eatingHabits = eatingHabits;
	}
	public String getDrinkingHabits() {
		return drinkingHabits;
	}
	public void setDrinkingHabits(String drinkingHabits) {
		this.drinkingHabits = drinkingHabits;
	}
	public String getSmokingHabits() {
		return smokingHabits;
	}
	public void setSmokingHabits(String smokingHabits) {
		this.smokingHabits = smokingHabits;
	}
	public String getGothra() {
		return gothra;
	}
	public void setGothra(String gothra) {
		this.gothra = gothra;
	}
	public String getManglik() {
		return manglik;
	}
	public void setManglik(String maglik) {
		this.manglik = maglik;
	}
	public String getStar() {
		return star;
	}
	public void setStar(String star) {
		this.star = star;
	}
	public String getDosh() {
		return dosh;
	}
	public void setDosh(String dosh) {
		this.dosh = dosh;
	}
	public String getRaasi() {
		return raasi;
	}
	public void setRaasi(String raasi) {
		this.raasi = raasi;
	}
	public int getFromHeight() {
		return fromHeight;
	}
	public void setFromHeight(int fromHeight) {
		this.fromHeight = fromHeight;
	}
	public int getToHeight() {
		return toHeight;
	}
	public void setToHeight(int toHeight) {
		this.toHeight = toHeight;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public String getBodyType() {
		return bodyType;
	}
	public void setBodyType(String bodyType) {
		this.bodyType = bodyType;
	}
	public String getComplexion() {
		return complexion;
	}
	public void setComplexion(String complexion) {
		this.complexion = complexion;
	}
	public String getPhysicalStatus() {
		return physicalStatus;
	}
	public void setPhysicalStatus(String physicalstatus) {
		this.physicalStatus = physicalstatus;
	}
	public String getFamilystatus() {
		return familystatus;
	}
	public void setFamilystatus(String familystatus) {
		this.familystatus = familystatus;
	}
	public String getFamilytype() {
		return familytype;
	}
	public void setFamilytype(String familytype) {
		this.familytype = familytype;
	}
	public String getFamilyvalues() {
		return familyvalues;
	}
	public void setFamilyvalues(String familyvalues) {
		this.familyvalues = familyvalues;
	}
	public String getEducation() {
		return education;
	}
	public void setEducation(String education) {
		this.education = education;
	}
	public String getOccupation() {
		return occupation;
	}
	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}
	public int getIncome() {
		return income;
	}
	public void setIncome(int income) {
		this.income = income;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCitizenship() {
		return citizenship;
	}
	public void setCitizenship(String citizenship) {
		this.citizenship = citizenship;
	}
	public String getResidingCity() {
		return residingCity;
	}
	public void setResidingCity(String residingCity) {
		this.residingCity = residingCity;
	}
	public Member getMember() {
		return member;
	}
	public void setMember(Member member) {
		this.member = member;
	}
	
	}
