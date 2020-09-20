package ar.edu.unlam.pb1.trabajopractico08.dominio;

import java.util.Scanner;
import java.util.Calendar;
import java.util.Date;

public class Empleado {
	
	private static int fechaActual[]= {23 ,07 ,2020};
	
	private static final int CANTIDAD_DE_DIAS_EN_UN_MES=30;
	
	private static final int CANTIDAD_DE_MESES_EN_UN_ANIO=30;
	
	private static final int NUMERO_CON_EL_QUE_REEMPLAZO_SI_NO_ME_QUEDAN_ANOS=9999;
	
	private static final int SUPERANTIGUEDAD=10;
	
	private static final int UN_POCO_DE_ANTIGUEDAD=5;
	
	private static final int CASI_NADA_DE_ANTIGUEDAD=6;
	
	

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);

		String[] fechaDeIngreso= new String[3];
		
		for (int i = 0; i < fechaDeIngreso.length; i++) {
			fechaDeIngreso[i]="";
		}
		
		System.out.println("Ingrese fecha de ingreso del empleado (formato dd//mm/aaaa)");
		String fechaDeIngresada=teclado.next(); 
		fechaDeIngreso[0]=fechaDeIngresada.substring(0, 2);
		fechaDeIngreso[1]=fechaDeIngresada.substring(3, 5);
		fechaDeIngreso[2]=fechaDeIngresada.substring(6, 10);
		int diaDeIngreso=Integer.parseInt(fechaDeIngreso[0]);
		int mesDeIngreso=Integer.parseInt(fechaDeIngreso[1]);
		int anioDeIngreso=Integer.parseInt(fechaDeIngreso[2]);
		System.out.println(calcularDiasDeVacaciones(diaDeIngreso,mesDeIngreso,anioDeIngreso));
		
	}
	private static String calcularDiasDeVacaciones(int diaDeIngreso,int mesDeIngreso,int anioDeIngreso) {
		String antiguedad=calcularAntiguedad(diaDeIngreso,mesDeIngreso,anioDeIngreso);
		String mensaje="";
		
		if (Integer.parseInt(antiguedad.substring(4, 8))==NUMERO_CON_EL_QUE_REEMPLAZO_SI_NO_ME_QUEDAN_ANOS) {
			if (Integer.parseInt(antiguedad.substring(3, 4))>=CASI_NADA_DE_ANTIGUEDAD) {
				mensaje= "Usted se gano 14 dias de vacaciones";
				return mensaje;
			}
			else {
				mensaje= "Usted se tiene que arrepentir";
				return mensaje;
			}
		}
		
		if (Integer.parseInt(antiguedad.substring(5, 9))>=SUPERANTIGUEDAD) {
			mensaje= "Usted se gano 28 dias de vacaciones";
			return mensaje;
		}
		if (Integer.parseInt(antiguedad.substring(5, 9))>=UN_POCO_DE_ANTIGUEDAD) {
			mensaje= "Usted se gano 21 dias de vacaciones";
			return mensaje;
		}
		else {
			mensaje= "Usted se gano 14 dias de vacaciones";
			return mensaje;
		}	
	}
	private static String calcularAntiguedad(int diaDeIngreso, int mesDeIngreso, int anioDeIngreso) {
		fechaActual[0]-=diaDeIngreso;
		if (fechaActual[0]<0) {
			int temporal=fechaActual[0];
			fechaActual[0]=CANTIDAD_DE_DIAS_EN_UN_MES+temporal;
			fechaActual[1]--;
		}
		fechaActual[1]-=mesDeIngreso;
		if (fechaActual[1]<0) {
			int temporal=fechaActual[1];
			fechaActual[1]=CANTIDAD_DE_MESES_EN_UN_ANIO+temporal;
			fechaActual[2]--;
		}
		fechaActual[2]-=anioDeIngreso;	
		if (fechaActual[2]==0) {
			fechaActual[2]=NUMERO_CON_EL_QUE_REEMPLAZO_SI_NO_ME_QUEDAN_ANOS;
		}
		return fechaActual[0]+"/"+fechaActual[1]+"/"+fechaActual[2];
	}

}
