package stu.msi.comment.dto;

import java.sql.Timestamp;

public class CommentDTO {
	private int commentnum;
	private String id;
	private String content;
	private Timestamp commentdate;
	
	public int getCommentnum() {
		return commentnum;
	}
	public void setCommentnum(int commentnum) {
		this.commentnum = commentnum;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Timestamp getCommentdate() {
		return commentdate;
	}
	public void setCommentdate(Timestamp commentdate) {
		this.commentdate = commentdate;
	}
	@Override
	public String toString() {
		return "CommentDTO [commentnum=" + commentnum + ", id=" + id + ", content=" + content + ", commentdate="
				+ commentdate + "]";
	}
	
	int a = 3;
}
