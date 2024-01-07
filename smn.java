}
public String encode(String input) { 
	StringBuilder output = new StringBuilder(); 
	byte count = (byte) 0; 
	byte count2 = (byte) 0; 
	byte count3 = (byte) 0; 
	String[] strichpunkt = new String[]{"vD", "Ej", "4h", "bI", "ec", "Ka", "rE", "Od", "lF", "pG", "O9", "ui", "sD", "zN", "iU", "gH", "tZ", "Qr", "gf", "nM", "gG", "tH", "qW", "zT", "Kj"}; 
	String[] n0 = new String[]{"hU", "oi", "Ed", "wV", "HD", "jF", "uZ", "rZ", "h0", "qF", "As", "Rt", "zU", "iK", "Vc", "Mn", "hj", "dD", "bV", "aR", "Bv", "rT", "zi", "Qn", "aE"}; 
	String[] n1 = new String[]{"o0", "h4", "sd", "GD", "Ft", "Kd", "oO", "zZ", "fG", "vQ"}; 
	String[] n2 = new String[]{"wJ", "bt", "FB", "7f", "j2", "Pd", "Oo", "oR", "sA", "NK"}; 
	String[] n3 = new String[]{"kl", "DS", "jA", "o4", "Th", "Uo", "Lk", "Zt", "Lb", "Xz"}; 
	String[] n4 = new String[]{"DH", "er", "3d", "tG", "0k", "dR", "Pn", "iP", "wS", "WB"}; 
	String[] n5 = new String[]{"aB", "uo", "i5", "pO", "Zi", "oC", "Tz", "Nm", "Sf", "Np"}; 
	String[] n6 = new String[]{"mB", "oP", "mn", "DF", "7H", "gh", "wQ", "0b", "cR", "wn"}; 
	String[] n7 = new String[]{"kS", "Ui", "RC", "bE", "nm", "eR", "qB", "wt", "mE", "cO"}; 
	String[] n8 = new String[]{"yg", "jK", "l6", "rV", "IK", "JK", "bN", "vB", "Io", "Qx"}; 
	String[] n9 = new String[]{"xi", "vW", "fH", "ZG", "8u", "Xt", "Nb", "Ua", "aG", "jB"}; 
	String[] punkt = new String[]{"gO", "hT", "jP", "lO", "pR", "hA", "hg", "aa", "mm", "Ln"}; 
	for (int i = input.length() - 1; i >= 0; i--) { 
		char c = input.charAt(i); 
		if (c == ';') { 
			output.append(strichpunkt[count]); 
			count = (byte) (count + 1); 
			if (count >= (byte) 25) { 
				count = (byte) 0; 
			} 
		} else if (c == '0') { 
			output.append(n0[count3]); 
			count3 = (byte) (count3 + 1); 
			if (count3 >= (byte) 25) { 
				count3 = (byte) 0; 
			} 
		} else { 
			if (c == '1') { 
				output.append(n1[count2]); 
			} else if (c == '2') { 
				output.append(n2[count2]); 
			} else if (c == '3') { 
				output.append(n3[count2]); 
			} else if (c == '4') { 
				output.append(n4[count2]); 
			} else if (c == '5') { 
				output.append(n5[count2]); 
			} else if (c == '6') { 
				output.append(n6[count2]); 
			} else if (c == '7') { 
				output.append(n7[count2]); 
			} else if (c == '8') { 
				output.append(n8[count2]); 
			} else if (c == '9') { 
				output.append(n9[count2]); 
			} else if (c == ' ') { 
				output.append(punkt[count2]); 
			} 
			count2 = (byte) (count2 + 1); 
			if (count2 >= (byte) 10) { 
				count2 = (byte) 0; 
			} 
		} 
	} 
	return output.toString(); 
}

