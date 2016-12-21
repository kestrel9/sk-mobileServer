package com.tacademy.math.test;

import com.tacademy.math.util.Calc;
import com.tacademy.math.vo.Data;

public class CalcTest {

	public CalcTest() {
		Data d = new Data();
		d.setNum1(6);
		d.setNum2(3);
		d.setOpt("+");
		
		Calc cal = new Calc();
		cal.doCalc(d);
		
		System.out.println(d);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new CalcTest();

	}

}
