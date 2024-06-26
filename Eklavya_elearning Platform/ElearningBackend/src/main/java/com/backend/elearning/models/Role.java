package com.backend.elearning.models;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table(name="role")
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer role_id;
    
    @Column
    private String name;

    @OneToMany(mappedBy = "role")
	private List<User> users;

	public Role() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Role(Integer i) {
		super();
		this.role_id = i;
		// TODO Auto-generated constructor stub
	}

	public Role(Integer role_id, String name, List<User> users) {
		super();
		this.role_id = role_id;
		this.name = name;
		this.users = users;
	}
	
	public Integer getId() {
		return role_id;
	}

	public void setId(Integer id) {
		this.role_id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}




	@Override
	public String toString() {
		return "Category [id=" + role_id + ", name=" + name + ", users=" + users + "]";
	}

 

	

    
}
