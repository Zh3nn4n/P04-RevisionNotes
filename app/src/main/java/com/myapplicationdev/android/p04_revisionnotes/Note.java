package com.myapplicationdev.android.p04_revisionnotes;

public class Note {

	private Integer id;
	private String noteContent;
	private Integer stars;

    public Note(Integer id, String noteContent, Integer stars) {
        this.id = id;
        this.noteContent = noteContent;
        this.stars = stars;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNoteContent() {
        return noteContent;
    }

    public void setNoteContent(String noteContent) {
        this.noteContent = noteContent;
    }

    public Integer getStars() {
        return stars;
    }

    public void setStars(Integer stars) {
        this.stars = stars;
    }
}
