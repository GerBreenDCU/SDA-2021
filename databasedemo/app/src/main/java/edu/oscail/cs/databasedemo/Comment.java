package edu.oscail.cs.databasedemo;

public class Comment {
	private long id;
	private String comment;

	long getId() {
		return id;
	}

	void setId(long id) {
		this.id = id;
	}

	public String getComment() {
		return comment;
	}

	void setComment(String comment) {
		this.comment = comment;
	}

	// Will be used by the ArrayAdapter in the ListView
	@Override
	public String toString() {
		return comment;
	}
}