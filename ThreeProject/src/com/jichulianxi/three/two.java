package com.jichulianxi.three;
/* ���ݣ���2����ϰ
 * ������������
 * ���ڣ�2019-08-27       */
public class two {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ĳ���AѧԱJava�ɼ���80�֣�BѧԱ��AѧԱ�ɼ���ͬ�����BѧԱ�ɼ�
		/*int AJavaScore=80;
		int B=AJavaScore;
		System.out.println(B);
		*/
		
		double oracle=89;
		double java=90;
		double html=60;
		double a=java-html;
		double b=(oracle+java+html)/3;
		System.out.println("1��Java�κ�html�εķ���֮�� :"+a+"��");
		System.out.println("2��3�ſε�ƽ����:"+(String.format("%.2f",b))+"��");
	}

}
