package com.handshake.interviews.alarms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class AlarmsDao {

	public Collection<Alarm> fetchAllAlarms() {
		String sql = "SELECT id, text FROM alarms";
		try (Connection conn = DriverManager.getConnection("jdbc:sqlite:src/main/resources/handshake-interview.db");
			Statement statement = conn.createStatement();
			ResultSet rs = statement.executeQuery(sql)) {
			Collection<Alarm> results = new ArrayList<Alarm>();
			while(rs.next()) {
				Alarm alarm = new Alarm(rs.getInt("id"), rs.getString("text"));
				results.add(alarm);
			}
			return results;
		} catch (SQLException e) {
			handleError(e);
		}
		return Collections.emptyList();
	}
	
	private void handleError(Exception e) {
		e.printStackTrace();
	}
}
