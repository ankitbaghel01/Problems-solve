class StrQuestion{
    
//	Longest Substring without Repeating Character
	
	

//	public static int longestSubString(String s) {
//		HashSet<Character> set= new HashSet<>();
//		int i=0;
//		int max=0;
//		int start =0;
//		for(int j=0;j<s.length();j++) {
//			char c= s.charAt(j);
//			while(set.contains(c)) {
//				set.remove(c);
//				i++;
//			}
//			set.add(c);
//			  max = Math.max(max, j - i + 1);
//			
//		}
//		return max;
//	}
//	   

	
	
	
	// Find Anagram 
	
	
//	public static boolean findAnagram(String s1, String s2) {
//		
//		char[] c1= s1.toCharArray();
//		char[] c2=s2.toCharArray();
//		
//		Arrays.sort(c1);
//		Arrays.sort(c2);
//		if(Arrays.equals(c1, c2))
//		{
//			return true;
//		}
//		return false;
//	}
	
	
//	
//	public static boolean isPalindrom(String s) {
//		
//		 s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
//	        int left = 0;
//	        int right = s.length() - 1;
//
//	        while (left < right) {
//	            if (s.charAt(left) != s.charAt(right)) {
//	                return false;
//	            }
//	            left++;
//	            right--;
//	        }
//
//	        return true;
//	}
	 

	
	
//	find Longest Palindrom
	

//		public static boolean isPalindrom(String s){
//				    int left =0;
//				    int right = s.length()-1;
//				    while(left<right){
//				        if(s.charAt(left) != s.charAt(right)){
//				            return false;
//				        }
//				        left++;
//			            right--;
//				    }
//				    return true;
//				}
//
//		    public static String longestPalindrome(String s) {
//		        if(s.length()<1){
//				            return s;
//				        }
//				        String longest ="";
//				        for(int i=0;i<s.length();i++){
//				            for(int j=i+1;j<=s.length();j++){
//				                String curr=s.substring(i,j);
//				                if(isPalindrom(curr)==true && longest.length()<curr.length()){
//				                    longest = curr;
//
//				                }
//				            }
//				        }
//				if(longest.isEmpty()){
//				    return Character.toString(s.charAt(0));
//				}
//				return longest;
//		    }
//		
//	
	
	
	//  find Valid palindrom string
	
	
	public static boolean validPalindrom(String s) {
		s= s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
		System.out.println(s);
		int left =0;
		int right = s.length()-1;
		
		while(left<right) {
			if(s.charAt(left) != s.charAt(right)) {
				return false;
			}
			left++;
			right--;
		}
		return true;
	}
	
	
	
	

	

    public static void main(String[] args) {
//        Solution solution = new Solution();
        String s = "12321"; // Example input
        System.out.println("Longest Palindrome: " + validPalindrom(s));
    }}	
