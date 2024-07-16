package com.challenge.literatura;
import com.fasterxml.jackson.core.JsonProcessingException;

import java.util.List;
import java.util.Scanner;

public class Menu {

    public void menu() throws JsonProcessingException {
        Scanner scanner = new Scanner(System.in);
        int option = 0;

        while (option != 6) {
            // Display menu
            System.out.println("Menú de Biblioteca:");
            System.out.println("1. Buscar libros por título");
            System.out.println("2. Listar libros registrados");
            System.out.println("3. Listar autores registrados");
            System.out.println("4. Listar autores vivos en determinado año");
            System.out.println("5. Listar libros por idioma");
            System.out.println("6. Salir");
            System.out.print("Seleccione una opción: ");
            var logica = new Logica();
            // Read user input
            option = scanner.nextInt();
            scanner.nextLine();  // Consume newline left-over

            // Handle menu options
            switch (option) {
                case 1:
                    System.out.print("Ingrese el nombre del libro que desea buscar: ");
                    String bookTitle = scanner.nextLine();
                    //logica.Logica("https://gutendex.com/books/?search="+bookTitle);
                    // Implementar la búsqueda del libro por título
                    System.out.println("Buscando el libro: " + bookTitle);
                    List<Book> ko = logica.Logica("https://gutendex.com/books/?search="+bookTitle);
                    for (Book book : ko) {
                        System.out.println("Title: " + book.getTitle());
                        //System.out.println("Authors: " + book.getAuthors());
                        //System.out.println("Subjects: " + book.getSubjects());
                        // Aquí puedes continuar accediendo a otros atributos según sea necesario
                        }
                    break;
                case 2:
                    // Listar libros registrados (sin implementación)
                    break;
                case 3:
                    // Listar autores registrados (sin implementación)
                    break;
                case 4:
                    System.out.print("Ingrese el año: ");
                    int year = scanner.nextInt();
                    // Listar autores vivos en determinado año (sin implementación)
                    break;
                case 5:
                    System.out.print("Ingrese el idioma: ");
                    String language = scanner.nextLine();
                    // Listar libros por idioma (sin implementación)
                    break;
                case 6:
                    // Salir
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida, por favor intente de nuevo.");
            }
           // scanner.close();
        }

    }

}
