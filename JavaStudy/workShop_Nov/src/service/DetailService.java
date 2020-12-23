package service;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import bean.ShohinBean;
import util.ConstSQL;

public class DetailService{

    Connection connection = null;
    Statement statement = null;
    ResultSet resultSet = null;

    ShohinBean shohinData;

	public ShohinBean showDetail(int showId){

		try {

			Class.forName(ConstSQL.POSTGRES_DRIVER);
	        connection = DriverManager.getConnection(ConstSQL.JDBC_CONNECTION, ConstSQL.USER, ConstSQL.PASS);

	        PreparedStatement psExecuteQuery = connection.prepareStatement(ConstSQL.DETAIL_SELECT_SQL);
	        psExecuteQuery.setInt(1, showId);
            resultSet = psExecuteQuery.executeQuery();

            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                int price = resultSet.getInt("price");
                String imageUrl = resultSet.getString("img_url");

                shohinData = new ShohinBean();
                shohinData.setId(id);
                shohinData.setName(name);
                shohinData.setPrice(price);
                shohinData.setImageUrl(imageUrl);
            }


		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}catch(SQLException e) {
			e.printStackTrace();
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

		return shohinData;
	}
}