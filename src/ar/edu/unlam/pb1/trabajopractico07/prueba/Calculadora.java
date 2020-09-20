package ar.edu.unlam.pb1.trabajopractico07.dominio;

public class Calculadora {
	//atts
		private double operador1 = 0.0;
		private double operador2 = 0.0;
		private double resultado = 0.0;

		//bob
		public Calculadora(){
			operador1 = 1.0;
			operador2 = 1.0;
		}
		public Calculadora(double operador1,double operador2){
			this.operador1 = operador1;
			this.operador2 = operador2;
		}

		//métodos
		public double sumar(){
			return resultado=operador1+operador2;
		}
		public double sumar(double operador1,double operador2){
			this.operador1 = operador1;
			this.operador2 = operador2;
			return resultado=operador1+operador2;
		}
		public double restar(){
			return operador1-operador2;
		}
		public double restar(double operador1,double operador2){
			this.operador1 = operador1;
			this.operador2 = operador2;
			return resultado=operador1-operador2;
		}
		public double multiplicar(){
			return resultado=operador1*operador2;
		}
		public double multiplicar(double operador1,double operador2){
			this.operador1 = operador1;
			this.operador2 = operador2;
			return resultado=operador1*operador2;
		}
		public double dividir(){
			double excepcion = 0;
			if (operador2==0){
				return excepcion;
			}
			else{
			return resultado=operador1/operador2;
			}

		}
		public double dividir(double operador1,double operador2){
			this.operador1 = operador1;
			this.operador2 = operador2;
			return resultado=operador1/operador2;
		}
		public boolean esPositivo(){
			if (resultado>0){
				return true;
			}else
		{	return false;
			}
		}
		public double potencia(double operador1,double operador2) {
			this.operador1=operador1;
			this.operador2=operador2;
			this.resultado=operador1*operador1;
			for(int i=2;i<operador2;i++) {
				resultado=operador1*resultado;
			}
		return resultado;
		}
		public int sumatoria(int limite) {
			int limiteSumatoria=limite;
			int resultado=1;
			int operadorVariable=2;
			for (int i = 2; i < limiteSumatoria; i++) {
				resultado=resultado+operadorVariable;
				operadorVariable++;
			}
			return resultado;
		}
		public int sumatoria(int limiteInferior,int limiteSuperior) {
			int limiteInferiorEstablecido=limiteInferior;
			int limiteSuperiorEstablecido=limiteSuperior;
			int limiteSumatoria=limiteSuperiorEstablecido-limiteInferiorEstablecido;
			int resultado=limiteInferiorEstablecido;
			int operadorVariable=limiteInferiorEstablecido+1;
			for (int i = 1; i <= limiteSumatoria; i++) {
				resultado=resultado+operadorVariable;
				operadorVariable++;
			}
			return resultado;
		}
		public int productoria(int limite) {
			int limiteproductoria=limite;
			int resultado=1;
			int operadorVariable=2;
			for (int i = 2; i < limiteproductoria; i++) {
				resultado=resultado*operadorVariable;
				operadorVariable++;
			}
			return resultado;
		}
		public int productoria(int limiteInferior,int limiteSuperior) {
			int limiteInferiorEstablecido=limiteInferior;
			int limiteSuperiorEstablecido=limiteSuperior;
			int limiteProductoria=limiteSuperiorEstablecido-limiteInferiorEstablecido;
			int resultado=limiteInferiorEstablecido;
			int operadorVariable=limiteInferiorEstablecido+1;
			for (int i = 1; i <= limiteProductoria; i++) {
				resultado=resultado*operadorVariable;
				operadorVariable++;
			}
			return resultado;
		}
		public String contarDivisores(int numero) {
			String mensaje="";
			int numeroRecibido=numero;
			int divisorVariable=1;
			int resto=0;
			for (int i = 0; i <= numeroRecibido; i++) {
				resto=numeroRecibido%divisorVariable;
				if (resto==0) {
					mensaje=mensaje+","+divisorVariable+",";
				}
				divisorVariable++;
			}
			return mensaje;
		}
		public int factorial(int numero) {
			int i=1;
			int resultado=1;
			int numeroVariable=2;
			if (numero==1) {
				return 1;
			}
			if (numero==2) {
				return 2;
			}
			if (numero>0) {
				do {
					resultado=resultado*numeroVariable;
					numeroVariable++;
					i++;
				} while (i<numero);
				
			}
			return resultado;
			
		}
}






















