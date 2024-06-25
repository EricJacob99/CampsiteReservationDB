package com.techelevator.dao;

import com.techelevator.model.Campground;
import com.techelevator.model.Park;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class JdbcParkDaoTests extends BaseDaoTests {

    private ParkDao dao;

    @Before
    public void setup() {
        dao = new JdbcParkDao(dataSource);
    }

    @Test
    public void getParks_Should_Return_All_Parks() {
        List<Park> parks = dao.getParks();

        assertNotNull("Returned campgrounds should not be null", parks);
        assertEquals("Incorrect campgrounds returned for parkID 1", 2, parks.size());

    }

}
