class Solution {
    public List<String> fizzBuzz(int n) {
        List<String>jr = new ArrayList<>();
        for(int i=1 ; i<=n ; i++){
            if(i%3==0 && i%5==0)jr.add("FizzBuzz");
            else if(i%3==0)jr.add("Fizz");
            else if(i%5==0)jr.add("Buzz");
            else jr.add(String.valueOf(i));

            
        }
        return jr;
    }
}
