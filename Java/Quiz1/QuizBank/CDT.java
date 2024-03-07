public class CDT{

	private int depositoCdt;
	private double ganancia;
	private int valorInicial;


		public CDT(int inputDepCDT, int inputBalanCDT){
			this.valorInicial = inputBalanCDT;
			this.depositoCdt = inputDepCDT;
			this.ganancia = 0.05;
		}
		
		public getBalanCDT(){
			return this.valorInicial;
		}

		public setBalanCDT(int newBalanCDT){
			this.valorInicial =newBalanCDT;

		}


}