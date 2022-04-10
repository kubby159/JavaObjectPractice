package ch13.web.userinfo;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import ch13.domain.userinfo.UserInfo;
import ch13.domain.userinfo.dao.UserinfoDao;
import ch13.domain.userinfo.dao.mysql.UserinfoMySqlDao;
import ch13.domain.userinfo.dao.oracle.UserinfoOracleDao;

public class UserinfoClient {

	public static void main(String[] args) throws IOException {
		// file을 읽어옴.
		FileInputStream fis = new FileInputStream("db.properties");

		// Properties를 통해 KEY: VALUE형식으로 데이터를 가져옴.
		Properties prop = new Properties();
		prop.load(fis);

		// getProperty(key)
		String dbType = prop.getProperty("DBTYPE");

		UserInfo userInfo = new UserInfo();
		userInfo.setUserId("kubby159@gmail.com");
		userInfo.setPassword("1234@#@!");
		userInfo.setUserName("이순신");
		UserinfoDao userInfoDao = null;

		if (dbType.equals("ORACLE")) {
			userInfoDao = new UserinfoOracleDao();
		}

		else if (dbType.equals("MYSQL")) {
			userInfoDao = new UserinfoMySqlDao();
		}

		else {
			System.out.println("db error");
			return;
		}

		userInfoDao.insertUserInfo(userInfo);
		userInfoDao.updateUserInfo(userInfo);
		userInfoDao.deleteUserInfo(userInfo);
	}
}
