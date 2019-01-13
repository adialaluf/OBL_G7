package entities;

import java.io.Serializable;

public class User implements Serializable
{
	private String userName;
	private String password;
	private String idNumber;
	private String firstName;
	private String lastName;

	private String loginStatus;
	private String type;

	public User(String idNum, String name, String pass, String first, String last, String status, String userType)
	{
		this.userName = name;
		this.password = pass;
		this.idNumber = idNum;
		this.firstName = first;
		this.lastName = last;
		this.loginStatus = status;
		this.type = userType;
	}

	public User(String name, String pass)//for checking user exist
	{
		this.userName = name;
		this.password = pass;
	}

	public User(String name, String pass, String idNum, String first, String last)
	{
		this.userName = name;
		this.password = pass;
		this.idNumber = idNum;
		this.firstName = first;
		this.lastName = last;
		this.loginStatus = "off";
	}

	public String getPassWord()
	{
		return password;
	}

	public void setPassword(String password)
	{
		this.password = password;
	}

	public String getUserName()
	{
		return userName;
	}

	public void setUserName(String userName)
	{
		this.userName =  userName;
	}

	public String getType()
	{
		return type;
	}

	public void setType(String type)
	{
		this.type = type;
	}

	public String getLoginStatus()
	{
		return loginStatus;
	}

	public void setLoginStatus(String loginStatus)
	{
		this.loginStatus = loginStatus;
	}

	public String getFirstName()
	{
		return firstName;
	}

	public void setFirstName(String firstName)
	{
		this.firstName = firstName;
	}
	public String getLastName()
	{
		return lastName;
	}

	public void setLastName(String lastName)
	{
		this.lastName = lastName;
	}

	public String getId()
	{
		return idNumber;
	}

	public void setId(String idNum)
	{
		this.idNumber = idNum;
	}

}