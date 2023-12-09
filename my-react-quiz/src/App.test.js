import React from 'react';
import { render, fireEvent, screen } from '@testing-library/react';
import '@testing-library/jest-dom/extend-expect';
import App from './App';

//questions speciically for testing
const mockQuestions = [
  {
    question: "The alphabet starts with which letter?",
    options: ["A","B"],
    correctAnswer: "A",
  },
  {
    question: "What is the square root of 4?",
    options: ["2", "1"],
    correctAnswer: "2",
  },
];

jest.mock('./App', () => ({
  ...jest.requireActual('./App'),
  questions:mockQuestions,
}));


describe('App', () => {
  test('renders header', () => {
    render(<App />);
    expect(screen.getByText('React Quiz')).toBeInTheDocument();
  });

  test('renders question and choices', () => {
    render(<App />);
    expect(screen.getByText("The alphabet starts with which letter?")).toBeInTheDocument();
    expect(screen.getByText("A")).toBeInTheDocument();
    expect(screen.getByText("B")).toBeInTheDocument();
  });

  test('handles user answers correctly', () => {
    render(<App />);
    fireEvent.click(screen.getByText("A"));
    fireEvent.click(screen.getByText("2"));
    expect(screen.getByText("You Scored 2 out of 2")).toBeInTheDocument();
  });

  test('handles incorrect answers', () => {
    render(<App />);
  
    fireEvent.click(screen.getByText('B')); 
    fireEvent.click(screen.getByText('2'));
  
    expect(screen.getByText('You Scored 1 out of 2')).toBeInTheDocument();
  });
  test('renders next question after answering', () => {
    render(<App />);
  
    fireEvent.click(screen.getByText('A'));
  
    expect(screen.getByText('What is the square root of 4?')).toBeInTheDocument();
  });
});
