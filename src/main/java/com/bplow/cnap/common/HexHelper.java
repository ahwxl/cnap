package com.bplow.cnap.common;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public final class HexHelper {

	private static final char UPPER_HEXS[] = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D',
			'E', 'F' };

	private static final char LOWER_HEXS[] = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd',
			'e', 'f' };

	public static final String EOL = System.getProperty("line.separator");

	private HexHelper() {
		throw new UnsupportedOperationException();
	}

	public static String getUpperHex(byte[] bytes) {
		int len = bytes.length;
		char str[] = new char[len * 2];
		for (int i = 0, k = 0; i < len; i++) {
			byte b = bytes[i];
			str[k++] = UPPER_HEXS[b >>> 4 & 0xf];
			str[k++] = UPPER_HEXS[b & 0xf];
		}
		return new String(str);
	}

	public static String getUpperHex(byte b) {
		char[] chars = new char[2];
		chars[0] = UPPER_HEXS[b >>> 4 & 0xf];
		chars[1] = UPPER_HEXS[b & 0xf];
		return new String(chars);
	}

	public static String getLowerHex(byte[] bytes) {
		int len = bytes.length;
		char str[] = new char[len * 2];
		for (int i = 0, k = 0; i < len; i++) {
			byte b = bytes[i];
			str[k++] = LOWER_HEXS[b >>> 4 & 0xf];
			str[k++] = LOWER_HEXS[b & 0xf];
		}
		return new String(str);
	}

	public static String getLowerHex(byte b) {
		char[] chars = new char[2];
		chars[0] = LOWER_HEXS[b >>> 4 & 0xf];
		chars[1] = LOWER_HEXS[b & 0xf];
		return new String(chars);
	}

	public static byte[] getBytes(String hex) {

		int length = hex.length();
		char[] data = hex.toCharArray();

		byte[] out = new byte[length >> 1];
		for (int j = 0, i = 0; j < length; i++) {
			int high = Character.digit(data[(j++)], 16) << 4;
			high |= Character.digit(data[(j++)], 16);
			out[i] = (byte) (high & 0xFF);
		}

		return out;
	}

	public static void dump(InputStream in, OutputStream out) throws IOException {

		byte[] buffer = new byte[1024];
		for (int offset = 0, len = -1; (len = in.read(buffer)) != -1; offset += len) {
			out.write(dump(buffer, offset).getBytes());
		}

	}

	public static String dump(byte[] bytes) {
		return dump(bytes, 0);
	}

	public static String dump(byte[] bytes, int offset) {

		StringBuffer dump = new StringBuffer();

		for (int j = 0, count = bytes.length; j < count;) {
			StringBuffer buffer = new StringBuffer(74);

			int chars = count - j;
			if (chars > 16) {
				chars = 16;
			}

			buffer.append(getUpperHex(getByteArray(offset + j))).append("   ");
			for (int k = 0; k < 16; k++) {
				if (k < chars) {
					buffer.append(getUpperHex(bytes[k + j]));
				} else {
					buffer.append("  ");
				}
				buffer.append(' ');
			}
			buffer.append("  ");
			for (int k = 0; k < chars; k++) {
				if ((bytes[k + j] >= ' ') && (bytes[k + j] < 127)) {
					buffer.append((char) bytes[k + j]);
				} else {
					buffer.append('.');
				}
			}
			dump.append(buffer);
			dump.append(EOL);
			buffer.setLength(0);
			j += chars;
		}

		return dump.toString();
	}

	public static byte[] getByteArray(int value) {
		byte[] bytes = new byte[4];
		bytes[0] = (byte) ((value >> 24) & 0xff);
		bytes[1] = (byte) ((value >> 16) & 0xff);
		bytes[2] = (byte) ((value >> 8) & 0xff);
		bytes[3] = (byte) ((value) & 0xff);
		return bytes;
	}
}
