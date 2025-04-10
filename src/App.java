import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner(System.in);
        FileWriter escrever = new FileWriter("dados.txt", true);

        System.out.println("Quantos usuários quer cadastrar?");
        int nUsers = ler.nextInt();

        String usuarios[][] = new String[nUsers][4];

        ler.nextLine();

        for (int i = 0; i < usuarios.length; i++) {
            boolean cadastroValido = false;
            while (!cadastroValido) {
                try {
                    
                    System.out.println("Usuário (" + (i+1) + "/" + usuarios.length+")");
                    System.out.println("Digite o nome do usuário");
                    String nome = ler.nextLine();
                    System.out.println("Digite a data de nascimento (dd/mm/yyyy)");
                    String dataNascimento = ler.nextLine();
                    System.out.println("Digite o email");
                    String email = ler.nextLine();
                    System.out.println("Digite o cpf (xxx.xxx.xxx-xx)\n");
                    String cpf = ler.nextLine();
                    
                    usuarios[i][0] = nome;
                    usuarios[i][1] = dataNascimento;
                    usuarios[i][2] = email;
                    usuarios[i][3] = cpf;

                    cadastroValido = true;

                } catch (Exception e) {
                    // TODO: handle exception
                    System.out.println("INSIRA SOMENTE VALORES VÁLIDOS!");
                }
            }
        }

        escrever.write("Dados obtidos:\n");
        for (int i = 0; i < usuarios.length; i++) {
            escrever.write("("+i+1 + "/" + usuarios.length + ")"+"\n");
            escrever.write("Nome: " + usuarios[i][0] + "\n");
            escrever.write("Data de nascimento: " + usuarios[i][1] + "\n");
            escrever.write("Email: " + usuarios[i][2] + "\n");
            escrever.write("CPF: " + usuarios[i][3] + "\n\n");
        }
        escrever.close();
    }
}
