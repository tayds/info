

public class ComplementaryColor {

	/* This main method receives two arguments: language and color.
	   Thus, you need to provide them when you're going to execute it.
	   For instance, if you run it on command line, you
	   could simply run: "java ComplementaryColor pt vermelho"

	   If you're running on Eclipse, you need to set the arguments
	   in "Run/Run configurations/Arguments/Program arguments"
	   otherwise you'll just get a runtime exception and nothing will happen
	   Needing help with that don't hesitate on contacting me
	 */
	/**
	 *
	 * @param args[0] language (Ex: pt)
	 * @param args[1] color (Ex: vermelho)
	 */
	public static void main(String[] args) {
		if (args[0].equals("pt")) {
			String color = args[1];
			System.out.print("Legal, você escolheu \"" + color);
			String representation = "";
			String cColor = "";
			if ("vermelho".equals(color)) {
				representation = "tomate";
				cColor = "verde";
			}
			else if ("roxo".equals(color)) {
				representation = "berinjela";
				cColor = "amarelo";
			}
			else if ("azul".equals(color)) {
				representation = "mirtilo";
				cColor = "laranja";
			}
			else if ("verde".equals(color)) {
				representation = "alface";
				cColor = "vermelho";
			}
			else if ("amarelo".equals(color)) {
				representation = "melão";
				cColor = "roxo";
			}
			else if ("laranja".equals(color)) {
				representation = "tangerina";
				cColor = "azul";
			};
			System.out.println("\", cor de " + representation + ".");

			System.out.println("Sua cor complementar é: " + cColor + "!");
		} else if(args[0].equals("en")) {
			String color = args[1];
			System.out.print("Nice, you choose \"" + color);
			String representation = "";
			String cColor = "";
			if ("red".equals(color)) {
				representation = "tomato";
				cColor = "green";
			}
			else if ("purple".equals(color)) {
				representation = "eggplant";
				cColor = "yellow";
			}
			else if ("blue".equals(color)) {
				representation = "blueberry";
				cColor = "orange";
			}
			else if ("green".equals(color)) {
				representation = "lettuce";
				cColor = "red";
			}
			else if ("yellow".equals(color)) {
				representation = "melon";
				cColor = "purple";
			}
			else if ("orange".equals(color)) {
				representation = "tangerine";
				cColor = "blue";
			};
			System.out.println("\", color of " + representation + ".");

			System.out.println("Your additional color: " + cColor + "!");
		} else if(args[0].equals("es")) {
			String color = args[1];
			System.out.print("Agradable, a elegir \"" + color);
			String representation = "";
			String cColor = "";
			if ("rojo".equals(color)) {
				representation = "tomate";
				cColor = "verde";
			}
			else if ("purpura".equals(color)) {
				representation = "berenjena";
				cColor = "amarillo";
			}
			else if ("azul".equals(color)) {
				representation = "arándano";
				cColor = "naranja";
			}
			else if ("verde".equals(color)) {
				representation = "lechuga";
				cColor = "rojo";
			}
			else if ("amarillo".equals(color)) {
				representation = "melón";
				cColor = "purpura";
			}
			else if ("naranja".equals(color)) {
				representation = "mandarina";
				cColor = "azul";
			};
			System.out.println("\", el color de " + representation + ".");

			System.out.println("Su color adicional: " + cColor + "!");
		}
	}
}
