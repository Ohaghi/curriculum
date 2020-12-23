package service;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import util.ConstSQL;
public class NewItemService {
	Connection connection = null;
    Statement statement = null;
    ResultSet resultSet = null;

	public void insert(String name,int priceNum,String imageUrl,int categoryNum){

		try {

			Class.forName(ConstSQL.POSTGRES_DRIVER);
	        connection = DriverManager.getConnection(ConstSQL.JDBC_CONNECTION, ConstSQL.USER, ConstSQL.PASS);

	        PreparedStatement psExecuteQuery = connection.prepareStatement(ConstSQL.ITEM_INSERT_SQL);
	        psExecuteQuery.setString(1, name);
	        psExecuteQuery.setInt(2, priceNum);
	        psExecuteQuery.setString(3,imageUrl);
	        psExecuteQuery.setInt(4,categoryNum);
            psExecuteQuery.executeUpdate();
            System.out.println("----------service1-----------------------");


		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}catch(SQLException e) {
			e.printStackTrace();
			System.out.println("-------------service2--------------------");
		}finally{
			try {
                if (resultSet != null) {
                    resultSet.close();
                }
                if (statement != null) {
                    statement.close();
                }
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
		}
	}
}

