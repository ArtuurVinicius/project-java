import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int confirmar;
        int max;
        int curva;
        int trocar;

        System.out.println("========================================");
        System.out.println("Digite de 1 a 3 para escolher seu carro");
        System.out.println("         digite 9 para sair         ");
        System.out.println("========================================");
        int escolha = sc.nextInt();

        switch (escolha) {

            case 1:
                Carros c1 = new Carros();
                c1.setModelo("Ford Focus");
                c1.setCor("Azul Cobalto");
                c1.setVelocidadeMaxima(170);
                c1.setArranque(70);
                c1.setComportamento(60);

                System.out.println("Modelo: " + c1.getModelo());
                System.out.println("Cor: " + c1.getCor());
                System.out.println("Velocidade máxima: " + c1.getVelocidadeMaxima());
                System.out.println("Arranque: " + c1.getArranque());
                System.out.println("Comportamento: " + c1.getComportamento());

                System.out.println("1 - Confirmar");
                System.out.println("2 - Voltar");
                confirmar = sc.nextInt();
                if (confirmar == 1) {
                    System.out.println("Você escolheu Ford Focus!");
                    System.out.println("Digite 1 para atingir a velocidade máxima!");
                    max = sc.nextInt();
                    if (max == 1) {
                        System.out.println("O veículo está a 170 km/h!");
                    }
                    System.out.println("Digite 1 para fazer curva");
                    curva = sc.nextInt();
                    if (curva == 1) {
                        System.out.println(c1.fazerCurva());
                        System.out.println("O pneu furou! Digite 2 para trocá-lo!");
                        trocar = sc.nextInt();
                        if (trocar == 2) {
                            System.out.println(c1.trocarPneus());
                            System.out.println("Fim do jogo - You win!");
                        }
                    } else {
                        System.out.println("Você bateu! Fim do jogo!");
                        break;
                    }
                    break;
                } else if (confirmar == 2) {
                    System.out.println("Opção cancelada!");
                    break;
                }

            case 2:
                Carros c2 = new Carros();
                c2.setModelo("Chevrolet Corsa");
                c2.setCor("Amarelo");
                c2.setVelocidadeMaxima(150);
                c2.setArranque(80);
                c2.setComportamento(75);

                System.out.println("Modelo: " + c2.getModelo());
                System.out.println("Cor: " + c2.getCor());
                System.out.println("Velocidade máxima: " + c2.getVelocidadeMaxima());
                System.out.println("Arranque: " + c2.getArranque());
                System.out.println("Comportamento: " + c2.getComportamento());

                System.out.println("1 - Confirmar");
                System.out.println("2 - Voltar");
                confirmar = sc.nextInt();
                if (confirmar == 1) {
                    System.out.println("Você escolheu Chevrolet Corsa!");
                    System.out.println("Digite 1 para atingir a velocidade máxima!");
                    max = sc.nextInt();
                    if (max == 1) {
                        System.out.println("O veículo está a 150 km/h!");
                    }
                    System.out.println("Digite 1 para fazer curva");
                    curva = sc.nextInt();
                    if (curva == 1) {
                        System.out.println(c2.fazerCurva());
                        System.out.println("O pneu furou! Digite 2 para trocá-lo!");
                        trocar = sc.nextInt();
                        if (trocar == 2) {
                            System.out.println(c2.trocarPneus());
                            System.out.println("Fim do jogo - You win!");
                            break;
                        }
                    } else {
                        System.out.println("Você bateu! Fim do jogo!");
                        break;
                    }
                    } else if (confirmar == 2) {
                        System.out.println("Opção cancelada!");
                        break;
                    }

                    case 3:
                        Carros c3 = new Carros();
                        c3.setModelo("Bugatti Type 35B (1927)");
                        c3.setCor("Cinza Espacial");
                        c3.setVelocidadeMaxima(215);
                        c3.setArranque(100);
                        c3.setComportamento(50);

                        System.out.println("Modelo: " + c3.getModelo());
                        System.out.println("Cor: " + c3.getCor());
                        System.out.println("Velocidade máxima: " + c3.getVelocidadeMaxima());
                        System.out.println("Arranque: " + c3.getArranque());
                        System.out.println("Comportamento: " + c3.getComportamento());

                        System.out.println("1 - Confirmar");
                        System.out.println("2 - Voltar");
                        confirmar = sc.nextInt();
                        if (confirmar == 1) {
                            System.out.println("Você escolheu Bugatti Type 35B (1927)!");
                            System.out.println("Digite 1 para atingir a velocidade máxima!");
                            max = sc.nextInt();
                            if (max == 1) {
                                System.out.println("O veículo está a 215 km/h!");
                            }
                            System.out.println("Digite 1 para fazer a curva");
                            curva = sc.nextInt();
                            if (curva == 1){
                                System.out.println(c3.fazerCurva());
                                System.out.println("O pneu furou! digite 2 para trocá-lo!");
                                trocar = sc.nextInt();
                                if (trocar ==2){
                                    c3.trocarPneus();
                                    System.out.println("Fim do jogo - You win!");
                                }

                            } else {
                                System.out.println("Você bateu! Fim do jogo!");
                                break;
                            }
                            break;
                        } else if (confirmar == 2) {
                            System.out.println("Opção cancelada!");
                            break;
                        }

                    default:
                        System.out.println("Saindo...");
                        break;
                }
        }
    }
