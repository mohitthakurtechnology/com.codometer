package com.codometer.apis.posters;

public class User 
{
	public User(int id, String firstName, String lastName, String maidenName, int age, String gender, String email,
			String phone, String username, String password, String birthDate, String image, String bloodGroup,
			Double height, Double weight, String eyeColor, Hair hair, String ip, Address address, String macAddress,
			String university, Bank bank, Company company, String ein, String ssn, String userAgent, Crypto crypto,
			String role) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.maidenName = maidenName;
		this.age = age;
		this.gender = gender;
		this.email = email;
		this.phone = phone;
		this.username = username;
		this.password = password;
		this.birthDate = birthDate;
		this.image = image;
		this.bloodGroup = bloodGroup;
		this.height = height;
		this.weight = weight;
		this.eyeColor = eyeColor;
		this.hair = hair;
		this.ip = ip;
		this.address = address;
		this.macAddress = macAddress;
		this.university = university;
		this.bank = bank;
		this.company = company;
		this.ein = ein;
		this.ssn = ssn;
		this.userAgent = userAgent;
		this.crypto = crypto;
		this.role = role;
	}
	
	int id;
	String firstName;
	String lastName;
	String maidenName;
	int age;
	String gender;
	String email;
	String phone;
	String username;
	String password;
	String birthDate;
	String image;
	String bloodGroup;
	Double height;
	Double weight;
	String eyeColor;
	Hair hair;
    String ip;
    Address address;
    String macAddress;
    String university;
    Bank bank;
    Company company;
    String ein;
    String ssn;
    String userAgent;
    Crypto crypto;
    String role;
    
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public String getMaidenName() {
		return maidenName;
	}
	public void setMaidenName(String maidenName) {
		this.maidenName = maidenName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public String getBloodGroup() {
		return bloodGroup;
	}
	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}
	public Double getHeight() {
		return height;
	}
	public void setHeight(Double height) {
		this.height = height;
	}
	public Double getWeight() {
		return weight;
	}
	public void setWeight(Double weight) {
		this.weight = weight;
	}
	public String getEyeColor() {
		return eyeColor;
	}
	public void setEyeColor(String eyeColor) {
		this.eyeColor = eyeColor;
	}
	public Hair getHair() {
		return hair;
	}
	public void setHair(Hair hair) {
		this.hair = hair;
	}
	public String getIp() {
		return ip;
	}
	public void setIp(String ip) {
		this.ip = ip;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public String getMacAddress() {
		return macAddress;
	}
	public void setMacAddress(String macAddress) {
		this.macAddress = macAddress;
	}
	public String getUniversity() {
		return university;
	}
	public void setUniversity(String university) {
		this.university = university;
	}
	public Bank getBank() {
		return bank;
	}
	public void setBank(Bank bank) {
		this.bank = bank;
	}
	public Company getCompany() {
		return company;
	}
	public void setCompany(Company company) {
		this.company = company;
	}
	public String getEin() {
		return ein;
	}
	public void setEin(String ein) {
		this.ein = ein;
	}
	public String getSsn() {
		return ssn;
	}
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	public String getUserAgent() {
		return userAgent;
	}
	public void setUserAgent(String userAgent) {
		this.userAgent = userAgent;
	}
	public Crypto getCrypto() {
		return crypto;
	}
	public void setCrypto(Crypto crypto) {
		this.crypto = crypto;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
//	@Override
//	public String toString() {
//		return "User [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", maidenName=" + maidenName
//				+ ", age=" + age + ", gender=" + gender + ", email=" + email + ", phone=" + phone + ", username="
//				+ username + ", password=" + password + ", birthDate=" + birthDate + ", image=" + image
//				+ ", bloodGroup=" + bloodGroup + ", height=" + height + ", weight=" + weight + ", eyeColor=" + eyeColor
//				+ ", hair=" + hair + ", ip=" + ip + ", address=" + address + ", macAddress=" + macAddress
//				+ ", university=" + university + ", bank=" + bank + ", company=" + company + ", ein=" + ein + ", ssn="
//				+ ssn + ", userAgent=" + userAgent + ", crypto=" + crypto + ", role=" + role + ", getId()=" + getId()
//				+ ", getFirstName()=" + getFirstName() + ", getLastName()=" + getLastName() + ", getMaidenName()="
//				+ getMaidenName() + ", getAge()=" + getAge() + ", getGender()=" + getGender() + ", getEmail()="
//				+ getEmail() + ", getPhone()=" + getPhone() + ", getUsername()=" + getUsername() + ", getPassword()="
//				+ getPassword() + ", getBirthDate()=" + getBirthDate() + ", getImage()=" + getImage()
//				+ ", getBloodGroup()=" + getBloodGroup() + ", getHeight()=" + getHeight() + ", getWeight()="
//				+ getWeight() + ", getEyeColor()=" + getEyeColor() + ", getHair()=" + getHair() + ", getIp()=" + getIp()
//				+ ", getAddress()=" + getAddress() + ", getMacAddress()=" + getMacAddress() + ", getUniversity()="
//				+ getUniversity() + ", getBank()=" + getBank() + ", getCompany()=" + getCompany() + ", getEin()="
//				+ getEin() + ", getSsn()=" + getSsn() + ", getUserAgent()=" + getUserAgent() + ", getCrypto()="
//				+ getCrypto() + ", getRole()=" + getRole() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
//				+ ", toString()=" + super.toString() + "]";
//	}
	@Override
	public String toString() {
		return "User [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", maidenName=" + maidenName
				+ ", age=" + age + ", gender=" + gender + ", email=" + email + ", phone=" + phone + ", username="
				+ username + ", password=" + password + ", birthDate=" + birthDate + ", image=" + image
				+ ", bloodGroup=" + bloodGroup + ", height=" + height + ", weight=" + weight + ", eyeColor=" + eyeColor
				+ ", hair=" + hair + ", ip=" + ip + ", address=" + address + ", macAddress=" + macAddress
				+ ", university=" + university + ", bank=" + bank + ", company=" + company + ", ein=" + ein + ", ssn="
				+ ssn + ", userAgent=" + userAgent + ", crypto=" + crypto + ", role=" + role + "]";
	}
}
