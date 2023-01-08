class Solution {
    class Transaction{
        String name ,city;
        int time , amount ;
        
        Transaction(String input){
            String[] split = input.split(",");
            this.name = split[0];
            this.time = Integer.parseInt(split[1]);
            this.amount = Integer.parseInt(split[2]);
            this.city = split[3];

        }
    }
    public List<String> invalidTransactions(String[] transactions) {
        List<String> ans = new ArrayList<>();
        HashMap<String,List<Transaction>> map = new HashMap<>();
        
        for(String s : transactions){
            Transaction tran = new Transaction(s);
            map.putIfAbsent(tran.name,new ArrayList());
            map.get(tran.name).add(tran);
        }
        for(String s : transactions){
            Transaction tran = new Transaction(s);
            if(!is_valid(tran,map.get(tran.name))){
                ans.add(s);
            }
        }
        return ans;
    }
    
    boolean is_valid(Transaction t ,List<Transaction> list){
        if(t.amount >1000)return false;
        for(Transaction l : list)
            if(!t.city.equals((l.city)) && Math.abs(t.time-l.time)<=60)return false ;
        return true ;
    }
}