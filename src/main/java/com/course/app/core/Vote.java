package com.course.app.core;

import com.course.app.dto.VoteDTO;

import java.time.LocalDateTime;
import java.util.List;

public class Vote {
	private String artist;
	private List<String> genres;
	private Message message;
	private Vote vote;
	private String text;

	private LocalDateTime createTime;

	//private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
	public String getText() {
		return text;
	}

	public Vote (VoteDTO dto) {
		this.artist = dto.getArtist();
		this.genres = dto.getGenres();
		this.message = new Message(dto.getText(), LocalDateTime.now());

	}

	public String getArtist() {
		return artist;
	}

	public List<String> getGenres() {
		return genres;
	}

	public Message getMessage() {
		return message;
	}

    public Vote getVote() {
		return vote;
	}

	public LocalDateTime getCreateTime() {
		return createTime;
	}

	public void setCreateTime(LocalDateTime createTime) {
		this.createTime = createTime;
	}
}
