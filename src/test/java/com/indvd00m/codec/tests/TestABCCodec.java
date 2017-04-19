package com.indvd00m.codec.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import com.indvd00m.codec.ABCCodec;

/**
 * @author indvd00m (gotoindvdum[at]gmail[dot]com)
 * @date 2017-Apr-19 6:59:29 PM
 *
 */
public class TestABCCodec {

	@Test
	public void test01() {
		ABCCodec codec = new ABCCodec('\\', "0123456789");
		System.out.println(String.format("Escape symbol: \"%s\"", codec.getEscapeSymbol()));
		System.out.println(String.format("Alphabet:      \"%s\"", codec.getAlphabet()));
		String s = "This is test string";
		System.out.println(String.format("Source line:   \"%s\"", s));
		String encoded = codec.encode(s);
		System.out.println(String.format("Encoded:       \"%s\"", encoded));
		String decoded = codec.decode(encoded);
		System.out.println(String.format("Decoded:       \"%s\"", decoded));
		System.out.println();
		assertEquals(s, decoded);
	}

	@Test
	public void test02() {
		ABCCodec codec = new ABCCodec('\\', "012345678\\");
		System.out.println(String.format("Escape symbol: \"%s\"", codec.getEscapeSymbol()));
		System.out.println(String.format("Alphabet:      \"%s\"", codec.getAlphabet()));
		String s = "This is test string";
		System.out.println(String.format("Source line:   \"%s\"", s));
		String encoded = codec.encode(s);
		System.out.println(String.format("Encoded:       \"%s\"", encoded));
		String decoded = codec.decode(encoded);
		System.out.println(String.format("Decoded:       \"%s\"", decoded));
		System.out.println();
		assertEquals(s, decoded);
	}

	@Test
	public void test03() {
		ABCCodec codec = new ABCCodec('\\', "\\123456789");
		System.out.println(String.format("Escape symbol: \"%s\"", codec.getEscapeSymbol()));
		System.out.println(String.format("Alphabet:      \"%s\"", codec.getAlphabet()));
		String s = "This is test string";
		System.out.println(String.format("Source line:   \"%s\"", s));
		String encoded = codec.encode(s);
		System.out.println(String.format("Encoded:       \"%s\"", encoded));
		String decoded = codec.decode(encoded);
		System.out.println(String.format("Decoded:       \"%s\"", decoded));
		System.out.println();
		assertEquals(s, decoded);
	}

	@Test
	public void test04() {
		ABCCodec codec = new ABCCodec('\\', "01234567891");
		System.out.println(String.format("Escape symbol: \"%s\"", codec.getEscapeSymbol()));
		System.out.println(String.format("Alphabet:      \"%s\"", codec.getAlphabet()));
		String s = "This is test string";
		System.out.println(String.format("Source line:   \"%s\"", s));
		String encoded = codec.encode(s);
		System.out.println(String.format("Encoded:       \"%s\"", encoded));
		String decoded = codec.decode(encoded);
		System.out.println(String.format("Decoded:       \"%s\"", decoded));
		System.out.println();
		assertEquals(s, decoded);
	}

	@Test
	public void test05() {
		ABCCodec codec = new ABCCodec('\\', "01");
		System.out.println(String.format("Escape symbol: \"%s\"", codec.getEscapeSymbol()));
		System.out.println(String.format("Alphabet:      \"%s\"", codec.getAlphabet()));
		String s = "This is test string";
		System.out.println(String.format("Source line:   \"%s\"", s));
		String encoded = codec.encode(s);
		System.out.println(String.format("Encoded:       \"%s\"", encoded));
		String decoded = codec.decode(encoded);
		System.out.println(String.format("Decoded:       \"%s\"", decoded));
		System.out.println();
		assertEquals(s, decoded);
	}

	@Test
	public void test06() {
		ABCCodec codec = new ABCCodec('\\', "0123456789z");
		System.out.println(String.format("Escape symbol: \"%s\"", codec.getEscapeSymbol()));
		System.out.println(String.format("Alphabet:      \"%s\"", codec.getAlphabet()));
		String s = "This is test string";
		System.out.println(String.format("Source line:   \"%s\"", s));
		String encoded = codec.encode(s);
		System.out.println(String.format("Encoded:       \"%s\"", encoded));
		String decoded = codec.decode(encoded);
		System.out.println(String.format("Decoded:       \"%s\"", decoded));
		System.out.println();
		assertEquals(s, decoded);
	}

