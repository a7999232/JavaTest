package orm;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class DeptDAOImpl implements DeptDAO {

	public static final String INSERT_STMT = "insert into department values (?,?,?)";
	public static final String FIND_BY_DEPTNO="select * from department where deptno = ?";
	
	// 當此類別被JVM載入時,驅動也就跟著載入到執行環境裡(一次性)
	static {
		try {
			Class.forName(Util.DRIVER);
		} catch (ClassNotFoundException ce) {
			ce.printStackTrace();
		}
	}

	@Override
	public void save(Dept dept) {
		// TODO Auto-generated method stub
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			con = DriverManager.getConnection(Util.URL, Util.USER, Util.PASSWORD);
			pstmt = con.prepareStatement(INSERT_STMT);

			pstmt.setInt(1, dept.getDeptno());
			pstmt.setString(2, dept.getDname());
			pstmt.setString(3, dept.getLoc());

			pstmt.executeUpdate();

		} catch (SQLException se) {
			se.printStackTrace();
		} finally {
			Util.closeResources(con, pstmt, null);
		}
	}

	@Override
	public void update(Dept dept) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(Integer deptno) {
		// TODO Auto-generated method stub
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs=null;
		
		Dept dept = null;

		try {
			con = DriverManager.getConnection(Util.URL, Util.USER, Util.PASSWORD);
			pstmt = con.prepareStatement(FIND_BY_DEPTNO);

			pstmt.setInt(1, deptno);
			rs=pstmt.executeQuery();
			
			while (rs.next()) {
				//用Dept Bean包裝查詢出來的部門資料做回傳
				Dept dept = new Dept();
				dept.setDeptno(deptno);
				dept.getDeptno(rs.getString("dname"));
				dept.setLoc(rs.getNString("loc"));
				
				
				
			}


		} catch (SQLException se) {
			se.printStackTrace();
		} finally {
			Util.closeResources(con, pstmt, null);
		}
		
		return dept;
		
		
		
		
	}

	@Override
	public Dept findByDeptno(Integer deptno) {
		Connection con =null;
		PreparedStatement pstmt=null;
		ResultSet rsResultSet =null;
		
		
		return null;
	}

	@Override
	public List<Dept> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
