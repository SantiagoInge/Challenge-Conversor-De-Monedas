* Conversor de Monedas - Java 21

Aplicación de consola desarrollada en Java 21 que realiza conversiones de divisas en tiempo real mediante el consumo de ExchangeRate-API. El proyecto está estructurado con una arquitectura clara y modular, enfocada en buenas prácticas, mantenibilidad y escalabilidad.

* Resumen 

Este proyecto demuestra la capacidad de integrar servicios externos mediante consumo de APIs REST, procesar datos en formato JSON y aplicar principios sólidos de diseño en Java. Se implementa una separación clara de responsabilidades, uso del cliente HTTP nativo y formateo internacional de moneda.

El sistema permite convertir valores entre el dólar estadounidense y diversas monedas latinoamericanas con tasas actualizadas dinámicamente.

* Competencias Técnicas Demostradas

- Consumo de APIs REST con java.net.http.HttpClient

- Integración con ExchangeRate-API

- Procesamiento de respuestas JSON con Gson

- Diseño modular basado en separación de responsabilidades

- Manejo de entrada de usuario en aplicaciones de consola

- Formateo internacional de moneda con Locale y NumberFormat

- Gestión de dependencias y configuración en entorno Java 21 (LTS)

- Uso de control de versiones con Git

* Arquitectura
com.alura.conversordemonedas.principal
│
├── ConversorDeMonedasApp  → Punto de entrada (main)
├── MenuConversor          → Lógica de interacción y flujo del programa
└── ApiService             → Comunicación con la API externa

La estructura sigue el principio de responsabilidad única (SRP), favoreciendo claridad en el diseño y facilidad de mantenimiento.

* Tecnologías Utilizadas

- Java 21 (LTS)
- java.net.http.HttpClient
- Gson
- ExchangeRate-API
- Git

* API Utilizada

El proyecto consume ExchangeRate-API para obtener tasas de cambio actualizadas.
Sitio oficial:
https://www.exchangerate-api.com/
Para su funcionamiento es necesario configurar una API Key en el archivo ApiService.java.

* Posibles Extensiones

- Implementación de BigDecimal para mayor precisión financiera
- Manejo robusto de excepciones y validaciones
- Registro de historial de conversiones
- Implementación de pruebas unitarias (JUnit)
- Evolución hacia arquitectura basada en servicios o interfaz gráfica
