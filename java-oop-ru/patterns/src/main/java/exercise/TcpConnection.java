package exercise;
import exercise.connections.Connection;
import exercise.connections.Disconnected;

import java.util.List;
import java.util.ArrayList;

// BEGIN
public class TcpConnection {
    private Connection connection;
    private final String ipAddress;
    private final Integer port;
    public TcpConnection(String ipAddress, int port) {
        this.connection = new Disconnected(this);
        this.ipAddress = ipAddress;
        this.port = port;
    }

    public void connect() {
        connection.connect();
    }

    public void disconnect() {
        connection.disconnect();
    }

    public void write(String data) {
        connection.write(data);
    }

    public String getCurrentState() {
        return connection.getCurrentState();
    }

    public void setConnection(Connection connection) {
        this.connection = connection;
    }
}
// END
