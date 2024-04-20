package br.com;

import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;

public class Ex3 {
    public static void main(String[] args) {
        String mensagem = "Isso é uma adição!";
        String nomeArquivo = "meuarquivo.txt";

        try {
            // Cria um objeto FileWriter em modo de anexação (append)
            FileWriter fileWriter = new FileWriter(nomeArquivo, true);
            BufferedWriter writer = new BufferedWriter(fileWriter);

            // Escreve a mensagem no final do arquivo
            writer.write(mensagem);
            writer.newLine(); // Adiciona uma nova linha

            // Fecha o BufferedWriter
            writer.close();

            System.out.println("Mensagem adicionada ao arquivo com sucesso!");
        } catch (IOException e) {
            System.err.println("Erro ao escrever no arquivo: " + e.getMessage());
        }
    }
}
