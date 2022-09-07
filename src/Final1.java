public class Final1 {
    public static final class FinalProblem1{
        public final StringBuffer PROBLEM_NUM = new StringBuffer("q1");
        public final void modifyVariable(String PROBLEM_NUM1){
            PROBLEM_NUM.append(PROBLEM_NUM1);
        }
    }
    public static void main(String[] args){
        FinalProblem1 test = new FinalProblem1();
        System.out.println(test.PROBLEM_NUM);
        test.modifyVariable("q2");
        System.out.println(test.PROBLEM_NUM);
    }
}
