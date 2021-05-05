package com.dvdat.demoMicroprofile;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import com.dvdat.demoMicroprofile.entity.DatabaseDAO;
import com.dvdat.demoMicroprofile.entity.NetworkDAO;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class TestServiceTest {
    @Mock
    private DatabaseDAO databaseDAO;

    @Mock
    private NetworkDAO networkDAO;

    @InjectMocks
    private TestService testService;

    @Test
    public void testSave() {
        String testFilename = "test.txt";
        when(databaseDAO.save(testFilename)).thenReturn("another.txt");
        boolean saved = testService.save("test.txt");
        assertEquals(true, saved);

        verify(databaseDAO, times(1)).save("test.txt");
        verify(networkDAO, times(1)).save("test.txt");
    }
}
