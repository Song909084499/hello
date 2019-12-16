package com.jichulianxi.three;
/* 内容：第2节练习
 * 姓名：朱松松
 * 日期：2019-08-27       */
public class two {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//某班的A学员Java成绩是80分，B学员与A学员成绩相同，输出B学员成绩
		/*int AJavaScore=80;
		int B=AJavaScore;
		System.out.println(B);
		*/
		
		double oracle=89;
		double java=90;
		double html=60;
		double a=java-html;
		double b=(oracle+java+html)/3;
		System.out.println("1、Java课和html课的分数之差 :"+a+"分");
		System.out.println("2、3门课的平均分:"+(String.format("%.2f",b))+"分");
	}

}
