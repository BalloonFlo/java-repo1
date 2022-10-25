package member;
//데이터베이스 연결하기, 데이터베이스 안에 삽입하기, 삭제하기, 수정하기, 검색하기 기능을 구현해 주는 클래스

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MemberDAO {
	//필드 선언(변수)
	String Driver = "com.mysql.cj.jdbc.Driver";
	String Url = "jdbc:mysql://localhost:3306/movie";
	String Userid = "root";
	String Password = "1234";
	
	Connection conn = null; //연결
	Statement stmt = null; //sql문 전달
	PreparedStatement pstmt = null; //sql문 전달. 나중에 ? ? 안에 데이터를 추가할 수 있다.
	ResultSet rs = null; //DB의 처리 결과를 받을 때
	
	//메소드 구현
	public void insertMember(String Id, String Name, String Password, String PhoneNumber) {
		//데이터베이스 안에 자룔르 삽입하기
		try {
			conn = DriverManager.getConnection(Url, Userid, Password);
			String query = "insert into Member(Id, Name, Password, PhoneNumber) values (?, ?, ?, ?)";
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, Id);
			pstmt.setString(2, Name);
			pstmt.setString(3, Password);
			pstmt.setString(4, PhoneNumber);
			pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				pstmt.close();
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public boolean checkId(String Id) {
		//아이디 중복 체크하기
		boolean result = false;
		try {
			conn = DriverManager.getConnection(Url, Userid, Password);
			String query = "select Id from memeber wher Id = ?";
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, Id);
			pstmt.executeQuery();
			if (rs.next()) {
				result = true;
			} else {
				result = false;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				rs.close();
				pstmt.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return result;
	}

	public int login(String Id, String Password) {
		//로그인하기. 아이디와 비밀번호를 member 테이블 안에 있는지 확인하기.
		try {
			conn = DriverManager.getConnection(Url, Userid, Password);
			String query = "select Password from member where Id = ? and Password = ?";
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, Id);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				if (rs.getString(1).contentEquals(Password)) {
					return 1;
				} else {
					return 0;
				} 
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}  finally {
			try {
				rs.close();
				pstmt.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return 0;
	}
	
}
