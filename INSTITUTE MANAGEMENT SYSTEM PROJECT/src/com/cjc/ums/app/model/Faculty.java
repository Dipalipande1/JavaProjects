package com.cjc.ums.app.model;

public class Faculty {
private int Fid;
private String Fname;
private Course course;

public int getFid() {
	return Fid;
}
public void setFid(int Fid) {
	this.Fid = Fid;
}
public String getFname() {
	return Fname;
}
public void setFname(String Fname) {
	this.Fname = Fname;
}
public Course getCourse() {
	return course;
}
public void setCourse(Course course) {
	this.course = course;
}

}
