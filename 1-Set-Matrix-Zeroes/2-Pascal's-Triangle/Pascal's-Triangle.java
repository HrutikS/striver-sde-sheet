class Solution {
    
    public List<List<Integer>> generate(int numRows) {
        
        List<List<Integer>> answer = new ArrayList<>();

        for (int i=0; i<numRows; i++){

            List<Integer> answerTemp = new ArrayList<>();

            for (int j=0; j<=i; j++) {

                // For 1st & last Element
                if (j == 0 || j == i) {
                    answerTemp.add(1);
                } else {

                    int leftAbove = answer.get(i-1).get(j-1);
                    int rightAbove = answer.get(i-1).get(j);
                    answerTemp.add(leftAbove + rightAbove);
                }
            }

            answer.add(answerTemp);
        }

        return answer;
    }
}
