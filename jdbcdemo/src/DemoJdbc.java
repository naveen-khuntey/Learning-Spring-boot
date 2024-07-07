import java.sql.*; // import package
public class DemoJdbc {
    public static void main(String[] args) throws Exception {
        /*
         * import package
         * load and register
         * create connection
         * create Statement
         * execute Statement
         * process the result
         * close connection
         * */

        //load and register
        Class.forName("org.postgresql.Driver");

        //create connection
        String url = "jdbc:postgresql://localhost:5432/demo";
        String uname = "postgres";
        String pass = "Naveen@425";
        Connection con = DriverManager.getConnection(url,uname,pass);
        System.out.println("Connection established");

        //create Statement
        String query = "select * from student";
        Statement st = con.createStatement();

        //execute Statement
        ResultSet rs = st.executeQuery(query);

        //process the result
//        System.out.println(rs.next();
        while(rs.next()){
            System.out.print(rs.getInt("sid")+"-");
            System.out.print(rs.getString("pname")+"-");
            System.out.println(rs.getInt("marks"));
        }
        //close connection
        con.close();
        System.out.println("Connection closed");

    }
}
