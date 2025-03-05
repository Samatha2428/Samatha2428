public String convertToRoman(int i){
        if(i%1000==0) {
			if(i/1000==1)return "M";
			else if(i/1000==2)return "MM";
			else return "MMM";
		}
		else if(i%100==0) {
			if(i/100<4) {
				String s="";
				int c1=i/100;
				for(int j=1;j<=c1;j++) {
					s=s.concat("C");
				}
				return s;	
			}
			else if(i==400)return "CD";
			else if(i==500)return "D";
			else {
				if(i==900)return "CM";
				else {
					String s1="D";
					int c1=(i/100)-5;
					for(int j=1;j<=c1;j++) {
						s1=s1.concat("C");
						}
					return s1;		
				}
			}
		}
		else if(i%10==0) {
			if(i/10<4) {
				String s="";
				int c1=i/10;
				for(int j=1;j<=c1;j++) {
					s=s.concat("X");
				}
				return s;	
			}
			else if(i==40)return "XL";
			else if(i==50)return "L";
			else {
				if(i==90)return "XC";
				else {
					String s1="L";
					int c1=(i/10)-5;
					for(int j=1;j<=c1;j++) {
						s1=s1.concat("X");
						}
					return s1;		
				}
			}
		}
		else {
			if(i==4)return "IV";
			else if(i==5)return "V";
			else if(i==9)return "IX";
			else {
				if(i<4) {
					String s2="";
					for(int j=1;j<=i;j++) {
						s2=s2.concat("I");
					}
					return s2;
				}
				else {
					String s2="V";
					i=i-5;
					for(int j=1;j<=i;j++) {
						s2=s2.concat("I");
					}
					return s2;
					
				}
			}
		}
    }
    public String intToRoman(int n) {
        String word="";
		while(n!=0) {
			int ans=(int)Math.log10(n);
			int div=(int) Math.pow(10,ans);
			int temp=n/div;
			String roman=convertToRoman(div*temp);
			word=word.concat(roman);
			n=n%div;
			
		}
		return word;
    }
}