public String decode(String input) { 
	StringBuilder output = new StringBuilder(); 
	String[] strichpunkt = new String[]{"vD", "Ej", "4h", "bI", "ec", "Ka", "rE", "Od", "lF", "pG", "O9", "ui", "sD", "zN", "iU", "gH", "tZ", "Qr", "gf", "nM", "gG", "tH", "qW", "zT", "Kj"}; 
	String[] n0 = new String[]{"hU", "oi", "Ed", "wV", "HD", "jF", "uZ", "rZ", "h0", "qF", "As", "Rt", "zU", "iK", "Vc", "Mn", "hj", "dD", "bV", "aR", "Bv", "rT", "zi", "Qn", "aE"}; 
	String[] n1 = new String[]{"o0", "h4", "sd", "GD", "Ft", "Kd", "oO", "zZ", "fG", "vQ"}; 
	String[] n2 = new String[]{"wJ", "bt", "FB", "7f", "j2", "Pd", "Oo", "oR", "sA", "NK"}; 
	String[] n3 = new String[]{"kl", "DS", "jA", "o4", "Th", "Uo", "Lk", "Zt", "Lb", "Xz"}; 
	String[] n4 = new String[]{"DH", "er", "3d", "tG", "0k", "dR", "Pn", "iP", "wS", "WB"}; 
	String[] n5 = new String[]{"aB", "uo", "i5", "pO", "Zi", "oC", "Tz", "Nm", "Sf", "Np"}; 
	String[] n6 = new String[]{"mB", "oP", "mn", "DF", "7H", "gh", "wQ", "0b", "cR", "wn"}; 
	String[] n7 = new String[]{"kS", "Ui", "RC", "bE", "nm", "eR", "qB", "wt", "mE", "cO"}; 
	String[] n8 = new String[]{"yg", "jK", "l6", "rV", "IK", "JK", "bN", "vB", "Io", "Qx"}; 
	String[] n9 = new String[]{"xi", "vW", "fH", "ZG", "8u", "Xt", "Nb", "Ua", "aG", "jB"}; 
	String[] punkt = new String[]{"gO", "hT", "jP", "lO", "pR", "hA", "hg", "aa", "mm", "Ln"}; 
	for (int i = input.length() - 1; i > 0; i -= 2) { 
		int j; 
		String c1 = input.charAt(i - 1) + ""; 
		String c = c1 + (input.charAt(i) + ""); 
		for (j = 0; j < 10; j++) { 
			if (c.equals(n1[j])) { 
				output.append("1"); 
			} else if (c.equals(n2[j])) { 
				output.append("2"); 
			} else if (c.equals(n3[j])) { 
				output.append("3"); 
			} else if (c.equals(n4[j])) { 
				output.append("4"); 
			} else if (c.equals(n5[j])) { 
				output.append("5"); 
			} else if (c.equals(n6[j])) { 
				output.append("6"); 
			} else if (c.equals(n7[j])) { 
				output.append("7"); 
			} else if (c.equals(n8[j])) { 
				output.append("8"); 
			} else if (c.equals(n9[j])) { 
				output.append("9"); 
			} else if (c.equals(punkt[j])) { 
				output.append(" "); 
			} 
		} 
		for (j = 0; j < 25; j++) { 
			if (c.equals(strichpunkt[j])) { 
				output.append(" "); 
			} else if (c.equals(n0[j])) { 
				output.append("0"); 
			} 
		} 
	} 
	return output.toString(); 
}
public String TextToBinary(String text) {
    StringBuilder output = new StringBuilder(); 
	try {
        byte[] bytes = text.getBytes("utf-8");
		StringBuilder binary = new StringBuilder();
		for (byte b : bytes) {
			int val = b;
			for (int i = 0; i < 8; i++) {
				binary.append((val & 128) == 0 ? 0 : 1);
				val <<= 1;
			}
			binary.append(' ');
		}
		output.append(binary.toString());
	} catch (Exception e) {
	}
	return output.toString();
}
public String BinaryToText(String text) {
	String hasil = "";
	char nextChar;
	for(int i = 0; i <= text.length()-8; i += 9) {
		nextChar = (char)Integer.parseInt(text.substring(i, i+8), 2);
		hasil += nextChar;
	}
	return String.valueOf(hasil);
}
public String encodeData(String text) {
    String _db = TextToBinary(text);
    return encode(_db);
}
public String decodeData(String text) {
    String _db = decode(text);
    return BinaryToText(_db);
}
public StringBuilder output;
public StringBuilder binary;
{
