//���ýӿڵķ�ʽ����ʵ�ּ���Բ�������ε��ܳ��������

class InterfaceApply{
	public static void main (String [] args){
		Cictcl cj = new Cictcl(5.2);
		Rect kj = new Rect(5.2);
		
		System.out.println("�뾶��"+cj.getR()+"��Բ���ܳ���"+cj.getArea(5.2));
		System.out.println("�뾶��"+cj.getR()+"��Բ�������"+cj.getAround(5.2));
		
		
		System.out.println("�߳���"+kj.getR()+"�������Σ��ܳ���"+kj.getAround(5.2));
		System.out.println("�߳���"+kj.getR()+"�������Σ������"+kj.getArea(5.2));
		
		
	}
	
	
	
}
//ʹ�ýӿڵĺô���
//1����������ϣ����ӿ�ά���ԡ�
//�಻������̳У����ǵ��������ʵ�ֶ���ӿڡ����ң��ӿڿ�������̳�Ҳ�������༶�̳С�
//�ӿڶ�����һ�ֱ�׼������ʹ���ǵĴ���ֲ㿪������ģ�鿪����

interface CircInter{
	public double getAround(double r);
	public double getArea(double a);
	public final static double  PI = 3.1415; 	
}


class Cictcl implements CircInter{
	private double r;
	//��������ǰ�治��Ҫͬ����һ��Ҫ�ӷ���ֵ���͡����򱨴�
	public Cictcl(double r){
		this.r = r;
		
	} 
 	public double getR(){
 		
 		return r; 		
 	
 	}
 	
	public double getAround(double r){
 		r = PI*r*r;
 		return r;
 	}	
 	public double getArea(double a){
 		a = PI*a*2;
 		return a;
 	}
 	
}


class Rect implements CircInter{
	private double r;
	public Rect(double r){
		this.r = r;
		
	} 
 	public double getR(){
 		
 		return r; 		
 	
 	}
 	
	public double getAround(double r){
 		r = 4*r;
 		return r;
 	}	
 	public double getArea(double a){
 		a = a*a;
 		return a;
 	}
 	
}
/*
*
�ӿںͳ����������
1���ӿ��еķ������붼�ǳ��󷽷������������еķ��������ǳ��󷽷�Ҳ���Բ��ǳ��󷽷���
2�� �ӿڿ��Խ��ж�̳У���������ֻ�ܽ��е��̳С�
3���ӿ��еı���Ĭ����fianl static �ģ����������еı���û����Щǰ׺��
4���ӿ��еķ���Ĭ����abstract�����������еķ����������abstract �ؼ��֡�
5���ӿںͳ����඼���ܱ�ʵ�������ӿ�ͨ������ʵ�֣��ٽ���ʵ������ ��������ͨ�������̳У�ͨ��������ʵ��������


*/