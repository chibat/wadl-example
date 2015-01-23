package client;

import static org.junit.Assert.assertTrue;

import java.net.URI;
import java.net.URISyntaxException;

import org.junit.Before;
import org.junit.Test;

import client.Localhost.Add;

public class LocalhostTest {

    Add add;

    @Before
    public void before() throws URISyntaxException {
        add = Localhost.add(Localhost
                .createClient(), new URI(
                "http://localhost:8080/"));
    }

    @Test
    public void testJson() {
        assertTrue(3 == add.json().getAsResult(1, 2).getValue());
    }

    @Test
    public void testXml() {
        assertTrue(5 == add.xml().getAsResult(2, 3).getValue());
    }
}
