package com.numadic.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.numadic.utility.SeleniumCommands;

public class JobApplicationPage extends SeleniumCommands {
	
	@FindBy(xpath = "(//lyte-drop-button)[1]")
	private WebElement listbox;
	
	@FindBy(id = "Lyte_Drop_Item_1")
	private WebElement mr;
	
	@FindBy(xpath = "//label[text()='First Name']//following::input[1]")
	private WebElement firstName;
	
	@FindBy(xpath = "//label[text()='Last Name']//following::input[1]")
	private WebElement lastName;
	
	@FindBy(xpath = "//label[text()='Email']//following::input[1]")
	private WebElement email;
	
	@FindBy(xpath = "//label[text()='Mobile']//following::input[1]")
	private WebElement mobile;
	
	@FindBy(xpath = "//label[text()='Street']//following::input[1]")
	private WebElement street;
	
	@FindBy(xpath = "//label[text()='City']//following::input[1]")
	private WebElement city;
	
	@FindBy(xpath = "//label[text()='State/Province']//following::input[1]")
	private WebElement state;
	
	@FindBy(xpath = "//label[text()='Zip/Postal Code']//following::input[1]")
	private WebElement zip;
	@FindBy(xpath = "//label[text()='Country']//following::input[1]")
	private WebElement country;
	@FindBy(xpath = "//label[text()='Current Employer']//following::input[1]")
	private WebElement cEmployer;
	@FindBy(xpath = "//label[text()='Skill Set']//following::input[1]")
	private WebElement skill;
	@FindBy(xpath = "//label[text()='Current CTC']//following::input[1]")
	private WebElement currentCTC;
	@FindBy(xpath = "//label[text()='Expected CTC']//following::input[1]")
	private WebElement eCTC;
	@FindBy(xpath = "//label[text()='Reason for change']//following::input[1]")
	private WebElement reason;
	@FindBy(xpath = "//label[text()='Why Join Numadic ?']//following::input[1]")
	private WebElement whyNumadic;
	@FindBy(xpath = "//label[text()='LinkedIn']//following::input[1]")
	private WebElement linkedin;
	public WebElement getListbox() {
		return listbox;
	}
	public void setListbox(WebElement listbox) {
		this.listbox = listbox;
	}
	public WebElement getMr() {
		return mr;
	}
	public void setMr(WebElement mr) {
		this.mr = mr;
	}
	public WebElement getFirstName() {
		return firstName;
	}
	public void setFirstName(WebElement firstName) {
		this.firstName = firstName;
	}
	public WebElement getLastName() {
		return lastName;
	}
	public void setLastName(WebElement lastName) {
		this.lastName = lastName;
	}
	public WebElement getEmail() {
		return email;
	}
	public void setEmail(WebElement email) {
		this.email = email;
	}
	public WebElement getMobile() {
		return mobile;
	}
	public void setMobile(WebElement mobile) {
		this.mobile = mobile;
	}
	public WebElement getStreet() {
		return street;
	}
	public void setStreet(WebElement street) {
		this.street = street;
	}
	public WebElement getCity() {
		return city;
	}
	public void setCity(WebElement city) {
		this.city = city;
	}
	public WebElement getState() {
		return state;
	}
	public void setState(WebElement state) {
		this.state = state;
	}
	public WebElement getZip() {
		return zip;
	}
	public void setZip(WebElement zip) {
		this.zip = zip;
	}
	public WebElement getCountry() {
		return country;
	}
	public void setCountry(WebElement country) {
		this.country = country;
	}
	public WebElement getcEmployer() {
		return cEmployer;
	}
	public void setcEmployer(WebElement cEmployer) {
		this.cEmployer = cEmployer;
	}
	public WebElement getSkill() {
		return skill;
	}
	public void setSkill(WebElement skill) {
		this.skill = skill;
	}
	public WebElement getCurrentCTC() {
		return currentCTC;
	}
	public void setCurrentCTC(WebElement currentCTC) {
		this.currentCTC = currentCTC;
	}
	public WebElement geteCTC() {
		return eCTC;
	}
	public void seteCTC(WebElement eCTC) {
		this.eCTC = eCTC;
	}
	public WebElement getReason() {
		return reason;
	}
	public void setReason(WebElement reason) {
		this.reason = reason;
	}
	public WebElement getWhyNumadic() {
		return whyNumadic;
	}
	public void setWhyNumadic(WebElement whyNumadic) {
		this.whyNumadic = whyNumadic;
	}
	public WebElement getLinkedin() {
		return linkedin;
	}
	public void setLinkedin(WebElement linkedin) {
		this.linkedin = linkedin;
	}
	
	
	public JobApplicationPage() {

		PageFactory.initElements(driver, this);
	}

	
	
	

}
