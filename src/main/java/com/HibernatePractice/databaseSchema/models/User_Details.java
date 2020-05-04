package com.HibernatePractice.databaseSchema.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

@Entity
@Table(name="User")
public class User_Details {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column
	private String firstname;
	
	@Column
	private String lastname;
	
	@Column
	private String dateofbirth;
	
	@Column
	private String email;
	
	@Column
	private String phonenumber;
	
	@Column
	private String password;
	
	@Column
	@Lob
	private String about;
	
	@Column
	private String profileimage;
	
	public User_Details() {
	}

	public User_Details(Long id, String firstname, String lastname, String dateofbirth, String email,
			String phonenumber, String password, String about, String profileimage) {
		super();
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.dateofbirth = dateofbirth;
		this.email = email;
		this.phonenumber = phonenumber;
		this.password = password;
		this.about = about;
		this.profileimage = profileimage;
	}

	@Override
	public String toString() {
		return "User_Details [id=" + id + ", firstname=" + firstname + ", lastname=" + lastname + ", dateofbirth="
				+ dateofbirth + ", email=" + email + ", phonenumber=" + phonenumber + ", password=" + password
				+ ", about=" + about + ", profileimage=" + profileimage + "]";
	}

	public Long getId() {
		return id;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getDateofbirth() {
		return dateofbirth;
	}

	public void setDateofbirth(String dateofbirth) {
		this.dateofbirth = dateofbirth;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhonenumber() {
		return phonenumber;
	}

	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getAbout() {
		return about;
	}

	public void setAbout(String about) {
		this.about = about;
	}

	public String getProfileimage() {
		return profileimage;
	}

	public void setProfileimage(String profileimage) {
		this.profileimage = profileimage;
	}

	

}
