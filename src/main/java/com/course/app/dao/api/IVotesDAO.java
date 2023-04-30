package com.course.app.dao.api;

import com.course.app.core.Vote;
import com.course.app.dto.VoteDTO;

import java.sql.SQLException;
import java.util.List;

public interface IVotesDAO {
	List<Vote> getAll();
	void save(Vote vote) throws SQLException;

    void save(VoteDTO vote);
}
