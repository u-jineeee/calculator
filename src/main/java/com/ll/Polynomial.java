package com.ll;

public class Polynomial {
    String formula;
    Polynomial(String _formula){
        this.formula =  _formula;
    }
    public int calc(){
       int answer = 0;
        String[] formulaArr = formula.split(" ");
        if(formulaArr[1].equals("+"))
            answer = Integer.parseInt(formulaArr[0]) + Integer.parseInt(formulaArr[2]);
        else if(formulaArr[1].equals("-"))
            answer = Integer.parseInt(formulaArr[0]) - Integer.parseInt(formulaArr[2]);
        return answer;
    }
}

