import java.util.Scanner;
class SystemExam{
    private String questions[]={}; //no one can directly access it
    private String correctAns[];
    private String studentAns[];
    private int score;
    private boolean examSubmitted;

    public SystemExam() {
        questions = new String[] {
            "Java is platform independent?",
            "OOP stands for?",
            "Which keyword is used for inheritance?"
        };

        correctAns = new String[] {
            "yes",
            "object oriented programming",
            "extends"
        };

        studentAns = new String[questions.length];

        score = 0;
        examSubmitted = false;
    }
    
    //it display question to the user
    public void startExam(){
        if(examSubmitted==true){
            System.out.println("Exam already submitted");
            return;
        }
        
        System.out.println("Exam started!!!!!!");
        System.out.println("\nAnswer the following question ");
        
        for(int i=0;i<questions.length;i++){
            System.out.println("Q" +(i+1) + ":" + questions[i]);
        }    
    }

    //user submit answer
    public void SubmitAns( int index,String ans){
        if (examSubmitted == true) {
            System.out.println("Cannot answer. Exam already submitted.");
            return;
        }
        if (index < 0 || index >= questions.length) {
            System.out.println("Invalid question number.");
            return;
        }
        studentAns[index]=ans;
        System.out.println("Answer saved for Question " + (index + 1));
    }

    //submit ans
    public void submitAnsw(){
        if (examSubmitted == true) {
            System.out.println("Exam already submitted.");
            return;
        }

        examSubmitted= true;
        evaluateExam();

        System.out.println("Exam successfully submitted!!");


    }
    //evaluation
    private void evaluateExam(){
        for (int i = 0; i < questions.length; i++) {
            if (studentAns[i] != null &&
                studentAns[i].equalsIgnoreCase(correctAns[i])) {
                score++;
            }
        }
    } 
    

    public void getResult() {
        if (examSubmitted == false) {
            System.out.println("Please submit the exam first.");
            return;
        }

        System.out.println("Your Score: " + score + "/" + questions.length);

        if (score >= 2) {
            System.out.println("Result: PASS");
        } else {
            System.out.println("Result: FAIL");
        }
    }
    

}

public class OnlineExamapp {
    public static void main(String []args){
        Scanner sc = new Scanner (System.in);
        SystemExam s = new SystemExam();

        int opt;

        do{
            System.out.println("\n*******MENU******");
            System.out.println("1. Start Exam");
            System.out.println("2.Submit Exam");
            System.out.println("3. View Result");
            System.out.println("4.Exit");

            System.out.print("\nEnter option:  ");
            opt= sc.nextInt();
            sc.nextLine(); // clear buffer

            switch(opt){

                case 1:{
                    s.startExam();

                    for(int i=0;i<3;i++){
                        System.out.println("Enter question no: ");
                    int qNo= sc.nextInt();
                    sc.nextLine();
                    
                    System.out.println("Enter Answer: ");
                    String ans= sc.nextLine();

                    s.SubmitAns( qNo-1,ans); // conver to index

                    }
                    break;
                    
                }
                
                case 2:{
                    s.submitAnsw();
                    break;
                }
                case 3:{
                    s.getResult();
                    break;
                }
                case 4:{
                    System.out.println("Exiting.....");
                    break;
                }
                default:{
                    System.out.println("Ooop's!!! Invalid option");
                    break;
                }
            }


        }while(opt!=4);

        
    }
    
}
