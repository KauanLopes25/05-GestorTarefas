package br.dev.kauan.GestorTarefas.utils;

import java.util.UUID;

public class Utils {
	
	public static String gerarUUID8() {
		// classe de Identificador java.util
		UUID uuid = UUID.randomUUID(); // variavel do tipo de identificador atribuido a uma
		String uuid8 = uuid.toString().substring(0, 8);
		return uuid8;
	}
}
