package jdbc.blob;

import org.flywaydb.core.Flyway;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mariadb.jdbc.MariaDbDataSource;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.SQLException;

import static org.junit.jupiter.api.Assertions.*;

class ImagesDaoTest {

    ImagesDao imagesDao;

    @BeforeEach
    void init() {
        MariaDbDataSource dataSource = new MariaDbDataSource();
        try {
            dataSource.setUrl("jdbc:mariadb://localhost:3306/employees?useUnicode=true");
            dataSource.setUser("employees");
            dataSource.setPassword("employees");
        }
        catch (SQLException sqlException) {
            throw new IllegalStateException("Can not connect.");
        }

        Flyway flyway = Flyway.configure().dataSource(dataSource).load();

        flyway.clean();
        flyway.migrate();

        imagesDao = new ImagesDao(dataSource);
    }

    @Test
    void saveImage() {
        imagesDao.saveImage("training360.gif", ImagesDaoTest.class.getResourceAsStream("/training360.gif"));

        ByteArrayOutputStream baos = new ByteArrayOutputStream();

        try (InputStream is = imagesDao.getImageByName("training360.gif")) {
            is.transferTo(baos);
        }
        catch (IOException ioe) {
            throw new IllegalStateException("Sth went wrong.", ioe);
        }

        assertTrue(baos.size() > 3000, "File size");

    }




}