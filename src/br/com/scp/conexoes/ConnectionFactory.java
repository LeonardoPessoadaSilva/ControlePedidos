package br.com.scp.conexoes;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import java.util.ResourceBundle;


public class ConnectionFactory {

    private Connection con = null; 
    private Statement statement;
    private ResultSet resultSet;

    private final String databaseURL = "jdbc:firebirdsql:localhost:C:\\Controledepedidos\\basesistema.fdb";
    private final String user = "sysdba"; 
    private final String password = "masterkey";
    private final String driverName = "org.firebirdsql.jdbc.FBDriver";
    public static ResourceBundle bundle;

    
    
    public static void initConfif(){
		bundle = ResourceBundle.getBundle("conf");
	}
	
    public static Connection getConnection() {
        try {
  
        	initConfif();
        	
            return DriverManager.getConnection(bundle.getString("url"), bundle.getString("user"), bundle.getString("password"));
            
        } catch (Exception excecao) {
            JOptionPane.showMessageDialog(null, "Não foi possivel realizar a conecção!");
            throw new RuntimeException(excecao);
        }
    }

    
    
    public void conectar() {
        try {
           Class.forName(driverName).newInstance();
           this.con = DriverManager.getConnection(databaseURL, user, password);
            System.out.println("Conexão obtida com sucesso.");
        } catch (SQLException ex) {
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        } catch (Exception e) {
            System.out.println("Problemas ao tentar conectar com o banco de dados: " + e);
        }

    }

    public void executarSQL(String sql) {
        try {
            this.statement = con.createStatement(
                    ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
            this.resultSet = this.statement.executeQuery(sql);


        } catch (SQLException sqlex) {
            sqlex.printStackTrace();
        }
    }
    
    public void executarUpdateSQL(String sql) {
        try {
            this.statement = con.createStatement(
                    ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
            this.statement.executeUpdate(sql);


        } catch (SQLException sqlex) {
            sqlex.printStackTrace();
        }
    }

    
    public int insertSQL(String pSQL) {
        int idRetorno = 0;
        try {
            this.statement = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
            this.resultSet = this.statement.executeQuery(pSQL);

            while (this.getResultSet().next()) {
                idRetorno = this.getResultSet().getInt(1);
            }

        } catch (SQLException sqlex) {
            sqlex.printStackTrace();
        }
        return idRetorno;
    }

    
    public boolean fecharConexao() {
        try {
            if ((this.getResultSet() != null) && (this.statement != null)) {
                this.getResultSet().close();
                this.statement.close();
            }
            this.getCon().close();
            return true;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return false;
    }

    
    public Statement getStatement() {
        return statement;
    }

   
    public ResultSet getResultSet() {
        return resultSet;
    }

    
    public Connection getCon() {
        return con;
    }

    
    public void setCon(Connection con) {
        this.con = con;
    }

    
    public void setStatement(Statement statement) {
        this.statement = statement;
    }

   
    public void setResultSet(ResultSet resultSet) {
        this.resultSet = resultSet;
    }
}
