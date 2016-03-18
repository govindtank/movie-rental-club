package org.movieRental.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name="movies")
public class Movie {
	@Id
	@GeneratedValue
	private int id;
	private String name;
	private String releaseYear;
	
	
	@ManyToOne
	@JoinColumn(name="idUser")
	private User user;
	
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Movie (){}

	public Movie(int id, String name, String releaseYear) {
		super();
		this.id = id;
		this.name = name;
		this.releaseYear = releaseYear;
	}
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getReleaseYear() {
		return releaseYear;
	}

	public void setReleaseYear(String releaseYear) {
		this.releaseYear = releaseYear;
	}

	@Override
	public String toString() {
		return "Movie [id=" + id + ", name=" + name + ", releaseYear=" + releaseYear + "]";
	}
}
