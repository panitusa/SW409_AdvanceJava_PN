package com.sw409.BlackBoard.models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

	@Entity
	@Table(name = "modules")
public class Module {
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Integer id;
		String title;
		@ManyToOne
		@JsonIgnore
		private Course course;
		@OneToMany(mappedBy = "module")
		private List<Lesson> lessons;
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
		public Course getCourse() {
			return course;
		}
		public void setCourse(Course course) {
			this.course = course;
		}
		public List<Lesson> getLessons() {
			return lessons;
		}
		public void setLessons(List<Lesson> lessons) {
			this.lessons = lessons;
		}
		
}
