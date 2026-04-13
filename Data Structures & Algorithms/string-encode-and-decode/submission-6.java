class Solution {

    public String encode(List<String> strs) {
    if(strs.size() == 0) return "";
    StringBuilder thes = new StringBuilder();
    if(strs.size() == 1 && strs.get(0) == ""){
    System.out.println("am here");
    return "dumiwe";
    } 
    for(int i =0; i < strs.size()-1;i++){
        String temp = strs.get(i);
        String dumiwe = "dumiwe";
        thes.append(temp);
        thes.append(dumiwe);
    }
    thes.append(strs.get(strs.size()-1));

    return thes.toString();
    }

    public List<String> decode(String str) {
    List<String> ans = new ArrayList<>();
    if(str.isEmpty()) return ans;
    if(str.equals("dumiwe")){
        ans.add("");
        return ans;
    } 
    String[] parts = str.split("dumiwe");
    for(String i: parts){
        ans.add(i);
    }
    return ans;
    }
}
