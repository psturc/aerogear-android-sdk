package org.aerogear.mobile.core.configuration;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricTestRunner;

@RunWith(RobolectricTestRunner.class)
public class ServiceConfigurationTest {

    @Test
    public void testCreateConfig() {
        ServiceConfiguration config = ServiceConfiguration.newConfiguration().setName("conf-name")
                        .setType("conf-type").setUrl("http://test-uri.feedhenry.org")
                        .addProperty("prop1", "value1").addProperty("prop2", "value2").build();

        Assert.assertEquals("conf-name", config.getName());
        Assert.assertEquals("conf-type", config.getType());
        Assert.assertEquals("http://test-uri.feedhenry.org", config.getUrl());
        Assert.assertEquals(2, config.getProperties().size());
        Assert.assertEquals("value1", config.getProperty("prop1"));
        Assert.assertEquals("value2", config.getProperty("prop2"));
    }
}
