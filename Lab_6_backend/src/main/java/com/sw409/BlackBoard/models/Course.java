package com.sw409.BlackBoard.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Course {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
Integer id;
String title, authorName;
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
public String getAuthorName() {
	return authorName;
}
public void setAuthorName(String authorName) {
	this.authorName = authorName;
}


}
