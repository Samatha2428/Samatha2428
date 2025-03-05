public String longestCommonPrefix(String[] str) {
        Arrays.sort(str);
		String str1=str[0];
		String str2=str[str.length-1];
		int index=0;
		while(index<str1.length()) {
			if(str1.charAt(index)==str2.charAt(index)) {
				index++;
			}else {
				break;
			}
		}
		return index==0?"":str1.substring(0,index);
    }
}
