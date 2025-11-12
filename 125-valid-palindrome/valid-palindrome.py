import re
class Solution:
    def isPalindrome(self, s: str) -> bool:
       s=s.lower()
       new= re.sub(r'[^a-zA-Z0-9\s]','', s) 
       new=new.replace(" ","")
       new2=new[::-1]
       if new2 != new:
            return False
       else:
            return True