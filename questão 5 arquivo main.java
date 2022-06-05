package projetojava;

import java.util.Scanner;
import java.util.ArrayList;

public class ProjetoJava 
{
    /*algoritmo para marcar uma consulta em uma clínica
    
    classes: consulta, data e hora, médico
    
    objetos da classe consulta: data_hora, médico
    objetos da classe data e hora: mês,dia,horário
    objetos da classe médico: nome, área atuante
    
    */

    //função "consulta" que tem o algoritmo para marcar a consulta
    public static void marcar_consulta()
    {
        
        Scanner input2 = new Scanner(System.in);
        Scanner input3 = new Scanner(System.in);
        Scanner input4 = new Scanner (System.in);
        
        //variavel do nome do paciente
        String paciente;
        
        //variaveis data e hora
        int mes,dia,hora;
        boolean dia_certo,hora_certa,mes_certo;
        
        
        //variaveis medico
        int area_medicina = 0,medico = 0;
        boolean area_certa,medic_certo;
        
        
        //inserir o nome do paciente
        
        System.out.println("insira o nome do paciente: ");
        System.out.print("insira aqui: ");
        paciente = input4.nextLine();
        System.out.println("");
        
        
        //algoritmo para marcar o a data e hora da consulta
        
        //menu para marcar o mês da consulta
        
        /* laço de repetição para 
        se caso a pessoa digitar um número errado o laço fazer 
        a pessoa digitar denovo um número certo*/
        do
        {
            System.out.println("\n\npara qual mês gostaria de marcar ?");
            System.out.println("1 - janeiro 2 - fevereiro 3 - março 4 - abril 5 - maio 6 - junho");
            System.out.println("7 - julho 8 - agosto 9 - setembro 10 - outubro 11 - novembro 12 - dezembro");

            System.out.print("\ninsira aqui: ");
            mes = input2.nextInt();
            
            if(mes >= 1 && mes<= 12)
            {
                mes_certo = true;
            }
            else
            {
                mes_certo = false;
            }
            
        }while(mes_certo == false);
        
        //para meses com 31 dias 
            if(mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12)
            {
                /* selecionar o dia, se o número estiver fora de 1 a 31 o código irá 
                marcar um erro e retornar para marcar o dia denovo */
                do
                {
                    System.out.println("\n\nqual dia ? (1 a 31)");
                    System.out.print("\ninsira aqui: ");
                    dia = input2.nextInt();
                    if(dia >= 1 && dia <= 31)
                    {
                        dia_certo = true;
                    }
                    else
                    {
                        System.out.println("\n\n\n!erro, o numero inserido é invalido!");
                        dia_certo = false;
                    }
                }while(dia_certo == false); 
            }

        
        //para marcar o dia em feveiro que tem 28 dias
        
        else if (mes == 2)
        {
            do
            {
                System.out.println("\n\nqual dia ? (1 a 28)");
                System.out.print("\ninsira aqui: ");
                dia = input2.nextInt();
                if(dia >= 1 && dia <= 28)
                {
                    dia_certo = true;
                }
                else
                {   
                    System.out.println("\n\n\n!erro, o numero inserido é invalido!");
                    dia_certo = false;
                }
            }while(dia_certo == false); 
        }
        
        //para marcar o dia nos meses que tem 30 dias
        else
        {
            do
            {
                System.out.println("\n\nqual dia ? (1 a 30)");
                System.out.print("\ninsira aqui: ");
                dia = input2.nextInt();
                if(dia >= 1 && dia <= 30)
                {
                    dia_certo = true;
                }
                else
                {
                    System.out.println("\n\n\n!erro, o numero inserido é invalido!");
                    dia_certo = false;
                }
            }while(dia_certo == false); 
        }
        
       
        //para marcar qual hora do dia
        
        do
        {
            System.out.println("\n\npara qual hora do dia ?");
            System.out.println("0 (meia noite) até 23 (onze da noite)");
            System.out.print("\ninsira aqui: ");
            hora = input2.nextInt();

            if(hora >= 0 && hora <= 23)
            {
                hora_certa = true;
            }
            else
            {
                System.out.println("\na hora inserida é invalida, favor inserir novamente\n");
                hora_certa = false;
            }
        }while(hora_certa == false);
        
        System.out.println("data e hora marcados!");
        Data_hora data_marcada = new Data_hora(mes,dia,hora);
        
        
        
        
        
        
        
        
        
        
        
        
        /*
        função "marcar_medico" para o cliente escolher a area da medicina
        que ele quer marcar
        */
        
        do
        {
        System.out.println("\n\ncom médico de qual área da medicina ? ");
        System.out.println("1 - clínico geral 2 - odontologista 3 - ortopedista 4 - cardiologista");
        
        System.out.print("\ninsira aqui: ");
        area_medicina = input3.nextInt();
        
            if(area_medicina >= 1 && area_medicina <= 4)
            {
                area_certa = true;
            }
            else
            {
                System.out.println("!erro, o número inserido é invalido!");
                area_certa = false;
            }
        
        }while(area_certa == false);
        
        switch(area_medicina)
        {
            case 1:
                do
                {
                    System.out.println("\n\ncom qual médico(a) ?");
                    System.out.println("1 - lucieli 2 - pedro");
                    System.out.print("\ninsira aqui: ");
                    medico = input3.nextInt();
                    System.out.println("");
                    if(medico >=1 && medico <=2 )
                    {
                        medic_certo = true;
                    }
                    else 
                    {
                        medic_certo = false;
                    }
                }while(medic_certo = false);
                break;
                
            case 2:
                do
                {
                    System.out.println("\n\ncom qual médico(a) ?");
                    System.out.println("1 - maria 2 - wesley");
                    System.out.print("\ninsira aqui: ");
                    medico = input3.nextInt();
                    System.out.println("");
                    if(medico >=1 && medico <=2 )
                    {
                        medic_certo = true;
                    }
                    else 
                    {
                        medic_certo = false;
                    }
                }while(medic_certo = false);
                
                break;
                
            case 3:
                do
                {
                    System.out.println("\n\ncom qual médico(a) ?");
                    System.out.println("1 - joana 2 - matheus");
                    System.out.print("\ninsira aqui: ");
                    medico = input3.nextInt();
                    System.out.println("");
                    if(medico >=1 && medico <=2 )
                    {
                        medic_certo = true;
                    }
                    else 
                    {
                        medic_certo = false;
                    }
                }while(medic_certo = false);
                break;
                
            case 4: 
                do
                {
                    System.out.println("\n\ncom qual médico(a) ?");
                    System.out.println("1 - lorena 2 - hugo");
                    System.out.print("\ninsira aqui: ");
                    medico = input3.nextInt();
                    System.out.println("");
                    if(medico >=1 && medico <=2 )
                    {
                        medic_certo = true;
                    }
                    else 
                    {
                        medic_certo = false;
                    }
                }while(medic_certo = false);
                break;
            
        }
        
        System.out.println("medico marcado!");
        Medico medico_marcado = new Medico (area_medicina,medico);
        
        Consulta consulta_marcada = new Consulta (data_marcada,medico_marcado,paciente);
        
        
        System.out.println("\n\n\nsua consulta foi marcada com sucesso " + paciente + ", volte sempre :) ");

    }
    
    
    //função main onde executará o algoritmo
    public static void main(String[] args) 
    {
       
        Scanner input = new Scanner(System.in);
        
        int menu;
        
        
        /*um laço de repetição onde irá ficar rodando o menu do programa para
        o usuário escolher o que vai fazer*/
        
        do
        {
            
            System.out.println("\n\n\n* Bem vindo a Clinica Clean *");
            
            System.out.println("\n1 - agendar uma consulta");
            System.out.println("2 - sair");
            
            System.out.print("\ninsira aqui: ");

            menu = input.nextInt();
            
            System.out.println("");
            
            
            //um switch para executar o que a ação que o usuário escolher
            switch (menu)
            {
                case 1:
                    marcar_consulta();
                    break;

                case 2:
                    System.out.println("volte sempre!");
                    break;
            }
            
            
        }while(menu != 2);
        
              
    }
    
}

    
