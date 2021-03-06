package org.springframework.social.eventbrite.api;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

//<venue>
//<id>1</id>
//<name>Madison Square Garden</name>
//<address>4 Penn Plaza</address>
//<address_2></address_2>
//<city>New York</city>
//<region>NY</region>
//<postal_code>10001</postal_code>
//<country>United States</country>
//<country_code>US</country_code>
//<Lat-Long>47.123 / 3.34</Lat-Long>
//</venue>
@XmlAccessorType(XmlAccessType.FIELD)
public class Venue {

	private String id;
	private String name;
	private String address;
	@XmlElement(name="address_2")
	private String address2;
	private String city;
	private String region;
	@XmlElement(name="postal_code")
	private String postalCode;
	private String country;
	@XmlElement(name="country_code")
	private String countryCode;
	
	//TODO Handle this better.
	@XmlElement(name="Lat-Long")
	private String latitudeLongitude;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getAddress2() {
		return address2;
	}

	public void setAddress2(String address2) {
		this.address2 = address2;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}
	
	public String getLatitudeLongitude() {
		return latitudeLongitude;
	}
	
	public void setLatitudeLongitude(String latitudeLongitude) {
		this.latitudeLongitude = latitudeLongitude;
	}
}
