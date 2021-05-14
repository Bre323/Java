import javax.swing.JOptionPane;


public class Main {

	public static void main(String[] args) {
		
		String name = JOptionPane.showInputDialog("Digite seu nome");
		JOptionPane.showMessageDialog(null, "Bom dia, " + name);
		
		int age = Integer.parseInt(JOptionPane.showInputDialog("Digite a sua idade"));
		JOptionPane.showMessageDialog(null, "Você tem " + age + " anos");
		
		double peso = Double.parseDouble(JOptionPane.showInputDialog("Digite o seu peso"));
		JOptionPane.showMessageDialog(null, "Você tem " + peso + "kg");
		
	}

}
