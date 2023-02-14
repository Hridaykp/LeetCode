class Solution {
    public String addBinary(String a, String b) {
        String res = "";
		int l1 = a.length(), l2 = b.length();
		int carry = 0;
		for (int i = 0; i < l1 || i < l2 || carry != 0; i++) {
			int x = 0;
			if (i < l1 && a.charAt(l1 - 1 - i) == '1')
				x = 1;
            int y = 0;
			if (i < l2 && b.charAt(l2 - 1 - i) == '1')
				y = 1;
			res = (x + y + carry) % 2 + res;
			carry = (x + y + carry) / 2;

		}

		return res;
    }
}