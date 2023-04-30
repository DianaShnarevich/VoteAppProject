package com.course.app.dao.db;

import com.course.app.core.Vote;
import com.course.app.dao.api.IVotesDAO;
import com.course.app.dao.db.ds.api.IDataSourceWrapper;
import com.course.app.dto.VoteDTO;

import java.sql.*;
import java.time.LocalDateTime;
import java.util.List;

public class VotesDataBaseDAO implements IVotesDAO {

	private IDataSourceWrapper dataSource;

	private final String getAll = "";

	public VotesDataBaseDAO(IDataSourceWrapper wrapper){
		this.dataSource = wrapper;
	}

	@Override
	public List<Vote> getAll() {
		Wrapper wrapper = null;
		List<Vote> voteList = null;

		try{
				Connection connection = dataSource.getConnection();
		    PreparedStatement stmt = connection.prepareStatement(getAll);
		    ResultSet resSet = stmt.executeQuery();
		}catch (Exception e){
			throw new RuntimeException(e);
		}
		return voteList;
	}


	@Override
	public void save(VoteDTO vote) {
		VoteDTO votes = vote.getVote();

		String artist = vote.getArtist();
		List<String> genres = vote.getGenres();
		String text = vote.getText();
		LocalDateTime createTime = vote.getCreateTime();
		int id = 0;

		try (Connection connection = dataSource.getConnection()){
			PreparedStatement preparedStatement = connection.prepareStatement();

		}

	}
}
