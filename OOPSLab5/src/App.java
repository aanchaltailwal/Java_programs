import java.sql.*;

public class App {
    public static void main(String[] args) throws Exception {
        
        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/meetingDB", "root", "");

        Statement statement = conn.createStatement();

        statement.executeUpdate("CREATE TABLE Meeting (MeetingID int, ScheduledTime varchar(255), ScheduledDate Date, participantID int AUTO_INCREMENT , NameOfParticipant varchar(255), participantDateBirth Date, Email varchar(255), Mobile int, PRIMARY KEY(participantID))");
    }
}