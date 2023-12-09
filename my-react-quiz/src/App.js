import'./App.css';
import {useState} from "react";

const questions = [
  {
    question: "What is the capital of New York?",
    options: ["Albany","Buffalo", "Manhattan", "Brooklyn"],
    correctAnswer: "Albany",
  },
  {
    question: "What is the square root of 64?",
    options: ["8", "16","32", "4"],
    correctAnswer: "8",
  },
  {
    question: "What is the capital of Connecticut?",
    options: ["Stamford","Storrs","Hartford"],
    correctAnswer: "Hartford"
  },
  {
    question: "Is 2 an even or odd number?",
    options: ["Even","Odd"],
    correctAnswer: "Even",
  },
  {
    question: "What is 2+2?",
    options: ["4","8", "6", "5"],
    correctAnswer: "4",
  },
  {
    question: "What season is December in?",
    options: ["Spring","Summer", "Winter", "Fall"],
    correctAnswer: "Winter",
  },
  {
    question: "How many months are in a year?",
    options: ["12","13", "11", "10"],
    correctAnswer: "12",
  },
  {
    question: "How many states does the US have?",
    options: ["47","50", "51", "49"],
    correctAnswer: "50",
  },
  {
    question: "Solve the equation for x: 2x+4 = 0.",
    options: ["x = 1","x = 0", "x = 2", "x = 4"],
    correctAnswer: "x = 2",
  },
  {
    question: "If Tommy has 5 apples, have 2 to Emma, and ate 1. How many apples are left?",
    options: ["0 apples","2 apples", "3 apples", "1 apple"],
    correctAnswer: "2 apples",
  },
];

function App(){
  const[score,setScore]=useState(0);
  const [showScore,setShowScore]=useState(false);
  const [showText,setShowText]=useState(false);
  const[currentQuestion,setCurrentQuestion]=useState(0);

  const handleAnswerOptionClick = (selectedAnswer) =>{
    selectedAnswer === questions[currentQuestion].correctAnswer && setScore(score +1);

    const nextQuestion = currentQuestion +1;

    if(nextQuestion < questions.length){
      setCurrentQuestion(nextQuestion);
    }else{
      setShowScore(true);
      score === questions.length -1 && setShowText(true);
    }
  };
  return(
    <>
      <h1>React Quiz</h1>
      <div className="quiz-app">
        {showScore ? (<div className ="score-section">
          You Scored {score} out of {questions.length}
          {showText &&(

            <h4>You Scored An 100!</h4>
          )}
          </div>
          ):
              <>
                <div className="question-section">
                  <div className="question-count">
                    <span>Question {currentQuestion +1}</span> / {questions.length}
                  </div>
                  <div className="question-text">{questions[currentQuestion].question}</div>
                  <div className="answer-section">{questions[currentQuestion].options.map((option)=>(
                  <button 
                  className="answer-button" 
                  key={option} 
                  onClick={()=>handleAnswerOptionClick(option)}>
                    {option}
                  </button>
                  ))}</div>
                </div>
              </>
        }
      </div>
    </>
  );
}
export default App;
