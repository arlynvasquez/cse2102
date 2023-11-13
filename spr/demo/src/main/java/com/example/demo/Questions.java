import java.util.List;

public class Question{
    private String question;
    private String[] choices;
    private String correct;

   public Question(String question, String[] choices, String correct){
    this.question = question;
    this.choices = choices;
    this.correct = correct;
   }

   public String getQuestion(){
    return question;
   }

   public void setQ(String question){
    this.question = question;
   }

   public List<String> getChoices(){
    return choices;
   }

   public void setC(list<String> choices){
    this.choices = choices;
   }

   public String getCorrectAns(){
    return correct;
   }

   public void setCorrectAns(String correct){
    this.correct = correct;
    
   }
}