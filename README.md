# Inmersión Java

**Una guía práctica que te permitirá conocer un poco sobre Java con ejercicios prácticos y conceptos fundamentales**

---

## 1. ¿Qué es Java?

**Java** es un lenguaje de programación de alto nivel, orientado a objetos, diseñado para ser simple, seguro, robusto y portable. Fue desarrollado por un equipo de ingenieros liderados por James Gosling en Sun Microsystems, y lanzado oficialmente en 1995.

Java está pensado para crear aplicaciones que puedan ejecutarse en cualquier sistema operativo sin necesidad de ser modificadas, gracias a su lema:  
**“Write Once, Run Anywhere”** (“Escribe una vez, ejecuta en cualquier lugar”).

---

## 2. ¿Por qué Java es importante?

- **Multiplataforma:** Java permite crear programas que funcionan en Windows, Mac, Linux, y otros sistemas, gracias a la Java Virtual Machine (JVM).
- **Seguro y robusto:** Java elimina problemas comunes de otros lenguajes como C/C++ (por ejemplo, manejo de memoria con punteros), lo que reduce errores y vulnerabilidades.
- **Versátil:** Se usa en aplicaciones empresariales, móviles (especialmente Android), web, gaming, sistemas embebidos, IoT y más.
- **Gran comunidad y ecosistema:** Hay millones de desarrolladores, abundante documentación y miles de bibliotecas disponibles.
- **Base de la programación moderna:** Aprender Java facilita el aprendizaje de otros lenguajes como (Kotlin, Scala, C#) y es muy valorado en el mercado laboral.

---

## 3. ¿Cómo funciona Java? (Arquitectura básica)

### 3.1. Proceso de ejecución

1. **Escribes tu código** en un archivo `.java`.
2. **Compilas** el archivo con el compilador de Java (`javac`), que convierte el código fuente en **bytecode** (archivo `.class`).
3. **Ejecutas** el bytecode en la **JVM**, que interpreta y ejecuta el programa en cualquier sistema operativo.

**Diagrama:**

```
Código Fuente (.java)
        |
      javac
        |
  Bytecode (.class)
        |
       JVM
        |
  Sistema Operativo
```

---

### 3.2 Estructura de un programa simple en Java

```java
public class HolaMundo {
    public static void main(String[] args) {
        System.out.println("¡Hola mundo!");
    }
}
```

| Elemento                       | Significado y función                                                                                                                                                                                                                                                                                                                                                                                                                                  |
| ------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `public`                       | Modificador de acceso: la clase o método es visible desde otras partes del programa.                                                                                                                                                                                                                                                                                                                                                                   |
| `class`                        | Palabra reservada para definir una clase (plantilla de objetos).                                                                                                                                                                                                                                                                                                                                                                                       |
| `HolaMundo`                    | Nombre de la clase. Debe coincidir con el nombre del archivo (`HolaMundo.java`).                                                                                                                                                                                                                                                                                                                                                                       |
| `{ ... }`                      | Llaves: delimitan el bloque de código de la clase o método.                                                                                                                                                                                                                                                                                                                                                                                            |
| `public static void main(...)` | Declaración del método principal, **punto de entrada del programa**. <br> - **public:** Accesible desde cualquier parte del programa. <br> - **static:** El método pertenece a la clase y no a un objeto específico. <br> - **void:** El método no devuelve ningún valor. <br> - **main:** Nombre obligatorio del método que la JVM busca al iniciar el programa. <br> - **Paréntesis**: Indican que se trata de un método y delimitan los parámetros. |
| `String[] args`                | Parámetro del método `main`: recibe argumentos de línea de comandos como un arreglo de Strings.                                                                                                                                                                                                                                                                                                                                                        |
| `System.out.println(...)`      | Instrucción que imprime texto en la consola (salida).                                                                                                                                                                                                                                                                                                                                                                                                  |
| `;`                            | Punto y coma: indica el final de una instrucción en Java.                                                                                                                                                                                                                                                                                                                                                                                              |

---

## 4. Conceptos Fundamentales de Java

### 4.1. Lenguaje orientado a objetos (OOP)

Java está basado en la programación orientada a objetos, que organiza el software usando **clases** y **objetos**.

- **Clase:** Es un molde o plantilla que describe cómo serán los objetos (atributos y comportamientos).
- **Objeto:** Es una instancia concreta de una clase. Es un elemento real que existe en la memoria.

<!-- MEJORAR -->

#### Pilares de OOP en Java:

- **Encapsulamiento:** Ocultar los detalles internos y exponer solo lo necesario (modificadores de acceso: `public`, `private`, `protected`).
- **Herencia:** Permite crear nuevas clases basadas en clases existentes.
- **Polimorfismo:** Un objeto puede comportarse como diferentes tipos.
- **Abstracción:** Permite enfocarse en lo esencial, ignorando detalles irrelevantes.

---

### 4.2. Tipos de datos en Java

#### Primitivos (básicos):

Son los tipos de datos básicos que proporciona el lenguaje Java.

- **byte:** Enteros pequeños
- **short:** Enteros cortos
- **int:** Enteros estándar
- **long:** Enteros largos
- **float:** Números decimales de simple precisión
- **double:** Números decimales de doble precisión
- **char:** Caracteres individuales (ej: 'A')
- **boolean:** Verdadero o falso

#### Referenciados:

Son los tipos de datos que se refieren a un objeto en lugar de almacenar el valor directamente.

- **String:** Cadenas de caracteres.
- **Arreglos (arrays):** Colecciones de datos del mismo tipo
- **Objetos:** Instancias de cualquier clase
- **Enums :** Son una clase especial que te permite incorporar constantes inmutables en tu código.

---

### 4.3. Variables y Constantes

- **Variable:** Espacio nombrado que almacena un dato que puede cambiar.
  ```java
    int numero = 10; // Asigna el valor 10 a la variable numero de tipo int.
  ```
- **Constante:** Variable cuyo valor no cambia (usa `final`).
  ```java
  final double PI = 3.1416;
  ```

---

### 4.4. Operadores

Los operadores en Java son símbolos especiales que se utilizan para realizar operaciones en variables y valores.

- **Aritméticos:** `+`, `-`, `*`, `/`, `%`
- **Comparación:** `==`, `!=`, `<`, `>`, `<=`, `>=`
- **Lógicos:** `&&`, `||`, `!`
- **Bit:** `&`, `|`, `^`, `~`, `«`, `»`
- **Asignación:** `=`, `+=`, `-=` etc.
- **Incremento y Decremento:** `++`,`--`

---

### 4.5. Estructuras de Control

Las estructuras de control condicional permiten ejecutar bloques de código específicos dependiendo de si se cumplen ciertas condiciones.

- **Condicionales:**

  ```java
  // IF simple: Evalúa una condición. 
  // Si se cumple (es verdadera), se ejecuta el bloque de código. 
  // Si no se cumple, se omite ese bloque.
  if (condición) {
    ...
  }

  // IF - ELSE: Permite que el programa tome uno u otro camino dependiendo del resultado de la condición.
  if (condición) {
    ...
  } else {
    ...
  }

  // IF - ELSE IF: Evalúa múltiples condiciones de forma secuencial.
  // Si la primera no se cumple, verifica la siguiente, y así sucesivamente.
  // El bloque else final se ejecuta si ninguna de las condiciones anteriores se cumple.
  if (condición_1) {
    ...
  } else if(condición_2) {
    ...
  } else {
    ...
  }

  // IF anidados: Un if dentro de otro if.
  // Se usan cuando quieres que una segunda condición se evalúe solo si la primera se cumple.
  if (condición_principal) {
    ...
    if(condición_secundaria){
      ...
    } else  {
    ...
    }
  } else {
    ...
  }

  ```

  ```java
    // OPERADOR TERNARIO: Es una forma simplificada de escribir una estructura condicional if-else en una sola línea.
    String valor = condición ? "valor_si_verdadero" : "valor_si_falso";
  ```

  ```java
    //SWITCH: Es una alternativa al uso repetido de if - else if cuando estás comparando una misma variable con varios valores.
    String dia = "Lunes";
    switch (dia) {
      case "Lunes":{
        ...
        break; //<- nos permite salir del bucle sin ejecutar los siguientes casos.
      }
      case "Martes":{
        ...
        break;
      }
      // más casos
      default: { //<- es similar al else, ya que si ninguno de los casos se cumple, se ejecutará el caso default.
        ...
      }
    }
  ```

- **Bucles:**

  ```java
  // FOR: Se usa cuando conocemos la cantidad de repeticiones.
  // Se puede iterar en orden descendente utilizando decrementos (int i = numeroDeRepeticiones; i > 0; i--)
  // No es necesario incrementar o decrementar de uno en uno (i += 2)
  // Se pueden utilizar múltiples variables en un bucle for: (int i = 1, j = 10; i <= 10 && j >= 1; i++, j--)
  for (int i = 0; i < numeroDeRepeticiones; i++) {
    ... 
  }

  // FOR-EACH: Es una versión mejorada del bucle for, que simplifica la iteración sobre colecciones y arrays.
  // Aunque el bucle for-each es más simple, tiene algunas limitaciones 
  // ¿Cuándo usar for-each?
  // - Cuando solo necesitas leer los elementos.
  // - Cuando no te importa el índice.
  // - Cuando no necesitas modificar o eliminar elementos directamente.
  for (tipo nombreVariable : colección) {
    ...
  }

  // WHILE: Repite el bloque de código mientras la condición sea verdadera.
  // La condición se evalúa antes de cada iteración.
  while (condición) { 
    ... 
  }

  // DO-WHILE: Igual que el while, pero siempre se ejecuta al menos una vez, ya que la condición se evalúa después de ejecutar el bloque.
  do {
    ... 
  } while (condición);
  ```

- **Sentencias útiles:**

  ```java
  break; // <- Se utiliza para salir de un bucle o de una estructura switch. En otras palabras, interrumpe el flujo de ejecución dentro de ese bloque y lo termina de forma inmediata.
  
  continue; // <- Salta a la siguiente iteración del bucle, sin ejecutar el resto de las instrucciones dentro del mismo. Es útil cuando se desea omitir ciertas iteraciones bajo una condición específica.

  yield; // <- Devuelve un valor en un switch con la nueva sintaxis (usando: ->).
  ```

---

### 4.6. Métodos y Funciones

- **Método:** Bloque de código que realiza una tarea específica.
  ```java
  public int suma(int a, int b) {
      return a + b;
  }

  return; // <- Se utiliza para salir de un método. Si el método tiene un valor de retorno (por ejemplo, int o String), puede devolver un valor usando return.
  ```

---

### 4.7. Modificadores de Acceso

<!-- CORROBORAR -->

Los modificadores de acceso controlan la visibilidad de clases, atributos y métodos:

| Modificador | Visibilidad                                                                       |
| ----------- | --------------------------------------------------------------------------------- |
| `public`    | Accesible desde cualquier clase de cualquier paquete                              |
| `private`   | Accesible solo dentro de la misma clase                                           |
| `protected` | Accesible en el mismo paquete y en subclases (incluso si están en otros paquetes) |
| (default)   | Accesible solo dentro del mismo paquete (si no se especifica ningún modificador)  |

---

### 4.8. Entrada y Salida estándar

- **Salida:**

  ```java
  System.out.println("Hola mundo"); // Imprime el texto dando un salto de línea
  System.out.print("Sin salto");    // Imprime sin salto de línea

  // Salida formateada con printf
  System.out.printf("Formato: %s tiene %d años y mide %.2f metros%n", "Pepito", 25, 1.75);
  // Salida: Pepito tiene 25 años y mide 1.75 metros
  ```
  - #### Secuencias de escape comunes:

    | Secuencia | Significado     | Ejemplo de uso                              |
    | --------- | --------------- | ------------------------------------------- |
    | `\n`      | Salto de línea  | `System.out.println("Fila 1\nFila 2");`     |
    | `\t`      | Tabulación      | `System.out.println("Columna1\tColumna2");` |
    | `\"`      | Comillas dobles | `System.out.println("Él dijo: \"Hola\"");`  |
    | `\'`      | Comilla simple  | `System.out.println("Don\'t worry");`       |
    | `\\`      | Barra invertida | `System.out.println("Ruta: C:\\Users\\");`  |
    
  - #### Marcadores de formato principales para `printf`:

    | Marcador | Tipo de dato | Descripción             | Ejemplo                                       |
    | -------- | ------------ | ----------------------- | --------------------------------------------- |
    | `%s`     | String       | Cadena de texto         | `System.out.printf("Nombre: %s%n", "Ana");`   |
    | `%d`     | int/long     | Número entero           | `System.out.printf("Edad: %d%n", 30);`        |
    | `%f`     | float/double | Número decimal          | `System.out.printf("Precio: %f%n", 15.99);`   |
    | `%.2f`   | float/double | Decimal con 2 decimales | `System.out.printf("Precio: %.2f%n", 15.99);` |
    | `%c`     | char         | Carácter individual     | `System.out.printf("Inicial: %c%n", 'A');`    |
    | `%b`     | boolean      | Valor booleano          | `System.out.printf("Activo: %b%n", true);`    |
    | `%n`     | -            | Salto de línea          | `System.out.printf("Línea 1%nLínea 2");`      |
    | `%%`     | -            | Símbolo % literal       | `System.out.printf("Descuento: 15%%");`       |

  <!-- - #### Modificadores de formato útiles:
    - **Ancho de campo:** `%10s` (reserva 10 espacios)
    - **Alineación izquierda:** `%-10s` (alinea a la izquierda)
    - **Rellenar con ceros:** `%05d` (rellena con ceros: 00123)
    - **Signo siempre:** `%+d` (muestra + para números positivos) -->

---

- **Entrada (con Scanner):**

  ```java
  import java.util.Scanner;

  Scanner sc = new Scanner(System.in); // Creamos un objeto Scanner
  System.out.print("Introduce tu nombre: ");
  String nombre = sc.next();
  System.out.println("Hola, " + nombre);
  sc.close(); //Cierra el Scanner al final del uso para liberar recursos

  ```
  - System.in: indica que la entrada será desde el teclado.
  - sc: es el nombre del objeto que usaremos para leer los datos.
<!-- REVISAR -->
  #### Métodos comunes
  | Método         | Función                           |
  | -------------- | --------------------------------- |
  | `next()`       | lee una palabra (sin espacios)        |  
  | `nextLine()`   | lee una línea completa (con espacios) |  
  | `nextInt()`    | lee un número entero          |
  | `nextDouble()` | lee un número decimal     |

  #### Error común al usar Scanner
  ```java
  //Cuando usas next(), nextInt() y nextDouble(). NO se consume el salto de línea (\n) al presionar Enter. Eso puede causar que un nextLine() posterior lea una cadena vacía.

  // Código con error
  System.out.print("Edad: ");
  int edad = sc.nextInt();      // <- Lee el número, pero deja el \n

  System.out.print("Nombre completo: ");
  String nombre = sc.nextLine();  // <- Lee el \n pendiente, -> resultado: cadena vacía

  // Solución
  System.out.print("Edad: ");
  int edad = sc.nextInt();
  sc.nextLine(); // <- Limpia el buffer

  System.out.print("Nombre completo: ");
  String nombre = sc.nextLine(); // <- Lee correctamente la línea completa
  ```

---

### 4.9. Manejo de Excepciones

Permite capturar y gestionar errores en tiempo de ejecución.

```java
try {
    // Código que puede fallar
} catch (Exception e) {
    // Código para manejar el error
} finally {
    // Siempre se ejecuta
}
```

---

### 4.10. Paquetes y Organización de Código

- **Paquetes:** Agrupan clases relacionadas.
  ```java
  package com.dominio.proyecto;
  ```
- **Importaciones:** Permiten usar clases de otros paquetes.
  ```java
  import java.util.Scanner;
  ```

---

<!-- ## 5. Conversión de tipos en Java (Casting y Parsing)

En Java, es común tener que convertir datos de un tipo a otro, por ejemplo de números a texto, de texto a números, o entre tipos primitivos y sus clases envolventes (wrapper classes). Aquí te muestro cómo hacerlo correctamente.

---

### 5.1. Entero (`int`) a String

**Usa `String.valueOf()` o concatenación vacía:**
```java
int numero = 123;
String texto = String.valueOf(numero); // "123"
String texto2 = numero + "";           // "123"
```

---

### 5.2. String a Entero (`int`)

**Usa `Integer.parseInt()`. Si el texto no es numérico, lanzará `NumberFormatException`.**
```java
String texto = "456";
int numero = Integer.parseInt(texto); // 456
```

---

### 5.3. Double a String y viceversa

**Double a String:**
```java
double decimal = 3.1416;
String texto = String.valueOf(decimal); // "3.1416"
```

**String a Double:**
```java
String texto = "2.718";
double decimal = Double.parseDouble(texto); // 2.718
```

---

### 5.4. De cualquier tipo primitivo a String

```java
boolean b = true;
String sb = String.valueOf(b); // "true"

char c = 'A';
String sc = String.valueOf(c); // "A"
```

---

### 5.5. De String a otros tipos primitivos

| Tipo primitivo | Conversión desde String                | Ejemplo                        |
|----------------|---------------------------------------|--------------------------------|
| `int`          | `Integer.parseInt(String s)`           | `int n = Integer.parseInt("10");` |
| `double`       | `Double.parseDouble(String s)`         | `double d = Double.parseDouble("3.14");` |
| `float`        | `Float.parseFloat(String s)`           | `float f = Float.parseFloat("5.6");` |
| `long`         | `Long.parseLong(String s)`             | `long l = Long.parseLong("10000");` |
| `boolean`      | `Boolean.parseBoolean(String s)`       | `boolean b = Boolean.parseBoolean("true");` |

---

### 5.6. Primitivo a su clase envolvente (Wrapper)

Desde Java 5, esto se hace automáticamente (autoboxing), pero puedes hacerlo explícito:

```java
int n = 7;
Integer objN = Integer.valueOf(n); // Boxing
int n2 = objN.intValue();          // Unboxing
```
**Forma automática (autoboxing y unboxing):**
```java
Integer objN = n; // autoboxing
int n2 = objN;    // unboxing
```

---

### 5.7. Otros ejemplos y buenas prácticas

#### Convertir entre tipos primitivos (casting)
```java
double d = 9.99;
int i = (int) d; // i = 9 (trunca el decimal)
```

#### Convertir String a char
```java
String s = "Hola";
char letra = s.charAt(0); // 'H'
```

#### Advertencia:
- Si el `String` no representa un número válido y usas `parseInt`, `parseDouble`, etc., Java lanzará una excepción (`NumberFormatException`). Siempre valida o maneja excepciones al convertir cadenas ingresadas por usuarios.

#### Ejemplo de manejo seguro:
```java
String texto = "abc";
try {
    int valor = Integer.parseInt(texto); // Lanza excepción
} catch (NumberFormatException e) {
    System.out.println("El texto no es un número válido.");
}
```

---

Esta sección es esencial para manipular datos de usuarios, realizar cálculos, mostrar resultados y trabajar con colecciones de Java, donde frecuentemente necesitas transformar datos entre tipos.


---


## 6. Métodos útiles y colecciones fundamentales en Java

### 6.1. Métodos más usados de la clase String

La clase `String` permite trabajar con texto, y ofrece muchos métodos útiles para manipular cadenas:

| Método                        | Descripción | Ejemplo `String s = "Hola"` |
|-------------------------------|-------------|---------|
| `length()`                    | Devuelve la cantidad de caracteres. | `int l = s.length(); // 4` |
| `charAt(int index)`           | Devuelve el carácter en la posición indicada (empieza en 0). | `char c = s.charAt(1); // 'o'` |
| `toUpperCase()`               | Convierte todo el texto a mayúsculas. | `String mayus = s.toUpperCase(); // "HOLA"` |
| `toLowerCase()`               | Convierte todo el texto a minúsculas. | `String minus = s.toLowerCase(); // "hola"` |
| `substring(int begin, int end)` | Extrae subcadena desde `begin` hasta `end-1`. | `String sub = s.substring(1,3); // "ol"` |
| `replace(char old, char nuevo)` | Reemplaza un carácter por otro. | `String r = s.replace('a', 'e'); // "Hole"` |
| `replace(String old, String nuevo)` | Reemplaza una subcadena por otra. | `String frase = "Java es divertido"; String nueva = frase.replace("divertido", "poderoso"); // "Java es poderoso"` |
| `equals(String otro)`         | Compara contenido (mayúsculas importan). | `boolean igual = s.equals("hola"); // false` |
| `equalsIgnoreCase(String otro)` | Compara sin distinguir mayúsculas. | `boolean igual = s.equalsIgnoreCase("hola"); // true` |
| `trim()`                      | Elimina espacios al inicio y final. | `String limpio = " hola ".trim(); // "hola"` |
| `split(String regex)`         | Divide la cadena en partes usando un separador. | `String[] partes = "a,b,c".split(","); // {"a", "b", "c"}` |

#### Ejemplo práctico:
```java
String nombre = "  Juan Perez  ";
String limpio = nombre.trim().toUpperCase(); // "JUAN PEREZ"
String[] partes = limpio.split(" ");
System.out.println(partes[0]); // "JUAN"
System.out.println(partes[1]); // "PEREZ"
```

---

### 6.2. ArrayList: lista dinámica

`ArrayList` es una colección dinámica que permite almacenar elementos y acceder a ellos por índice. Es ideal cuando necesitas una lista que puede crecer o disminuir de tamaño.

**Declaración y uso básico:**
```java
import java.util.ArrayList;

ArrayList<String> frutas = new ArrayList<>();
frutas.add("Manzana");              // Agrega elemento
frutas.add("Pera");
frutas.add("Naranja");

System.out.println(frutas.get(1));  // "Pera" (posición 1)
frutas.set(1, "Plátano");           // Cambia "Pera" por "Plátano"
System.out.println(frutas.size());  // 3
frutas.remove("Plátano");           // Elimina "Plátano"
System.out.println(frutas.contains("Manzana")); // true

for (String fruta : frutas) {
    System.out.println(fruta);
}
```

| Método                | Descripción |
|-----------------------|-------------|
| `add(elemento)`       | Añade un elemento al final. |
| `get(indice)`         | Obtiene elemento por posición. |
| `set(indice, valor)`  | Cambia el valor en la posición indicada. |
| `remove(indice/objeto)` | Elimina por posición o por valor. |
| `size()`              | Devuelve la cantidad de elementos. |
| `isEmpty()`           | Indica si la lista está vacía. |
| `contains(objeto)`    | Indica si el objeto está en la lista. |
| `clear()`             | Elimina todos los elementos. |

**Consejo:** Los `ArrayList` solo pueden almacenar objetos, no tipos primitivos (usa `Integer`, `Double`, etc. en vez de `int`, `double`).

---

### 6.3. HashMap: asociación clave-valor

Un `HashMap` permite guardar pares de clave-valor, ideal para búsquedas rápidas por clave, como una agenda telefónica o un diccionario.

**Declaración y uso básico:**
```java
import java.util.HashMap;

HashMap<String, Integer> edades = new HashMap<>();
edades.put("Ana", 30);                 // Asocia "Ana" con 30
edades.put("Juan", 25);

System.out.println(edades.get("Ana")); // 30
edades.replace("Ana", 31);             // Cambia el valor de "Ana" a 31
edades.remove("Juan");                 // Elimina la entrada de "Juan"

for (String nombre : edades.keySet()) {
    System.out.println(nombre + " tiene " + edades.get(nombre) + " años");
}
```

| Método                | Descripción |
|-----------------------|-------------|
| `put(clave, valor)`   | Añade o actualiza un par clave-valor. |
| `get(clave)`          | Obtiene el valor asociado a la clave. |
| `remove(clave)`       | Elimina la clave y su valor. |
| `containsKey(clave)`  | Verifica si existe la clave. |
| `containsValue(valor)`| Verifica si existe el valor. |
| `keySet()`            | Devuelve un conjunto de todas las claves. |
| `values()`            | Devuelve una colección de todos los valores. |
| `size()`              | Cantidad de pares almacenados. |
| `clear()`             | Elimina todos los pares. |

---

### 6.4. HashSet: conjunto sin duplicados

`HashSet` es una colección que almacena elementos únicos (no permite duplicados) y no garantiza orden. Es útil cuando solo importa la existencia de elementos, no su posición.

**Declaración y uso básico:**
```java
import java.util.HashSet;

HashSet<String> paises = new HashSet<>();
paises.add("México");
paises.add("Colombia");
paises.add("México"); // No se añade de nuevo

System.out.println(paises.contains("Colombia")); // true
paises.remove("Colombia");

for (String pais : paises) {
    System.out.println(pais); // Imprime cada país, sin duplicados
}
```

| Método                | Descripción |
|-----------------------|-------------|
| `add(elemento)`       | Añade un elemento (solo si no existe). |
| `remove(elemento)`    | Elimina un elemento. |
| `contains(elemento)`  | Verifica si el elemento está presente. |
| `isEmpty()`           | Indica si el conjunto está vacío. |
| `size()`              | Devuelve la cantidad de elementos. |
| `clear()`             | Elimina todos los elementos. |

---

### 6.5. Métodos útiles de otras clases comunes

#### 6.5.1 Math (operaciones matemáticas)
```java
int mayor = Math.max(10, 20);      // 20
double raiz = Math.sqrt(16);       // 4.0
double aleatorio = Math.random();  // Entre 0.0 y 1.0
```

---
#### 6.5.3 Arrays (utilidades para arreglos)
```java
import java.util.Arrays;
int[] numeros = {3, 1, 2};
Arrays.sort(numeros); // Ordena: [1, 2, 3]
System.out.println(Arrays.toString(numeros)); // Imprime: [1, 2, 3]
```

---

### 6.6. Buenas prácticas al usar métodos y colecciones

- Usa los métodos de clases estándar para evitar errores y ahorrar tiempo.
- Prefiere `ArrayList` para listas dinámicas, `HashMap` para pares clave-valor, y `HashSet` para colecciones de elementos únicos.
- Documenta el propósito de cada colección y método en tu código.
- Usa clases envolventes (`Integer`, `Double`, etc.) en colecciones genéricas, nunca tipos primitivos.
- Elige la colección adecuada según el problema:
  - Lista ordenada y con duplicados → `ArrayList`
  - Búsqueda por clave → `HashMap`
  - Elementos únicos, sin orden → `HashSet`

---

**Dominar estos métodos y colecciones te permitirá escribir programas en Java más eficientes, profesionales y adecuados a los problemas reales del desarrollo moderno.**





## 7. Algunos conceptos avanzados esenciales

- **Interfaces:** Contratos que definen métodos que una clase debe implementar.
- **Clases abstractas:** No se pueden instanciar, sirven como base para otras clases.
- **Herencia múltiple indirecta:** Java no permite herencia múltiple directa, pero sí permite que una clase implemente múltiples interfaces.
- **Colecciones:** Estructuras de datos como Listas (`List`), Conjuntos (`Set`), Mapas (`Map`), Pilas y Colas.
- **Genéricos:** Permiten que clases y métodos trabajen con cualquier tipo de dato.

--- -->

## 5. Herramientas y Entorno Java

- **JDK (Java Development Kit):** Kit para desarrollar en Java (incluye compilador, JVM y herramientas).
- **IDE (Entorno de Desarrollo Integrado):** Programas como IntelliJ IDEA, Eclipse, NetBeans, Visual Studio Code (con extensión Java).
- **Maven/Gradle:** Herramientas para gestión de proyectos y dependencias.

---

### 5.1. Buenas Prácticas

- Separa el código en clases y paquetes según su función.
- Usa nombres descriptivos para variables y métodos.
- Usa plurales solo para colecciones
- Documenta tu código (`// Comentario de línea` y `/* Comentario de bloque */`).
- Maneja siempre las excepciones y recursos.
- Usa convenciones de nombres:

| Nombres de | Convención             | Ejemplo             |
| ---------- | ---------------------- | ------------------- |
| Clases     | PascalCase             | MiClase             |
| Variables  | camelCase              | miVariable          |
| Métodos    | camelCase              | miMetodo            |
| Constantes | MAYÚSCULAS_CON_GUIONES | MI_CONSTANTE        |
| Paquetes   | minúsculas, con punto  | mi.paquete.proyecto |

---

<!-- ### 8.4. Recursos para seguir aprendiendo

- [Documentación oficial de Java](https://docs.oracle.com/en/java/javase/21/)
- [Java en W3Schools](https://www.w3schools.com/java/)
- [GeeksForGeeks Java](https://www.geeksforgeeks.org/java/)
- [Codecademy Java](https://www.codecademy.com/learn/learn-java)
- [Java API Docs (Inglés)](https://docs.oracle.com/en/java/javase/21/docs/api/index.html)
--- -->

## Glosario

| Término             | Definición                                                       |
| ------------------- | ---------------------------------------------------------------- |
| **Clase**           | Plantilla que define atributos y métodos de los objetos.         |
| **Objeto**          | Instancia de una clase.                                          |
| **Método**          | Función definida dentro de una clase.                            |
| **Atributo**        | Variable dentro de una clase.                                    |
| **Instancia**       | Objeto creado a partir de una clase.                             |
| **Constructor**     | Método especial para inicializar objetos.                        |
| **Paquete**         | Grupo de clases relacionadas.                                    |
| **Interfaz**        | Contrato que define métodos que deben implementarse.             |
| **Herencia**        | Capacidad para crear nuevas clases a partir de otras.            |
| **Polimorfismo**    | Capacidad de un objeto de adoptar diferentes formas.             |
| **Encapsulamiento** | Ocultar detalles internos de una clase.                          |
| **Bytecode**        | Código intermedio que ejecuta la JVM.                            |
| **JVM**             | Máquina Virtual de Java, ejecuta el bytecode.                    |
| **JDK**             | Kit de desarrollo de Java.                                       |
| **IDE**             | Entorno de Desarrollo Integrado para programar.                  |
| **Excepción**       | Error que ocurre durante la ejecución de un programa.            |
| **Import**          | Instrucción para usar clases de otros paquetes.                  |
| **Static**          | Miembro de clase que pertenece a la clase, no a una instancia.   |
| **Final**           | Indica que un valor o método no puede cambiar o ser sobrescrito. |

---
