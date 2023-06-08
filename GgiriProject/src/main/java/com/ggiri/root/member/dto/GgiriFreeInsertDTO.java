package com.ggiri.root.member.dto;

public class GgiriFreeInsertDTO {
	
	private String name;
	private String id; // GgiriMember (Primary key) id
	private String introduce; // 자기소개
	private String job; // 직업 
	private String skill; // 기술
	private int project_period; // 프로젝트 기간
	private String place_of_work; // 근무지
	private String url_name;
	private String insertdate; // 작성일자
	
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getIntroduce() {
		return introduce;
	}
	public void setIntroduce(String introduce) {
		this.introduce = introduce;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public String getSkill() {
		return skill;
	}
	public void setSkill(String skill) {
		this.skill = skill;
	}
	
	public int getProject_period() {
		return project_period;
	}
	public void setProject_period(int project_period) {
		this.project_period = project_period;
	}
	public String getPlace_of_work() {
		return place_of_work;
	}
	public void setPlace_of_work(String place_of_work) {
		this.place_of_work = place_of_work;
	}
	
	
	public String getUrl_name() {
		return url_name;
	}
	public void setUrl_name(String url_name) {
		this.url_name = url_name;
	}
	public String getInsertdate() {
		return insertdate;
	}
	public void setInsertdate(String insertdate) {
		this.insertdate = insertdate;
	}
	
	
	
}
