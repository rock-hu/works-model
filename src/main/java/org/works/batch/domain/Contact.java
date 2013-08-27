/**
 * 
 */
package org.works.batch.domain;

import java.io.Serializable;
import java.util.Date;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author acogoluegnes
 * 
 */
@XmlRootElement(name = "contact")
@XmlAccessorType(XmlAccessType.FIELD)
public class Contact implements Serializable {
	@XmlElement
	private Long id;
	@XmlElement
	private String firstname;
	@XmlElement
	private String lastname;
	// OWN,SPS,OTH
	@XmlElement
	private String category;
	@XmlElement
	private String email;
	@XmlElement
	private Date birth;

	public Contact() {
	}

	public Long getId() {
		return id;
	}

	public String getFirstname() {
		return firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public Date getBirth() {
		return birth;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public void setBirth(Date birth) {
		this.birth = birth;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
