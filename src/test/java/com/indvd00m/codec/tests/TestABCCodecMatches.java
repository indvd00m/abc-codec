package com.indvd00m.codec.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import com.indvd00m.codec.ABCCodec;

/**
 * @author indvd00m (gotoindvdum[at]gmail[dot]com)
 * @date 2017-Apr-19 8:39:45 PM
 *
 */
public class TestABCCodecMatches {

	@Test
	public void test01() {
		ABCCodec codec = new ABCCodec('\\', "0123456789");
		assertTrue(codec.isMatchesToAlphabet("23"));
		assertFalse(codec.isMatchesToAlphabet("23a"));
	}

}
