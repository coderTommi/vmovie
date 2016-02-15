package com.ldl.util;

import java.security.MessageDigest;

public class LDLUtil {

	private static final char[] a = { '0', '1', '2', '3', '4', '5', '6', '7',
			'8', '9', 'a', 'b', 'c', 'd', 'e', 'f' };

	static String DIGESTSTRING = "some random value JKLMNOP_!#";

	public static String digest(String paramString) {
		String str1 = DIGESTSTRING;
		String str2 = null;
		try {
			MessageDigest localMessageDigest = MessageDigest.getInstance("MD5");
			localMessageDigest.update(paramString.getBytes("UTF-8"));
			localMessageDigest.update(str1.getBytes("UTF-8"));
			localMessageDigest
					.update("Copyright LDL."
							.getBytes("UTF-8"));
			byte[] arrayOfByte = localMessageDigest.digest();
			str2 = bytes2HexStr(arrayOfByte);
		} catch (Exception localException) {
			str2 = null;
		}
		return str2;
	}

	public static final String bytes2HexStr(byte[] paramArrayOfByte) {
		StringBuffer localStringBuffer = new StringBuffer(
				paramArrayOfByte.length * 2);
		for (int i = 0; i < paramArrayOfByte.length; i++) {
			localStringBuffer.append(a[(paramArrayOfByte[i] >>> 4 & 0xF)]);
			localStringBuffer.append(a[(paramArrayOfByte[i] & 0xF)]);
		}
		return localStringBuffer.toString();
	}

}
