package serverapp_rental;

import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ACER
 */
public class Chat {

    private String content;
    private String time_chat;
    private String username;
    private String target;

    public Connection connect;
    private Statement stat;
    private ResultSet result;

    public Connection getConnection() {
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            connect = DriverManager.getConnection("jdbc:mysql://localhost/uas_anakrektor", "root", "");
        } catch (Exception ex) {
            Logger.getLogger(Chat.class.getName()).log(Level.SEVERE, null, ex);
        }
        return connect;
    }

    public Chat() {
    }

    public Chat(String username, String target, String content, String time_chat) {
        this.username = username;
        this.target = target;
        this.content = content;
        this.time_chat = time_chat;
    }

    public Chat(String username, String content, String time_chat) {
        this.username = username;
        this.content = content;
        this.time_chat = time_chat;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getTime_chat() {
        return time_chat;
    }

    public void setTime_chat(String time_chat) {
        this.time_chat = time_chat;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target;
    }

    public void insert() {
        getConnection();
        try {
            if (!connect.isClosed()) {
                stat = (Statement) connect.createStatement();
                PreparedStatement sql = (PreparedStatement) connect.prepareStatement("INSERT INTO chat(content, time_chat, username, target) VALUES(?, ?, ?, ?)");
                sql.setString(1, getContent());
                sql.setString(2, getTime_chat());
                sql.setString(3, getUsername());
                sql.setString(4, getTarget());
                sql.executeUpdate();
            } else {
                System.out.println("Koneksi Hilang");
            }
            connect.close();
        } catch (Exception e) {
            System.out.println("Error di Insert Chat: " + e);
        }
    }

    public ArrayList<Chat> displayServer() {
        getConnection();
        ArrayList<Chat> temp = new ArrayList<Chat>();
        try {
            if (!connect.isClosed()) {
                stat = (Statement) connect.createStatement();
                result = stat.executeQuery("SELECT * FROM chat");
                while (result.next()) {
                    Chat chat = new Chat(result.getString("username"), result.getString("target"), result.getString("content"), result.getString("time_chat"));
                    temp.add(chat);
                }
            } else {
                System.out.println("Koneksi Hilang");
            }
            connect.close();
        } catch (Exception e) {
            System.out.println("Display Chat Server error : " + e);
        }
        return temp;
    }

    public ArrayList<Chat> displayClient(String nama) {
        getConnection();
        ArrayList<Chat> temp = new ArrayList<Chat>();
        try {
            if (!connect.isClosed()) {

                stat = (Statement) connect.createStatement();
                PreparedStatement sql = (PreparedStatement) connect.prepareStatement("SELECT username, content, time_chat FROM chat WHERE username = ? OR target = ?");
                sql.setString(1, nama);
                sql.setString(2, nama);
                result = sql.executeQuery();
                while (result.next()) {
                    Chat chat = new Chat(result.getString("username"), result.getString("content"), result.getString("time_chat"));
                    temp.add(chat);
                }
            } else {
                System.out.println("Koneksi Hilang");
            }
            connect.close();
        } catch (Exception e) {
            System.out.println("Display Chat Client error : " + e);
        }
        return temp;
    }
}
