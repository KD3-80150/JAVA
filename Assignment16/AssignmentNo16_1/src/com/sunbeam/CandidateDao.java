package com.sunbeam;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
public class CandidateDao implements AutoCloseable 
{
	private Connection con;

	public CandidateDao() throws SQLException {
		con = DbUtil.getConnection();
	}

	@Override
	public void close() {
		try {
			if (con != null)
				con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// add new candidate
	public int save(String name, String party, int votes) throws SQLException {
		String sql = "INSERT INTO  candidates VALUES(default,?,?,?)";
		try (PreparedStatement stmt = con.prepareStatement(sql)) {
			stmt.setString(1, name);
			stmt.setString(2, party);
			stmt.setInt(3, votes);
			int cnt = stmt.executeUpdate();
			return cnt;
		} // stmt close

	}

	// delete given candidate
	public int deleteById(int id) throws SQLException {
		String sql = "DELETE FROM candidates WHERE id=?";
		try (PreparedStatement stmt = con.prepareStatement(sql)) {
			stmt.setInt(1, id);
			int cnt = stmt.executeUpdate();
			return cnt;
		} // stmt.close();
	}

	// update candidate

	public int update(String name, String party, int id) throws SQLException {
		String sql = "UPDATE candidates set name=?,party=? where id=?";
		try (PreparedStatement stmt = con.prepareStatement(sql)) {
			stmt.setString(1, name);
			stmt.setString(2, party);
			stmt.setInt(3, id);
			int cnt = stmt.executeUpdate();
			return cnt;
		}
	}

	// get all candidates
	public List<candidate> findAll() throws SQLException {
		List<candidate> list = new ArrayList<>();
		String sql = "SELECT * FROM candidates";
		try (PreparedStatement stmt = con.prepareStatement(sql)) {
			try (ResultSet rs = stmt.executeQuery()) {
				while (rs.next()) {
					int id = rs.getInt("id");
					String name = rs.getString("name");
					String party = rs.getString("party");
					int votes = rs.getInt("votes");
					candidate c = new candidate(id, name, party, votes);
					list.add(c);
				}
			} // rs.close();
		} // stmt.close();
		return list;
	}

	// increment candidate vote
	public int incrementVote(int candidateId) throws SQLException {
		String sql = "UPDATE candidates SET votes=votes+1 WHERE id=?";
		try (PreparedStatement stmt = con.prepareStatement(sql)) {
			stmt.setInt(1, candidateId);
			int cnt = stmt.executeUpdate();
			return cnt;
		} // stmt.close();
	}

	// get all candidates of given party
	public List<candidate> findByParty(String givenParty) throws SQLException {
		List<candidate> list = new ArrayList<>();
		String sql = "SELECT * FROM candidates WHERE party=?";
		try (PreparedStatement stmt = con.prepareStatement(sql)) {
			stmt.setString(1, givenParty);
			try (ResultSet rs = stmt.executeQuery()) {
				while (rs.next()) {
					int id = rs.getInt("id");
					String name = rs.getString("name");
					String party = rs.getString("party");
					int votes = rs.getInt("votes");
					candidate c = new candidate(id, name, party, votes);
					list.add(c);
				}
			} // rs.close();
		} // stmt.close();
		return list;
	}

	// get partywise vote count

}