	@Test
	public void test07() {
		ABCCodec codec = new ABCCodec('\\', "0123456789\\");
		System.out.println(String.format("Escape symbol: \"%s\"", codec.getEscapeSymbol()));
		System.out.println(String.format("Alphabet:      \"%s\"", codec.getAlphabet()));
		String s = "This is test string";
		System.out.println(String.format("Source line:   \"%s\"", s));
		String encoded = codec.encode(s);
		System.out.println(String.format("Encoded:       \"%s\"", encoded));
		String decoded = codec.decode(encoded);
		System.out.println(String.format("Decoded:       \"%s\"", decoded));
		System.out.println();
		assertEquals(s, decoded);
	}

	@Test
	public void test08() {
		ABCCodec codec = new ABCCodec('\\', "0123456789ABCDEF");
		System.out.println(String.format("Escape symbol: \"%s\"", codec.getEscapeSymbol()));
		System.out.println(String.format("Alphabet:      \"%s\"", codec.getAlphabet()));
		String s = "This is test string";
		System.out.println(String.format("Source line:   \"%s\"", s));
		String encoded = codec.encode(s);
		System.out.println(String.format("Encoded:       \"%s\"", encoded));
		String decoded = codec.decode(encoded);
		System.out.println(String.format("Decoded:       \"%s\"", decoded));
		System.out.println();
		assertEquals(s, decoded);
	}

	@Test
	public void test09() {
		ABCCodec codec = new ABCCodec('\\', "This is test string");
		System.out.println(String.format("Escape symbol: \"%s\"", codec.getEscapeSymbol()));
		System.out.println(String.format("Alphabet:      \"%s\"", codec.getAlphabet()));
		String s = "This is test string";
		System.out.println(String.format("Source line:   \"%s\"", s));
		String encoded = codec.encode(s);
		System.out.println(String.format("Encoded:       \"%s\"", encoded));
		String decoded = codec.decode(encoded);
		System.out.println(String.format("Decoded:       \"%s\"", decoded));
		System.out.println();
		assertEquals(s, decoded);
	}

	@Test
	public void test10() {
		ABCCodec codec = new ABCCodec('\\', "ab");
		System.out.println(String.format("Escape symbol: \"%s\"", codec.getEscapeSymbol()));
		System.out.println(String.format("Alphabet:      \"%s\"", codec.getAlphabet()));
		String s = "c";
		System.out.println(String.format("Source line:   \"%s\"", s));
		String encoded = codec.encode(s);
		System.out.println(String.format("Encoded:       \"%s\"", encoded));
		String decoded = codec.decode(encoded);
		System.out.println(String.format("Decoded:       \"%s\"", decoded));
		System.out.println();
		assertEquals(s, decoded);
	}

	@Test
	public void test11() {
		ABCCodec codec = new ABCCodec('a', "ab");
		System.out.println(String.format("Escape symbol: \"%s\"", codec.getEscapeSymbol()));
		System.out.println(String.format("Alphabet:      \"%s\"", codec.getAlphabet()));
		String s = "c";
		System.out.println(String.format("Source line:   \"%s\"", s));
		String encoded = codec.encode(s);
		System.out.println(String.format("Encoded:       \"%s\"", encoded));
		String decoded = codec.decode(encoded);
		System.out.println(String.format("Decoded:       \"%s\"", decoded));
		System.out.println();
		assertEquals(s, decoded);
	}

	@Test
	public void test12() {
		ABCCodec codec = new ABCCodec('a', "ab");
		System.out.println(String.format("Escape symbol: \"%s\"", codec.getEscapeSymbol()));
		System.out.println(String.format("Alphabet:      \"%s\"", codec.getAlphabet()));
		String s = "a";
		System.out.println(String.format("Source line:   \"%s\"", s));
		String encoded = codec.encode(s);
		System.out.println(String.format("Encoded:       \"%s\"", encoded));
		String decoded = codec.decode(encoded);
		System.out.println(String.format("Decoded:       \"%s\"", decoded));
		System.out.println();
		assertEquals(s, decoded);
	}

	@Test
	public void test13() {
		ABCCodec codec = new ABCCodec('a', "ab");
		System.out.println(String.format("Escape symbol: \"%s\"", codec.getEscapeSymbol()));
		System.out.println(String.format("Alphabet:      \"%s\"", codec.getAlphabet()));
		String s = "Test string with numbers 1234567890";
		System.out.println(String.format("Source line:   \"%s\"", s));
		String encoded = codec.encode(s);
		System.out.println(String.format("Encoded:       \"%s\"", encoded));
		String decoded = codec.decode(encoded);
		System.out.println(String.format("Decoded:       \"%s\"", decoded));
		System.out.println();
		assertEquals(s, decoded);
	}

