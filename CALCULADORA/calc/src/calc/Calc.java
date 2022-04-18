package calc;



	import java.util.ArrayList;
	import java.util.List;

	public class Calc {

		private List<String> lastOperations = new ArrayList<String>();   

		public Number sum(Number valorUm, Number valorDois) {
			Number resultado = valorUm.doubleValue() + valorDois.doubleValue();

			saveOperation('+', valorUm, valorDois, resultado);

			return resultado;
		}

		public Number sub(Number valorUm, Number valorDois) {
			Number resultado = valorUm.doubleValue() - valorDois.doubleValue();

			saveOperation('-', valorUm, valorDois, resultado);

			return resultado;
		}

		public Number div(Number valorUm, Number valorDois) {
			Number resultado = valorUm.doubleValue() / valorDois.doubleValue();

			saveOperation('/', valorUm, valorDois, resultado);

			return resultado;
		}

		public Number mult(Number valorUm, Number valorDois) {
			Number resultado = valorUm.doubleValue() * valorDois.doubleValue();

			saveOperation('*', valorUm, valorDois, resultado);

			return resultado;
		}

		public List<String> getLastOperations(){
			List<String> copyLastOperations = new ArrayList<String>();

			for(String operation : lastOperations) {
				copyLastOperations.add(operation);
			}

			return copyLastOperations;
		}

		private void saveOperation(char operation, Number valorUm, Number valorDois, Number resultado) {
			String formattedresultado = String.format("%.2f %s %.2f = %.2f", valorUm.doubleValue(), operation, valorDois.doubleValue(), resultado);

			lastOperations.add(formattedresultado);
		}
	}

