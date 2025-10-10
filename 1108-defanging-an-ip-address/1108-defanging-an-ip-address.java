class Solution {
    public String defangIPaddr(String address) {
      String newAddress=address.replace(".","[.]");
        return newAddress;  
    }
}