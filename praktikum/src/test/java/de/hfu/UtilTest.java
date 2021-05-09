package de.hfu;

import static org.junit.Assert.assertTrue;

import org.junit.Test;


public class UtilTest 
{
    @Test
    public void utilTest()
    {
    	assertTrue(Util.istErstesHalbjahr(1));
    	assertTrue(Util.istErstesHalbjahr(12)==false);
    }
}
