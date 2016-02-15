package test.dao;

import java.security.MessageDigest;

public class PasswordTest {
	private static final char[] a = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f' };
	
	static String jdField_new = "some random value JKLMNOP_!#";
	public static String digest(String paramString){
	    String str1 = jdField_new;
	    String str2 = null;
	    try
	    {
	      MessageDigest localMessageDigest = MessageDigest.getInstance("MD5");
	      localMessageDigest.update(paramString.getBytes("UTF-8"));
	      localMessageDigest.update(str1.getBytes("UTF-8"));
	      localMessageDigest.update("Copyright LDL.".getBytes("UTF-8"));
	      byte[] arrayOfByte = localMessageDigest.digest();
	      str2 = bytes2HexStr(arrayOfByte);
	    }
	    catch (Exception localException)
	    {
	      str2 = null;
	    }
	    return str2;
	}
	
	  public static final String bytes2HexStr(byte[] paramArrayOfByte)
	  {
	    StringBuffer localStringBuffer = new StringBuffer(paramArrayOfByte.length * 2);
	    for (int i = 0; i < paramArrayOfByte.length; i++)
	    {
	      localStringBuffer.append(a[(paramArrayOfByte[i] >>> 4 & 0xF)]);
	      localStringBuffer.append(a[(paramArrayOfByte[i] & 0xF)]);
	    }
	    return localStringBuffer.toString();
	  }
	
	
	
	public static String str2Md5(String inStr) {
		MessageDigest md5 = null;
		
		try {
			md5 = MessageDigest.getInstance("MD5");
		} catch (Exception e) {
			e.printStackTrace();
		}
		char[] charArray = inStr.toCharArray();
		byte[] byteArray = new byte[charArray.length];
		for(int i=0;i<charArray.length;i++){
			byteArray[i] = (byte)charArray[i];
		}
		byte[] md5Byte = md5.digest(byteArray);
		StringBuffer hexValue  = new StringBuffer();
		for(int i=0;i<md5Byte.length;i++){
			int val = ((int)md5Byte[i]) & 0xff;
			if (val <16 ){
				hexValue.append("0");
			}
			hexValue.append(Integer.toHexString(val));
		}
		return hexValue.toString();
	}
	
	public static String convertMD5(String inStr)
	{
		char[] a = inStr.toCharArray();
		for(int i=0 ;i<a.length;i++)
		{
			a[i] = (char)(a[i] ^ 't');
		}
		String s = new String(a);
		return s;
	}
	
	public static void main(String[] args) {
		String aaa = "abcd1234";
		System.out.println(digest(aaa));
		System.out.println(str2Md5(aaa));
		System.out.println(convertMD5(convertMD5(aaa)));
	}
}
