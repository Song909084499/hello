package com.jichulianxi.three;
/* 内容：第2节练习
 * 姓名：朱松松
 * 日期：2019-08-27       */
public class first {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*使用变量存储以下MP3信息，并打印输出
		品牌（brand）：爱国者F928
		重量（weight）：12.4
		电池类型（type）：内置锂电池
		价格（price）：499   */ 
		String brand="爱国者F928";
		double weight=12.4;
		String type="内置锂电池";
		double price=499;
		System.out.println("品牌（brand）:"+brand+"\n"+ "重量（weight）：" +weight+"\n"+"电池类型（type）："+type+"\n"+"价格（price）："+price);
		System.out.println("*******************************************");
		//某班的A学员Java成绩是80分，B学员与A学员成绩相同，输出B学员成绩
		int AJavaScore=80;
		int B=AJavaScore;
		System.out.println("某班的A学员Java成绩是80分，B学员与A学员成绩相同，输出B学员成绩");
		System.out.println(B);
		System.out.println("*******************************************");
		/*某学员3门课成绩如右表所示，编程实现：
	     1、Java课和html课的分数之差                      oracle  89     Java90      html 60 
	     2、3门课的平均分*/
		float oracle=89F;
		float java=90F;
		float html=60F;
		float a=java-html;
		float b=(oracle+java+html)/3;
		System.out.println("1、Java课和html课的分数之差 :"+a+"分");
		System.out.println("2、3门课的平均分:"+String.format("%.2f",b)+"分");

		System.out.println("2、3门课的平均分:"+String.format("%.2f",35.7998)+"分");

		
	}
}
