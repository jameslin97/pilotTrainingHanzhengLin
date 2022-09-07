public class SqlServeConnection implements DatabaseConnection{
    @Override
    public SqlServeConnection getConnection(){
        return new SqlServeConnection();
    }
}
