# 🚀 CompiSim - Simulador de Compilador Multilenguaje

<div align="center">

![CompiSim Logo](https://img.shields.io/badge/CompiSim-v1.0-blue?style=for-the-badge&logo=java)
[![Java](https://img.shields.io/badge/Java-21+-orange?style=for-the-badge&logo=java)](https://www.oracle.com/java/)
[![ANTLR](https://img.shields.io/badge/ANTLR-4.13-green?style=for-the-badge)](https://www.antlr.org/)
[![Maven](https://img.shields.io/badge/Maven-3.9.9+-red?style=for-the-badge&logo=apache-maven)](https://maven.apache.org/)

*El compilador inteligente que reconoce, analiza y ejecuta código en 7 lenguajes diferentes*

</div>

---

## 📋 Tabla de Contenidos

- [🎯 Descripción del Proyecto](#-descripción-del-proyecto)
- [✨ Características Principales](#-características-principales)
- [🛠️ Tecnologías Utilizadas](#️-tecnologías-utilizadas)
- [🎮 Lenguajes Soportados](#-lenguajes-soportados)
- [📦 Instalación](#-instalación)
- [🚀 Uso del Sistema](#-uso-del-sistema)
- [📊 Análisis del Compilador](#-análisis-del-compilador)
- [🔍 Ejemplos de Uso](#-ejemplos-de-uso)
- [📁 Estructura del Proyecto](#-estructura-del-proyecto)
- [🎨 Interfaz de Usuario](#-interfaz-de-usuario)
- [🏢 Información Comercial](#-información-comercial)
- [🤝 Contribución](#-contribución)

---

## 🎯 Descripción del Proyecto

**CompiSim** es un simulador de compilador avanzado desarrollado en Java que implementa las **tres fases fundamentales del análisis de compilación**: léxico, sintáctico y semántico. Diseñado con una interfaz gráfica moderna y intuitiva, CompiSim permite a usuarios, estudiantes y desarrolladores analizar código en múltiples lenguajes de programación de manera educativa y profesional.

### 🎓 Propósito Educativo

CompiSim está diseñado para:
- **Enseñar** los conceptos fundamentales de compiladores
- **Demostrar** las fases de análisis léxico, sintáctico y semántico
- **Visualizar** tokens, errores y símbolos de manera clara
- **Simular** la ejecución de código sin riesgos

---

## ✨ Características Principales

### 🔍 **Detección Automática de Lenguajes**
- Reconocimiento inteligente de 7 lenguajes de programación
- Algoritmos de detección basados en patrones y palabras clave
- Soporte para selección manual de lenguaje

### 📊 **Análisis Completo de Compilación**
- **Análisis Léxico**: Tokenización y detección de errores léxicos
- **Análisis Sintáctico**: Validación de estructura gramatical
- **Análisis Semántico**: Verificación de tipos y coherencia lógica

### 🗂️ **Gestión de Datos**
- **Tabla de Símbolos**: Registro de variables, funciones y clases
- **Tabla de Errores**: Clasificación y localización de errores
- **Tabla de Tokens**: Visualización detallada de elementos léxicos

### 🖥️ **Interfaz Moderna**
- Diseño limpio con tema claro y colores profesionales
- Navegación por pestañas intuitiva
- Registro de actividades en tiempo real
- Visualización de árbol de análisis sintáctico

### 📁 **Carga de Archivos**
- Soporte para archivos `.txt`
- Editor integrado con detección de cambios
- Ejemplos incluidos para cada lenguaje

---

## 🛠️ Tecnologías Utilizadas

| Tecnología | Versión | Propósito |
|------------|---------|-----------|
| **Java** | 21+     | Lenguaje base del proyecto |
| **ANTLR 4** | 4.13.1  | Generación de parsers y lexers |
| **Apache Maven** | 3.9.9+  | Gestión de dependencias |
| **Swing** | JDK     | Interfaz gráfica de usuario |
| **Regex** | JDK     | Patrones de detección de lenguajes |

---

## 🎮 Lenguajes Soportados

<table>
<tr>
<td align="center">

### 💻 **C++**
✅ **Análisis Completo**
- Variables y tipos
- Funciones
- Verificación semántica
- Detección de errores

</td>
<td align="center">

### 🌐 **HTML**
✅ **Análisis Básico**
- Tags y atributos
- Estructura del documento
- Validación sintáctica

</td>
<td align="center">

### 📜 **JavaScript**
⚠️ **Análisis Parcial**
- Variables (var, let, const)
- Funciones básicas
- Clases simples

</td>
</tr>
<tr>
<td align="center">

### 📐 **Pascal**
⚠️ **Análisis Parcial**
- Variables básicas
- Estructuras simples
- Tipos primitivos

</td>
<td align="center">

### 🗄️ **PL/SQL**
🔄 **En Desarrollo**
- Comandos SQL básicos
- Procedimientos
- Variables

</td>
<td align="center">

### 🐍 **Python**
✅ **Análisis Básico**
- Variables dinámicas
- Funciones y clases
- Imports

</td>
</tr>
<tr>
<td colspan="3" align="center">

### 🗃️ **T-SQL**
🔄 **En Desarrollo**
- Consultas SQL
- Procedimientos almacenados
- Manipulación de datos

</td>
</tr>
</table>

---

## 📦 Instalación

### 📋 **Requisitos Previos**

```bash
- Java JDK 21 o superior
- Apache Maven 3.9.9+
- Git (para clonar el repositorio)
```

### 🔧 **Pasos de Instalación**

1. **Clonar el repositorio**
```bash
git clone https://github.com/ByronRodM/CompiladorMultilenguaje.git
cd CompiladorMultilenguaje
```

2. **Compilar el proyecto**
```bash
mvn clean compile
```

3. **Ejecutar CompiSim**
```bash
mvn exec:java
```

### 🚀 **Ejecución Alternativa**

```bash
# Compilar y ejecutar en un solo comando
mvn clean compile exec:java

# Generar JAR ejecutable
mvn clean package
java -jar target/CompiSim-1.0.jar
```

---

## 🚀 Uso del Sistema

### 1️⃣ **Interfaz Principal**

Al ejecutar CompiSim, verás:
- **📝 Editor de Código**: Panel izquierdo para escribir código
- **📊 Resultados del Análisis**: Panel derecho con pestañas
- **🎛️ Barra de Herramientas**: Controles principales
- **📋 Registro de Actividad**: Log de operaciones

### 2️⃣ **Flujo de Trabajo**

```
Escribir Código → 🔍 Analizar → Ver Tokens → Revisar Errores → Explorar Símbolos
```

### 3️⃣ **Opciones Disponibles**

- **🔍 Analizar**: Ejecuta el análisis completo
- **🌳 Ver Árbol**: Visualiza el árbol sintáctico
- **📁 Cargar Archivo**: Importa código desde archivo
- **🗑️ Limpiar**: Reinicia el editor

---

## 📊 Análisis del Compilador

### 🔤 **Fase 1: Análisis Léxico**
- **Tokenización** del código fuente
- **Clasificación** de palabras reservadas, operadores, literales
- **Detección** de errores léxicos (caracteres inválidos)

### 🌳 **Fase 2: Análisis Sintáctico**
- **Construcción** del árbol de análisis sintáctico (AST)
- **Validación** de la estructura gramatical
- **Identificación** de errores sintácticos

### 🧠 **Fase 3: Análisis Semántico**
- **Verificación** de tipos de datos
- **Control** de variables declaradas/no declaradas
- **Validación** de compatibilidad de operaciones

### 🎯 **Simulación de Ejecución**
- **Interpretación** básica de comandos SQL (CREATE, INSERT, etc.)
- **Simulación** de operaciones CRUD
- **Feedback** informativo sobre la ejecución

---

## 🔍 Ejemplos de Uso

### C++ Example
```cpp
int a = 5;
int b = 6;
int c = a + b;
float pi = 3.14;
string greeting = "Hola CompiSim";
bool isReady = true;
```

**Resultado:**
- ✅ 6 símbolos detectados
- ✅ Tipos verificados
- ✅ Sin errores

### Python Example
```python
x = 10
y = 3.14
name = "CompiSim"

def calculate(a, b):
    result = a + b
    return result
```

**Resultado:**
- ✅ Variables y función detectadas
- ✅ Análisis semántico básico
- ✅ Sin errores

### SQL Example
```sql
CREATE TABLE usuarios (
    id INT PRIMARY KEY,
    nombre VARCHAR(100)
);
```

**Resultado:**
- ✅ Comando SQL reconocido
- ✅ Simulación: "Se creó la tabla usuarios"

---

## 📁 Estructura del Proyecto

```
CompiladorMultilenguaje/
├── src/main/java/umg/edu/
│   ├── antlr/                     # Gramáticas ANTLR
│   │   ├── cpp/                   # Parser C++
│   │   ├── html/                  # Parser HTML
│   │   ├── js/                    # Parser JavaScript
│   │   ├── pascal/                # Parser Pascal
│   │   ├── plsql/                 # Parser PL/SQL
│   │   ├── python/                # Parser Python
│   │   ├── tsql/                  # Parser T-SQL
│   │   └── LanguageDetector.java  # Detector de lenguajes
│   ├── error/                     # Gestión de errores
│   │   ├── CompilationError.java
│   │   └── ErrorTable.java
│   ├── lexer/                     # Análisis léxico
│   │   ├── LexerManager.java
│   │   └── TokenInfo.java
│   ├── parser/                    # Análisis sintáctico
│   │   └── ParserManager.java
│   ├── semantic/                  # Análisis semántico
│   │   ├── SemanticAnalyzer.java
│   │   └── [language]/            # Listeners por lenguaje
│   ├── symboltable/               # Tabla de símbolos
│   │   ├── Symbol.java
│   │   └── SymbolTable.java
│   └── ui/                        # Interfaz gráfica
│       ├── CompilerUI.java
│       └── TreeVisualizer.java
├── src/main/resources/
│   └── examples/                  # Archivos de ejemplo
├── pom.xml                        # Configuración Maven
└── README.md                      # Este archivo
```

---

## 🎨 Interfaz de Usuario

### 🎨 **Diseño Moderno**
- **Tema claro** con colores profesionales azules
- **Tipografía clara** para mejor legibilidad
- **Espaciado optimizado** para una experiencia fluida

### 📱 **Componentes Principales**
- **Editor de código** con numeración de líneas
- **Pestañas organizadas**: Tokens, Errores, Tabla de Símbolos
- **Barra de herramientas** con iconos intuitivos
- **Panel de actividades** con feedback en tiempo real

### 🎯 **Experiencia de Usuario**
- **Navegación intuitiva** sin cambios automáticos de pestaña
- **Feedback inmediato** sobre el estado del análisis
- **Visualización clara** de resultados y errores