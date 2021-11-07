package io.turntabl.client;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.*;

public class CorporateClientTest {
    private AccountManager mockAccountManager;
    private CorporateClient corporate;

    @Before
    public void setUp() {
        mockAccountManager = mock(AccountManager.class);
        corporate = new CorporateClient(mockAccountManager, ServiceLevel.PLATINUM);
    }

    @Test
    public void Given_ClientIsCreated_Then_ServiceLevel_ShouldBe_Set() {
        assertEquals(ServiceLevel.PLATINUM, corporate.getServiceLevel());
    }

    @Test
    public void Given_GetNameIsCalled_Then_AccountManagerGetName_Should_ReturnName() {
        when(mockAccountManager.getName()).thenReturn("Turntabl");

        assertEquals("Turntabl", corporate.getName());
    }

    @Test
    public void Given_SetNameIsCalled_Then_AccountManagerSetName_ShouldBe_CalledOnce() {
        corporate.setName("Fidelity");

        verify(mockAccountManager, times(1)).setName(anyString());
    }
}