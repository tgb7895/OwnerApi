
package com.raintea.bean.getactivitylist;


public class Data {

    private int activity_id;
    private String title;
    private String content;
    private String pic;
    private String start_time;
    private String end_time;
    private int people_count;
    private int applied_count;
    private int isJoin;
	public int getActivity_id() {
		return activity_id;
	}
	public void setActivity_id(int activity_id) {
		this.activity_id = activity_id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getPic() {
		return pic;
	}
	public void setPic(String pic) {
		this.pic = pic;
	}
	public String getStart_time() {
		return start_time;
	}
	public void setStart_time(String start_time) {
		this.start_time = start_time;
	}
	public String getEnd_time() {
		return end_time;
	}
	public void setEnd_time(String end_time) {
		this.end_time = end_time;
	}
	public int getPeople_count() {
		return people_count;
	}
	public void setPeople_count(int people_count) {
		this.people_count = people_count;
	}
	public int getApplied_count() {
		return applied_count;
	}
	public void setApplied_count(int applied_count) {
		this.applied_count = applied_count;
	}
	public int getIsJoin() {
		return isJoin;
	}
	public void setIsJoin(int isJoin) {
		this.isJoin = isJoin;
	}
	@Override
	public String toString() {
		return "Data [activity_id=" + activity_id + ", title=" + title + ", content=" + content + ", pic=" + pic
				+ ", start_time=" + start_time + ", end_time=" + end_time + ", people_count=" + people_count
				+ ", applied_count=" + applied_count + ", isJoin=" + isJoin + "]";
	}
    
     
}