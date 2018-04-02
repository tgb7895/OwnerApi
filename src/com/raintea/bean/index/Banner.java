/**
  * Copyright 2018 bejson.com 
  */
package com.raintea.bean.index;

/**
 * Auto-generated: 2018-03-26 21:55:8
 *
 * @author bejson.com (i@bejson.com)
 * @website http://www.bejson.com/java2pojo/
 */
public class Banner {

    private int id;
    private String title;
    private int type;
    private String pic;
    public void setId(int id) {
         this.id = id;
     }
     public int getId() {
         return id;
     }

    public void setTitle(String title) {
         this.title = title;
     }
     public String getTitle() {
         return title;
     }

    public void setType(int type) {
         this.type = type;
     }
     public int getType() {
         return type;
     }

    public void setPic(String pic) {
         this.pic = pic;
     }
     public String getPic() {
         return pic;
     }
	@Override
	public String toString() {
		return "Banner [id=" + id + ", title=" + title + ", type=" + type + ", pic=" + pic + "]";
	}
     
     

}