package io.github.chenshun00.aop.advisor.transaction.manager;

import java.sql.Connection;
import java.util.Objects;

/**
 * @author chenshun00@gmail.com
 * @since 2018/9/1
 */
public class ConnectionManager {

    private Connection connection;
    private boolean newConnection;

    public Connection getConnection() {
        return connection;
    }

    public void setConnection(Connection connection) {
        this.connection = connection;
    }

    public boolean isNewConnection() {
        return newConnection;
    }

    public void setNewConnection(boolean newConnection) {
        this.newConnection = newConnection;
    }

    private static ThreadLocal<ConnectionManager> connectionThreadLocal = new NameThreadLocal<>("connection holder");

    public static void setConnectionThreadLocal(ConnectionManager connectionManager) {
        connectionThreadLocal.set(Objects.requireNonNull(connectionManager));
    }

    public static boolean exist() {
        return connectionThreadLocal.get() != null;
    }

    public static ConnectionManager get() {
        return connectionThreadLocal.get();
    }

    public static void remove() {
        connectionThreadLocal.remove();
    }
}
