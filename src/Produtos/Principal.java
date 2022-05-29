//Aluno: Lucas Varela Lopes
//AV1 3POB

package Produtos;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
	
	
	static void alterarProduto(ArrayList<Produto> lista, int id) {
		
		Scanner sn = new Scanner(System.in);
		int snIn;
		int i;
		
		int codBarras;
		String sku;
		String nome;
		String descricao;
		String categoria;
		double preco;
		double peso;
		String fabricante;
		
		for (i = 0; i < lista.size(); i++) {
			
			if(lista.get(i).getId() == id) {
				
				while(true) {
					
					System.out.println("O que gostaria de alterar?");
					System.out.println("1 - Codigo de Barras");
					System.out.println("2 - SKU");
					System.out.println("3 - Nome");
					System.out.println("4 - Descricao");
					System.out.println("5 - Categoria");
					System.out.println("6 - Preco");
					System.out.println("7 - Peso");
					System.out.println("8 - Fabricante");
					System.out.println("0 - Voltar");
					System.out.println("");
					
					snIn = sn.nextInt();
					sn.nextLine();
					
					
					switch (snIn) {
					
					case 0:
						
					return;
					
					case 1:
						
						while(true) {
							System.out.println("Informe o novo codigo de barras: ");
							codBarras = sn.nextInt();
							sn.nextLine();
							
							System.out.println("Novo codigo de barras: " + codBarras + ". Para confirmar, tecle 1, para refazer tecle qualquer outro numero.");
							snIn = sn.nextInt();
							sn.nextLine();
							
							if(snIn == 1) {
								lista.get(i).setCodBarras(codBarras);
								System.out.println("Alteracao concluida! ");
								break;
							}
						
						}
						
					break; 
					
					case 2:
						
						while(true) {
							System.out.println("Informe o novo SKU: ");
							sku = sn.nextLine();
							
							System.out.println("Novo sku: " + sku + ". Para confirmar, tecle 1, para refazer tecle qualquer outro numero.");
							snIn = sn.nextInt();
							sn.nextLine();
							
							if(snIn == 1) {
								lista.get(i).setSku(sku);;
								System.out.println("Alteracao concluida! ");
								break;
							}
						
						}
						
					break; 
					
					case 3:
						
						while(true) {
							System.out.println("Informe o novo nome: ");
							nome = sn.nextLine();
							
							System.out.println("Novo nome: " + nome + ". Para confirmar, tecle 1, para refazer tecle qualquer outro numero.");
							snIn = sn.nextInt();
							sn.nextLine();
							
							if(snIn == 1) {
								lista.get(i).setNome(nome);;
								System.out.println("Alteracao concluida! ");
								break;
							}
							
						}
						
					break; 
					
					case 4:
						
						while(true) {
							System.out.println("Informe a nova descricao: ");
							descricao = sn.nextLine();
							
							System.out.println("Nova descricao: " + descricao + ". Para confirmar, tecle 1, para refazer tecle qualquer outro numero.");
							snIn = sn.nextInt();
							sn.nextLine();
							
							if(snIn == 1) {
								lista.get(i).setDescricao(descricao);;
								System.out.println("Alteracao concluida! ");
								break;
							}
							
						}
						
					break; 
					
					case 5:
						
						while(true) {
							System.out.println("Informe a nova categoria: ");
							categoria = sn.nextLine();
							
							System.out.println("Nova categoria: " + categoria + ". Para confirmar, tecle 1, para refazer tecle qualquer outro numero.");
							snIn = sn.nextInt();
							sn.nextLine();
							
							if(snIn == 1) {
								lista.get(i).setCategoria(categoria);;
								System.out.println("Alteracao concluida! ");
								break;
							}
							
						}
						
					break; 
					
					case 6:
						
						while(true) {
							System.out.println("Informe o novo preco: ");
							preco = sn.nextDouble();
							sn.nextLine();
							
							System.out.println("Novo preco: " + preco + ". Para confirmar, tecle 1, para refazer tecle qualquer outro numero.");
							snIn = sn.nextInt();
							sn.nextLine();
							
							if(snIn == 1) {
								lista.get(i).setPreco(preco);;
								System.out.println("Alteracao concluida! ");
								break;
							}
							
						}
						
					break; 
					
					case 7:
						
						while(true) {
							System.out.println("Informe o novo peso: ");
							peso = sn.nextDouble();
							sn.nextLine();
							
							System.out.println("Novo peso: " + peso + ". Para confirmar, tecle 1, para refazer tecle qualquer outro numero.");
							snIn = sn.nextInt();
							sn.nextLine();
							
							if(snIn == 1) {
								lista.get(i).setPeso(peso);;
								System.out.println("Alteracao concluida! ");
								break;
							}
							
						}
						
					break; 
					
					case 8:
						
						while(true) {
							System.out.println("Informe a novo fabricante: ");
							fabricante = sn.nextLine();
							
							System.out.println("Novo fabricante: " + fabricante + ". Para confirmar, tecle 1, para refazer tecle qualquer outro numero.");
							snIn = sn.nextInt();
							sn.nextLine();
							
							if(snIn == 1) {
								lista.get(i).setFabricante(fabricante);;
								System.out.println("Alteracao concluida! ");
								break;
							}
							
						}
						
					break;
					
					}
					
					System.out.println("Gostaria de alterar outro parametro? Se sim tecle 1, senão tecle qualquer outro numero.");
					snIn = sn.nextInt();
					sn.nextLine();
					
					if(snIn != 1) {
						return;
					}
					
				}
				
			}
			
			System.out.println("ID nao consta na lista ");
			return;
		}
		
	}
	
	static void excluirProduto(ArrayList<Produto> lista, int id) {
		
		Scanner sn = new Scanner(System.in);
		int snIn;
		
		int i;
		
		for (i = 0; i < lista.size(); i++) {
			
			if(lista.get(i).getId() == id) {
				
				listarProdutoUnico(lista, id);
				
				System.out.println("Prosseguir com exclusao do item acima? 1 para continuar, qualquer outro numero para abortar.");
				snIn = sn.nextInt();
				sn.nextLine();
				
				
				if(snIn != 1) {
					return;
				}
				
				lista.remove(i);
				
				System.out.println("Produto excluido com sucesso. ");
				
				return;
			}
			
		}
		
		System.out.println("ID nao consta na lista.");
		
	}
	
	static void incluirProduto(ArrayList<Produto> lista, int codBarras, String sku, String nome, 
			String descricao, String categoria, double preco, double peso, String fabricante) {
		
		int id = 0;
		
		if(lista.size() == 0) {
			id = 1;
		}
		else {
			id = lista.get(lista.size()-1).getId() + 1;
		}
		
		Produto produto = new Produto(id, codBarras, sku, nome, descricao, categoria, preco, peso, fabricante);
		
		lista.add(produto);
		
	}
	
	static void listarProdutos(ArrayList<Produto> lista) {
		
		int i;
		
		if(lista.size() == 0) {
			System.out.println("Nao ha produtos na lista.");
			return;
		}
		
		System.out.println("-----Produtos-----");
		System.out.println("");
		
		for (i=0; i < lista.size(); i++) {
			
			System.out.println("ID: " + lista.get(i).getId());
			System.out.println("Codigo de Barras: " + lista.get(i).getCodBarras());
			System.out.println("SKU: " + lista.get(i).getSku());
			System.out.println("Nome: " + lista.get(i).getNome());
			System.out.println("Descricao: " + lista.get(i).getDescricao());
			System.out.println("Categoria: " + lista.get(i).getCategoria());
			System.out.println("Preco: " + lista.get(i).getPreco());
			System.out.println("Peso: " + lista.get(i).getPeso());
			System.out.println("Fabricante: " + lista.get(i).getFabricante());
			System.out.println("");
			
		}
	
	}
	
	static void listarProdutoUnico(ArrayList<Produto> lista, int id) {
		
		int i;
		
		for (i=0; i < lista.size(); i++) {
			
			if (lista.get(i).getId() == id) {
				
				System.out.println("-----Produto-----");
				System.out.println("");
				System.out.println("ID: " + lista.get(i).getId());
				System.out.println("Codigo de Barras: " + lista.get(i).getCodBarras());
				System.out.println("SKU: " + lista.get(i).getSku());
				System.out.println("Nome: " + lista.get(i).getNome());
				System.out.println("Descricao: " + lista.get(i).getDescricao());
				System.out.println("Categoria: " + lista.get(i).getCategoria());
				System.out.println("Preco: " + lista.get(i).getPreco());
				System.out.println("Peso: " + lista.get(i).getPeso());
				System.out.println("Fabricante: " + lista.get(i).getFabricante());
				
				return;
			}
			
		}
		
		System.out.println("ID nao consta na lista.");
		
	}
	
	
	public static void main(String args[]) {
		
		Scanner sn = new Scanner(System.in);
		ArrayList<Produto> lista = new ArrayList<Produto>();
		
		int snIn = 0;
		
		while (true){
			
			System.out.println("-----Sistema de Gerenciamento de Produtos-----");
			System.out.println("");
			System.out.println("Digite: ");
			System.out.println("");
			System.out.println("1 - Para incluir produto.");
			System.out.println("2 - Para alterar produto.");
			System.out.println("3 - Para excluir produto.");
			System.out.println("4 - Para listar todos os produtos.");
			System.out.println("5 - Para listar apenas um produto.");
			System.out.println("Ou qualquer numero negativo para abortar a operação.");
			System.out.println("");
			
			snIn = sn.nextInt();
			sn.nextLine();
			
			if (snIn < 0) {
				sn.close();
				break;
			}
			
			switch(snIn) {
			
			case 1:
				
				do{
				
					System.out.println("Voce gostaria de incluir um produto? Tecle 1 para prosseguir ou qualquer outro numero para voltar.");

					snIn = sn.nextInt();
					sn.nextLine();
					
					if(snIn != 1) {
						break;
					}
					
					System.out.println();
					System.out.println("Insira o codigo de barras: ");
					int codBarras = sn.nextInt();
					sn.nextLine();
					
					System.out.println("");
					System.out.println("Insira o sku: ");
					String sku = sn.nextLine();
					
					System.out.println("");
					System.out.println("Insira o nome: ");
					String nome = sn.nextLine();
					
					System.out.println("");
					System.out.println("Insira a descricao: ");
					String descricao = sn.nextLine();
					
					System.out.println("");
					System.out.println("Insira a categoria: ");
					String categoria = sn.nextLine();
					
					System.out.println("");
					System.out.println("Insira o preco: ");
					double preco = sn.nextDouble();
					sn.nextLine();
					
					System.out.println("");
					System.out.println("Insira o peso: ");
					double peso = sn.nextDouble();
					sn.nextLine();
					
					System.out.println("");
					System.out.println("Insira o fabricante: ");
					String fabricante = sn.nextLine();
					
					System.out.println("");
					System.out.println("Voce inseriu...");
					System.out.println("Codigo de Barras: " + codBarras);
					System.out.println("Sku: " + sku);
					System.out.println("Nome: " + nome);
					System.out.println("Descricao: " + descricao);
					System.out.println("Categoria: " + categoria);
					System.out.println("Preco: " + preco);
					System.out.println("Peso: " + peso);
					System.out.println("Fabricante: " + fabricante);
					System.out.println("");
					System.out.println("Esta correto? Se sim, tecle 1, senão tecle qualquer outro numero");
					snIn = sn.nextInt();
					
					if(snIn == 1) {
						
						incluirProduto(lista, codBarras, sku, nome, descricao, categoria, preco,
								peso, fabricante);
						
						System.out.println("");
						System.out.println("Produto incluido com sucesso! Gostaria de incluir mais um?");
						System.out.println("Tecle 1 se sim, caso contrario, tecle qualquer outro numero: ");
						snIn = sn.nextInt();
						
						if(snIn != 1) {
							break;
						}
						
					}
				}
				while(true);
				
			break;
			
			case 2:
				
				
				while(true) {
					System.out.println("Informe o ID do produto a ser alterado, ou um numero negativo para retornar: ");
					int id = sn.nextInt();
					sn.nextLine();
					
					if(id < 0) {
						break;
					}
					
					alterarProduto(lista, id);
				}

			break;
				
			case 3:
				
				while(true) {
					System.out.println("Informe o ID do produto a ser excluido, ou um numero negativo para voltar ");
					int id = sn.nextInt();
					sn.nextLine();
					
					if(id < 0) {
						break;
					}else {
						
						excluirProduto(lista, id);
						
						System.out.println("Deseja excluir outro produto? Se sim, tecle 1, senão tecle qualquer outro numero: ");
						snIn = sn.nextInt();
						sn.nextLine();
						
						if (snIn != 1) {
							break;
						}
						
					}
		
				}
				
			break;
				
			case 4:
				
				listarProdutos(lista);
				
			break;
				
			case 5:
				
				while(true) {
					System.out.println("Informe o ID do produto a ser listado: ");
					int id = sn.nextInt();
					sn.nextLine();
					
					listarProdutoUnico(lista, id);
					
					System.out.println("Deseja listar outro produto? Se sim, tecle 1, senão tecle qualquer outro numero: ");
					snIn = sn.nextInt();
					sn.nextLine();
					
					if (snIn != 1) {
						break;
					}
				}
				
			break;
			
			}
			
		}

	}

}
