package PojoClass;


public class entity {
	private String   firstName;
	private String lastName;
	private String  email;
	private long  mobileNumber;
	private String  userType;
	private String address;
	private String panCard;
	private long adharCard;
	private String city;
	private String  state;
	private String shopName;
	private String userName;
	
	
	public entity() {
		super();
		// TODO Auto-generated constructor stub
	}
	public entity(String firstName, String lastName, String email, long mobileNumber, String userType, String address,
			String panCard, long adharCard, String city, String state, String shopName, String userName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.mobileNumber = mobileNumber;
		this.userType = userType;
		this.address = address;
		this.panCard = panCard;
		this.adharCard = adharCard;
		this.city = city;
		this.state = state;
		this.shopName = shopName;
		this.userName = userName;
	}
	@Override
	public String toString() {
		return "entity [firstName=" + firstName + ", lastName=" + lastName + ", email=" + email + ", mobileNumber="
				+ mobileNumber + ", userType=" + userType + ", address=" + address + ", panCard=" + panCard
				+ ", adharCard=" + adharCard + ", city=" + city + ", state=" + state + ", shopName=" + shopName
				+ ", userName=" + userName + "]";
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getUserType() {
		return userType;
	}
	public void setUserType(String userType) {
		this.userType = userType;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPanCard() {
		return panCard;
	}
	public void setPanCard(String panCard) {
		this.panCard = panCard;
	}
	public long getAdharCard() {
		return adharCard;
	}
	public void setAdharCard(long adharCard) {
		this.adharCard = adharCard;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getShopName() {
		return shopName;
	}
	public void setShopName(String shopName) {
		this.shopName = shopName;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}

	
	}
	

