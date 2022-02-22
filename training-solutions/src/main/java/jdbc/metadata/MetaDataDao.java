package jdbc.metadata;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class MetaDataDao {

    private DataSource dataSource;

    public MetaDataDao(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public List<String> getTableNames() {
        try (Connection conn = dataSource.getConnection()) {
            DatabaseMetaData metaData = conn.getMetaData();
            return getTableNamesByMetaData(metaData);
        }
        catch (SQLException sqlException) {
            throw new IllegalStateException("Can not connect.", sqlException);
        }
    }

    private List<String> getTableNamesByMetaData(DatabaseMetaData metaData) {
        try (ResultSet rs = metaData.getTables(null, null, null, null)) {
            List<String> names = new ArrayList<>();
            while (rs.next()) {
                names.add(rs.getString(3));
            }
            return names;
        }
        catch (SQLException sqlException) {
            throw new IllegalStateException("No metadata.");
        }
    }
}
