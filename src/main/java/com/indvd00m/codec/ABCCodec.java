package com.indvd00m.codec;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

/**
 * @author indvd00m (gotoindvdum[at]gmail[dot]com)
 * @date 2017-Apr-19 6:59:50 PM
 *
 */
public class ABCCodec {

	char escapeSymbol;
	String alphabet;
	char[] abc;
	int base;
	int maxEncodedCharLength;
	Map<Character, Integer> charsPosition;

	public ABCCodec(char escapeSymbol, String alphabet) {
		super();
		this.escapeSymbol = escapeSymbol;
		this.alphabet = alphabet;

		if (alphabet.length() < Character.MIN_RADIX)
			throw new IllegalArgumentException("Alphabet must contain 2 or more symbols");

		Set<Character> chars = new TreeSet<Character>();
		for (int i = 0; i < alphabet.length(); i++) {
			char c = alphabet.charAt(i);
			chars.add(c);
		}

		if (chars.size() < Character.MIN_RADIX)
			throw new IllegalArgumentException("Alphabet must contain 2 or more unique symbols");

		abc = new char[chars.size()];
		charsPosition = new HashMap<Character, Integer>(chars.size());
		int i = 0;
		for (Character c : chars) {
			abc[i] = c;
			charsPosition.put(c, i++);
		}

		base = abc.length;
		if (base > Character.MAX_RADIX)
			base = Character.MAX_RADIX;

		maxEncodedCharLength = Integer.toString(Character.MAX_VALUE, base).length();
	}

	public String encode(String source) {
		StringBuilder sb = new StringBuilder(source.length());

		for (int i = 0; i < source.length(); i++) {
			char c = source.charAt(i);
			if (c != escapeSymbol && charsPosition.containsKey(c)) {
				sb.append(c);
			} else {
				sb.append(escapeSymbol);
				String encodedChar = Integer.toString(c, base);
				int prefixLength = maxEncodedCharLength - encodedChar.length();
				for (int j = 0; j < prefixLength; j++) {
					sb.append(abc[0]);
				}
				for (int j = 0; j < encodedChar.length(); j++) {
					char e = encodedChar.charAt(j);
					int abcIndex = Integer.parseInt(e + "", base);
					char value = abc[abcIndex];
					sb.append(value);
				}
			}
		}

		return sb.toString();
	}

	public String decode(String source) {
		StringBuilder sb = new StringBuilder(source.length());

		for (int i = 0; i < source.length(); i++) {
			char c = source.charAt(i);
			if (c != escapeSymbol && charsPosition.containsKey(c)) {
				sb.append(c);
			} else {
				int decodedValue = 0;
				int encodedCharEndIndex = i + maxEncodedCharLength;
				for (int j = encodedCharEndIndex; j > i; j--) {
					char e = source.charAt(j);
					int index = charsPosition.get(e);
					decodedValue += index * pow(base, encodedCharEndIndex - j);
				}
				char decodedChar = (char) decodedValue;
				sb.append(decodedChar);
				i += maxEncodedCharLength;
			}
		}

		return sb.toString();
	}

	protected int pow(int a, int b) {
		return new BigInteger(a + "").pow(b).intValue();
	}

	public char getEscapeSymbol() {
		return escapeSymbol;
	}

	public String getAlphabet() {
		return alphabet;
	}

	public boolean isMatchesToAlphabet(String s) {
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (c == escapeSymbol)
				continue;
			if (charsPosition.containsKey(c))
				continue;
			return false;
		}
		return true;
	}

}
