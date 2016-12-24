package com.tacademy.math.util;

import com.tacademy.math.vo.Data;

public class Calc {
	public void doCalc(Data d){
		
		switch(d.getOpt()){
		case "+" :
			d.setResult(d.getNum1() + d.getNum2());
			break;
		case "-" :
			d.setResult(d.getNum1() - d.getNum2());
			break;
		case "*" :
			d.setResult(d.getNum1() * d.getNum2());
			break;
		case "/" :
			d.setResult(d.getNum1() / d.getNum2());
			break;
			
		}
		
	
	}

}
