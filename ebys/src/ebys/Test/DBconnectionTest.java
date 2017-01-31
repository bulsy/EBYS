package ebys.Test;
import ebys.DAO.DBconnection;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import java.sql.Connection;
import java.sql.Statement;

public class DBconnectionTest {
	@InjectMocks private DBconnection dbConnection;
	@Mock private Connection mockConnection;
	@Mock private Statement mockStatement;
	
	@Before
	public void setUp() {
		MockitoAnnotations.initMocks(this);
	}
	
	@Test
	public void testMockDBConnection() throws Exception {	
		Mockito.when(mockConnection.createStatement()).thenReturn(mockStatement);
		Mockito.when(mockConnection.createStatement().executeUpdate((String) Mockito.any())).thenReturn(1);
		int value = dbConnection.executeQuery("");
		Assert.assertEquals(value, 1);
		Mockito.verify(mockConnection.createStatement(), Mockito.times(1));
	}

}