	@Test
	public void test14() {
		ABCCodec codec = new ABCCodec('\\', "01");
		System.out.println(String.format("Escape symbol: \"%s\"", codec.getEscapeSymbol()));
		System.out.println(String.format("Alphabet:      \"%s\"", codec.getAlphabet()));
		String s = "Test string with numbers 1234567890";
		System.out.println(String.format("Source line:   \"%s\"", s));
		String encoded = codec.encode(s);
		System.out.println(String.format("Encoded:       \"%s\"", encoded));
		String decoded = codec.decode(encoded);
		System.out.println(String.format("Decoded:       \"%s\"", decoded));
		System.out.println();
		assertEquals(s, decoded);
	}

	@Test
	public void test15() {
		ABCCodec codec = new ABCCodec('\\', "Test string with numbers 234567890");
		System.out.println(String.format("Escape symbol: \"%s\"", codec.getEscapeSymbol()));
		System.out.println(String.format("Alphabet:      \"%s\"", codec.getAlphabet()));
		String s = "Test string with numbers 1234567890";
		System.out.println(String.format("Source line:   \"%s\"", s));
		String encoded = codec.encode(s);
		System.out.println(String.format("Encoded:       \"%s\"", encoded));
		String decoded = codec.decode(encoded);
		System.out.println(String.format("Decoded:       \"%s\"", decoded));
		System.out.println();
		assertEquals(s, decoded);
	}

	@Test
	public void test16() {
		ABCCodec codec = new ABCCodec('_', "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz1234567890");
		System.out.println(String.format("Escape symbol: \"%s\"", codec.getEscapeSymbol()));
		System.out.println(String.format("Alphabet:      \"%s\"", codec.getAlphabet()));
		String s = "variable1${varName}";
		System.out.println(String.format("Source line:   \"%s\"", s));
		String encoded = codec.encode(s);
		System.out.println(String.format("Encoded:       \"%s\"", encoded));
		String decoded = codec.decode(encoded);
		System.out.println(String.format("Decoded:       \"%s\"", decoded));
		System.out.println();
		assertEquals(s, decoded);
	}

	@Test
	public void test17() {
		ABCCodec codec = new ABCCodec('_', "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz1234567890");
		System.out.println(String.format("Escape symbol: \"%s\"", codec.getEscapeSymbol()));
		System.out.println(String.format("Alphabet:      \"%s\"", codec.getAlphabet()));
		String s = "переменная1${имяПеременной}";
		System.out.println(String.format("Source line:   \"%s\"", s));
		String encoded = codec.encode(s);
		System.out.println(String.format("Encoded:       \"%s\"", encoded));
		String decoded = codec.decode(encoded);
		System.out.println(String.format("Decoded:       \"%s\"", decoded));
		System.out.println();
		assertEquals(s, decoded);
	}

	@Test
	public void test18() {
		ABCCodec codec = new ABCCodec('_', "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz1234567890");
		System.out.println(String.format("Escape symbol: \"%s\"", codec.getEscapeSymbol()));
		System.out.println(String.format("Alphabet:      \"%s\"", codec.getAlphabet()));
		String s = "var1${varName}";
		System.out.println(String.format("Source line:   \"%s\"", s));
		String encoded = codec.encode(s);
		System.out.println(String.format("Encoded:       \"%s\"", encoded));
		String decoded = codec.decode(encoded);
		System.out.println(String.format("Decoded:       \"%s\"", decoded));
		System.out.println();
		assertEquals(s, decoded);
	}

	@Test
	public void test19() {
		ABCCodec codec = new ABCCodec('_', "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz1234567890");
		System.out.println(String.format("Escape symbol: \"%s\"", codec.getEscapeSymbol()));
		System.out.println(String.format("Alphabet:      \"%s\"", codec.getAlphabet()));
		String s = "var1${varName.part2}";
		System.out.println(String.format("Source line:   \"%s\"", s));
		String encoded = codec.encode(s);
		System.out.println(String.format("Encoded:       \"%s\"", encoded));
		String decoded = codec.decode(encoded);
		System.out.println(String.format("Decoded:       \"%s\"", decoded));
		System.out.println();
		assertEquals(s, decoded);
	}

	@Test
	public void test20() {
		ABCCodec codec = new ABCCodec('_', "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz1234567890");
		System.out.println(String.format("Escape symbol: \"%s\"", codec.getEscapeSymbol()));
		System.out.println(String.format("Alphabet:      \"%s\"", codec.getAlphabet()));
		String s = "varName.part2";
		System.out.println(String.format("Source line:   \"%s\"", s));
		String encoded = codec.encode(s);
		System.out.println(String.format("Encoded:       \"%s\"", encoded));
		String decoded = codec.decode(encoded);
		System.out.println(String.format("Decoded:       \"%s\"", decoded));
		System.out.println();
		assertEquals(s, decoded);
	}

}
