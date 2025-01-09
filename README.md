# Projeto Java - Sistema de Testes Interativos

Este projeto é um sistema interativo que executa diversos testes, como Fibonacci, Faturamento de Distribuidora, e inversão de strings. O usuário pode escolher qual teste executar via entrada de comandos no console.

## Requisitos

Antes de começar, certifique-se de que você tenha o seguinte instalado:

- [Java JDK 17+](https://www.oracle.com/java/technologies/javase-downloads.html)
- [Maven](https://maven.apache.org/) (opcional, caso utilize Maven como gerenciador de build)

### Clonar o Repositório

```bash
git clone https://github.com/seu-usuario/nome-do-projeto.git
cd nome-do-projeto
mvn clean install
mvn exec:java -Dexe.mainClass="org.edev.Main"
javac -d bin -sourcepath src src/org/edev/Main.java
java -cp bin org.edev.Main
```
