package com.seagle.utils.algorithms.sorting;

import com.seagle.utils.algorithms.sorting.Sorting;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * 
 * @author seagle
 * @since 2018-5-24
 */
public class SortingAlgorithmsMain {
	
    private final static String HEX_LC = "0123456789abcdef";
//	private static Integer[] data = new Integer[] { 2, 10, 8, 4, 3, 10, 15, 7, 4, 9, 8, 11, 41, 22, 50, 10, 6 };
//	private static int[] data = new int[] { 3,4,6,2};

	public static void main(String[] args) {
//		Sorting sort = createSortAlgorithm();
//		sort.sort((new ArrayList<Integer>()).addAll(Arrays.asList(data)));
		
		System.out.print("123456ddddd");
	}

	
	private static Sorting createSortAlgorithm(){
		return new QuickSorting();
	}
	
	public static String encodeSHA(String src) {
		try {
			MessageDigest md = MessageDigest.getInstance("SHA-256");
			md.update(src.getBytes("UTF8"));
			return bytesToLcHexString(md.digest());
		} catch (NoSuchAlgorithmException e) {
			System.out.println("encodeSHA error " + e.getMessage());
			return null;
		} catch (UnsupportedEncodingException e) {
			System.out.println("encodeSHA error " + e.getMessage());
			return null;
		}
	}
	
    private static String bytesToLcHexString(byte[] src) {
        if (src == null)
            return null;
        StringBuffer sb = new StringBuffer(2 * src.length);
        for (int i = 0; i < src.length; i++) {
            sb.append(byteToLcHexString(src[i]));
        }
        return sb.toString();
    }
    
    private static String byteToLcHexString(byte src) {
        return new StringBuffer().append(HEX_LC.charAt((src >> 4) & 0x0f))
                .append(HEX_LC.charAt(src & 0x0f)).toString();
    }
}
