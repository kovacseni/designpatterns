package facade;

import javax.sql.DataSource;
import java.sql.*;
import java.util.Optional;
import java.util.function.Function;

public class JdbcFacade {

    private DataSource dataSource;

    public JdbcFacade(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public <T> Optional<T> queryForObject(String sql, Function<ResultSet, T> function) {
        try (Connection conn = dataSource.getConnection();
             PreparedStatement statement = conn.prepareStatement(sql);
             ResultSet rs = statement.executeQuery()) {
            if (rs.next()) {
                T t = function.apply(rs);
                if (rs.next()) {
                    throw new IllegalStateException("Too many results");
                }
                return Optional.of(t);
            }
            return Optional.empty();
        } catch (SQLException sqle) {
            throw new IllegalStateException();
        }
    }
}
