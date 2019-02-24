package com;

public class Repeated_String_Match {
	public static void main(String[] args) {
		String a = "abcabcabcabc";
		String b = "abac";
		Repeated_String_Match r = new Repeated_String_Match();
		System.out.println(r.repeatedStringMatch(a, b));

	}

	public int repeatedStringMatch(String a, String b) {
		String as = a;
		for (int rep = 1; rep <= b.length() / a.length() + 2; rep++, as += a)
			if (as.indexOf(b) != -1)
				return rep;
		return -1;
	}

//	public int repeatedStringMatch(String A, String B) {
//
//		if (A.length() > B.length()) {
//			if (A.contains(B))
//				return 1;
//			else
//				return 0;
//		}
//		boolean flag = true;
//		int i = 0;
//		StringBuffer sf = new StringBuffer(A);
//		while (flag) {
//			if (sf.toString().contains(B)) {
//				flag = false;
//			}
//			sf = sf.append(A);
//			i++;
//
//		}
//
//		return i;
//
//	}

}
