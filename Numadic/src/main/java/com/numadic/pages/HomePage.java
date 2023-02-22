package com.numadic.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import com.numadic.utility.SeleniumCommands;

public class HomePage extends SeleniumCommands {

	
	
	@FindBy(xpath = "//h2[text()='JOIN OUR CREW']")
	private WebElement join;
	
	@FindBy(xpath = "//lyte-drop-button")
	private WebElement listbox;
	
	@FindBy(xpath = "//a[text()='QA Engineer']")
	private WebElement qaEngineer;
	@FindBy(xpath = "(//button)[3]")
	private WebElement interested;
	
	@FindBy(id = "Lyte_Drop_Item_4")
	private WebElement engineering;
	
	
	
	
	
	
	
	
	



	public WebElement getEngineering() {
		return engineering;
	}




	public void setEngineering(WebElement engineering) {
		this.engineering = engineering;
	}




	public WebElement getJoin() {
		return join;
	}




	public void setJoin(WebElement join) {
		this.join = join;
	}




	public WebElement getListbox() {
		return listbox;
	}




	public void setListbox(WebElement listbox) {
		this.listbox = listbox;
	}




	public WebElement getQaEngineer() {
		return qaEngineer;
	}




	public void setQaEngineer(WebElement qaEngineer) {
		this.qaEngineer = qaEngineer;
	}




	public WebElement getInterested() {
		return interested;
	}




	public void setInterested(WebElement interested) {
		this.interested = interested;
	}






	public HomePage() {

		PageFactory.initElements(driver, this);
	}

}
