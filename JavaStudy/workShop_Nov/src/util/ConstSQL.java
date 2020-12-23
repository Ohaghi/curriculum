package util;

public class ConstSQL{

	public static final String POSTGRES_DRIVER = "org.postgresql.Driver";

    public static final String JDBC_CONNECTION = "jdbc:postgresql://localhost:5432/workshop";

    public static final String USER = "postgres";

    public static final String PASS = "postgres";

    public static final String LIST_SELECT_SQL = "SELECT id,name,price,img_url FROM items;";

    public static final String LOGIN_SELECT_SQL = "SELECT * FROM users where name = ? AND password = ?;";

    public static final String DETAIL_SELECT_SQL = "SELECT * FROM items WHERE id = ?;";

    public static final String USER_INSERT_SQL = "INSERT INTO users (name, password) VALUES (?,?);";
    public static final String  ITEM_INSERT_SQL= "INSERT INTO items (name,price,img_url,category) VALUES(?,?,?,?);";
}