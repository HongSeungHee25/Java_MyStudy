package day05;

import java.util.Scanner;

public class Review {

	public static void main(String[] args) {
		
		//�ǽ�1
		
		//����ڿ��� �ֹι�ȣ ���ڸ� 7�ڸ��� �Է¹ް�
		//�������� �������� ����ϱ�
		
		//���ڸ��� 2,4�� �����ϸ� ����
		//���ڸ��� 1,3���� �����ϸ� ����
		
		//�Է¿��� : 
		//�ֹε�Ϲ�ȣ ���ڸ��� �̷��ϼ��� >> 2123456
		
		//������� :
		//�����Դϴ�
		 
		Scanner sc=new Scanner(System.in);
		char spell = ' ';
		
		System.out.println("�ֹε�Ϲ�ȣ ���ڸ��� �Է��ϼ���");
		spell = sc.next().charAt(0);
		
		switch(spell) {
		case '2' : case '4' : 
			System.out.println("�����Դϴ�");
			break;
		case '1' : case '3' :
			System.out.println("�����Դϴ�");
			break;
		default :
			System.out.println("�߸��� �Է��Դϴ�");
			break;
		}
	}

}
