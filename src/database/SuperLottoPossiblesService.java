package database;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.ArrayList;

import model.SuperLottoPossibles;

public class SuperLottoPossiblesService {
	public void addCombination(ArrayList<Integer> list)
	{
		String query = "INSERT INTO " + SuperLottoPossibles.TABLE + " VALUES(?,?,?,?,?,?,?)";
		
		try {
			PreparedStatement ps = LottoDB.getConnection().prepareStatement(query);
			
			ps.setInt(1, Types.NULL);
			ps.setInt(2, list.get(0));
			ps.setInt(3, list.get(1));
			ps.setInt(4, list.get(2));
			ps.setInt(5, list.get(3));
			ps.setInt(6, list.get(4));
			ps.setInt(7, list.get(5));
			ps.executeUpdate();
			ps.close();
			System.out.println("[6/49] COMBO ADDITION SUCCESS");
		}catch (SQLException e) {
			System.out.println("[6/49] COMBO ADDITION FAILED");
			e.printStackTrace();
		}
	}
	
	public int getCombinationCount()
	{
		String query = "SELECT COUNT(*) AS TOTAL FROM " + SuperLottoPossibles.TABLE;
		int count = 0;
		try {
			PreparedStatement ps = LottoDB.getConnection().prepareStatement(query);
			ResultSet rs = ps.executeQuery();
			
			while(rs.next())
				count = rs.getInt("total");
			
			ps.close();
			rs.close();
			System.out.println("[6/49] COMBO COUNT GET SUCCESS");
		}catch (SQLException e) {
			System.out.println("[6/49] COMBO COUNT GET FAILED");
			e.printStackTrace();
		}
		return count;
	}
	
	public boolean combinationExist(ArrayList<Integer> list)
	{
		String query = "SELECT * FROM " + SuperLottoPossibles.TABLE + " WHERE "
				+ SuperLottoPossibles.COL_NUMBER1 + " = ? AND "
				+ SuperLottoPossibles.COL_NUMBER2 + " = ? AND "
				+ SuperLottoPossibles.COL_NUMBER3 + " = ? AND "
				+ SuperLottoPossibles.COL_NUMBER4 + " = ? AND "
				+ SuperLottoPossibles.COL_NUMBER5 + " = ? AND "
				+ SuperLottoPossibles.COL_NUMBER6 + " = ?";
		boolean exist = false;
		try {
			
			PreparedStatement ps = LottoDB.getConnection().prepareStatement(query);
			
			
			ps.setInt(1, list.get(0));
			ps.setInt(2, list.get(1));
			ps.setInt(3, list.get(2));
			ps.setInt(4, list.get(3));
			ps.setInt(5, list.get(4));
			ps.setInt(6, list.get(5));
			
			ResultSet rs = ps.executeQuery();
			
			while(rs.next())
				exist = true;

			ps.close();
			rs.close();
			System.out.println("[6/49] COMBO CHECK SUCCESS");
		}catch (SQLException e) {
			System.out.println("[6/49] COMBO CHECK FAILED");
			e.printStackTrace();
		}
		
		return exist;
	}
}
