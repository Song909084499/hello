package com.jichulianxi.three;
/* ���ݣ���2����ϰ
 * ������������
 * ���ڣ�2019-08-27       */
public class first {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*ʹ�ñ����洢����MP3��Ϣ������ӡ���
		Ʒ�ƣ�brand����������F928
		������weight����12.4
		������ͣ�type��������﮵��
		�۸�price����499   */ 
		String brand="������F928";
		double weight=12.4;
		String type="����﮵��";
		double price=499;
		System.out.println("Ʒ�ƣ�brand��:"+brand+"\n"+ "������weight����" +weight+"\n"+"������ͣ�type����"+type+"\n"+"�۸�price����"+price);
		System.out.println("*******************************************");
		//ĳ���AѧԱJava�ɼ���80�֣�BѧԱ��AѧԱ�ɼ���ͬ�����BѧԱ�ɼ�
		int AJavaScore=80;
		int B=AJavaScore;
		System.out.println("ĳ���AѧԱJava�ɼ���80�֣�BѧԱ��AѧԱ�ɼ���ͬ�����BѧԱ�ɼ�");
		System.out.println(B);
		System.out.println("*******************************************");
		/*ĳѧԱ3�ſγɼ����ұ���ʾ�����ʵ�֣�
	     1��Java�κ�html�εķ���֮��                      oracle  89     Java90      html 60 
	     2��3�ſε�ƽ����*/
		float oracle=89F;
		float java=90F;
		float html=60F;
		float a=java-html;
		float b=(oracle+java+html)/3;
		System.out.println("1��Java�κ�html�εķ���֮�� :"+a+"��");
		System.out.println("2��3�ſε�ƽ����:"+String.format("%.2f",b)+"��");

		System.out.println("2��3�ſε�ƽ����:"+String.format("%.2f",35.7998)+"��");

		
	}
}
