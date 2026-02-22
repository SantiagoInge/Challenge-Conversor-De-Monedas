* Conversor de Monedas - Java 21

Aplicación de consola desarrollada en **Java 21 (LTS)** que permite
convertir entre diferentes monedas latinoamericanas y el dólar
estadounidense utilizando tasas de cambio en tiempo real mediante una
API externa.

------------------------------------------------------------------------

* Funcionalidades

-   Conversión entre USD ⇄ ARS, BOB, BRL, CLP y COP
-   Consumo de API REST usando HttpClient
-   Manejo de JSON con Gson
-   Formato profesional de moneda según el país destino (Locale)
-   Menú interactivo en consola
-   Arquitectura organizada por responsabilidades

------------------------------------------------------------------------

* Arquitectura del Proyecto

com.alura.conversordemonedas.principal │ ├── ConversorDeMonedasApp →
Punto de entrada (main) ├── MenuConversor → Menú e interacción con el
usuario └── ApiService → Consumo de la API

------------------------------------------------------------------------

* Tecnologías Utilizadas

-   Java 21 (LTS)
-   java.net.http.HttpClient
-   Gson
-   NumberFormat y Locale

------------------------------------------------------------------------

* Requisitos

-   JDK 21 instalado
-   IDE compatible (IntelliJ IDEA recomendado)
-   Conexión a internet
