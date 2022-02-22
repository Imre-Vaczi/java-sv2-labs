package jdbc.blob;

import javax.sql.DataSource;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.sql.*;

public class ImagesDao {

    private DataSource dataSource;

    public ImagesDao(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public void saveImage(String filename, InputStream is) {
        try (
                Connection conn = dataSource.getConnection();
                PreparedStatement ps = conn.prepareStatement("insert into images(filename, content) values(?,?)")
                ) {
            ps.setString(1,filename);
            Blob blob = conn.createBlob();
            fillBlob(is, blob);
            ps.setBlob(2, blob);
            ps.executeUpdate();
        }
        catch (SQLException sqlException) {
            throw new IllegalStateException("Can not insert.", sqlException);
        }
    }

    private void fillBlob(InputStream is, Blob blob) throws SQLException{
        try (OutputStream os = blob.setBinaryStream(1)) {
            is.transferTo(os);
        }
        catch (IOException ioe) {
            throw new IllegalStateException("Blob can not be written.", ioe);
        }
    }

    public InputStream getImageByName(String name) {
        try (
                Connection conn = dataSource.getConnection();
                PreparedStatement ps = conn.prepareStatement("select content from images where filename = ?")
                ) {
            ps.setString(1, name);

            return readInputStreamFromStatement(ps);

        }
        catch (SQLException sqlException) {
            throw new IllegalStateException("Can not query.", sqlException);
        }
    }

    private InputStream readInputStreamFromStatement(PreparedStatement ps) throws SQLException {
        try (ResultSet rs = ps.executeQuery()) {
            if (rs.next()) {
                Blob blob = rs.getBlob("content");
                return blob.getBinaryStream();
            }
            throw new IllegalStateException("Can not found.");
        }
    }
}
