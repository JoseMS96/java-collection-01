package br.fai.colec01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Main app = new Main();
		app.start();
	}

	private void start() {
		List<String> dados = new ArrayList<String>();
		for (int i = 0; i < 5;) {
			System.out.println("Digite o item " + (i + 1) + '.');
			String dado = obterDados();
			if (dado != "" && dado != "INVALIDO") {
				dados.add(dado);
			}
			i = dados.size();
		}
		iterarLista(dados);
		String ia1 = "item adicionado automaticamente 01";
		String ia2 = "item adicionado automaticamente 02";
		dados.add(ia1);
		dados.add(ia2);
		dados.remove(1);
		dados.remove(1);
		iterarLista(dados);
	}

	private String obterDados() {
		Scanner scanner = new Scanner(System.in);
		String dado;
		try {
			dado = scanner.nextLine();
		} catch (Exception e) {
			dado = "INVALIDO";
		}
		return dado;
	}

	private void iterarLista(List dados) {
		System.out.println();
		for (int i = 0; i < 5; i++) {
			System.out.println(dados.get(i));
		}
	}
}
