 


public class LargestInteger {

    public Integer findLargestNumberUsingConditional(Integer[] integers){
        int holder = 0;    
        for(int i = 0; i < integers.length; i++ ) {
              if(integers[i] > holder) {
                  holder = integers[i];
                }  
            }
        return holder;
    }

    public Integer findLargestNumberUsingMathMax(Integer[] integers){
         int holder = 0;    
        for(int i = 0; i < integers.length -1; i++ ) {
              holder = Math.max(integers[i],integers[i + 1]);
            }
        return holder;
    }
}
