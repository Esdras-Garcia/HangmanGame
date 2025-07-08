# HangmanGame 🎮 (Jogo da Forca)

> Um jogo da forca desenvolvido em Java, executado via terminal, com foco em orientação a objetos e tratamento robusto de exceções.

## 🧠 Visão Geral

Este projeto implementa o clássico jogo da forca no terminal, utilizando boas práticas de programação orientada a objetos em Java. O jogador tenta adivinhar uma palavra inserindo letras até completar a palavra ou atingir o limite de erros.

## 🚀 Como Executar

### Pré-requisitos

- Java 17 ou superior
- Gradle (ou use o `gradlew` incluso)

### Clonando e executando o jogo

```bash
git clone https://github.com/Esdras-Garcia/HangmanGame.git
cd HangmanGame/hangman
./gradlew build
java -cp build/classes/java/main com.github.esdrasgarcia.hangman.Main a n i m a l
```

> A palavra secreta deve ser passada como argumento, letra por letra, ao executar o jogo.

## 🗂️ Estrutura de Pacotes

- `com.github.esdrasgarcia.hangman.Main`: Classe principal com entrada e loop do jogo.
- `model.HangmanGame`: Gerencia o estado do jogo.
- `model.HangmanChar`: Representa cada letra da palavra.
- `model.HangmanGameStatus`: Enum com os estados do jogo.
- `exception.LetterAlreadyInputtedException`: Exceção para letras repetidas.
- `exception.GameIsFinishedException`: Exceção para tentativas após o fim do jogo.

## 🧩 Funcionalidades

- Controle de letras já tentadas.
- Detecção de fim de jogo (vitória ou derrota).
- Saída formatada mostrando o progresso da palavra.
- Tratamento de exceções personalizadas.

## 📌 Exemplo de Uso

```
Entrada:
java Main j a v a

Saída:
Bem-vindo ao jogo da forca! Tente adivinhar a palavra.
_ _ _ _
Digite uma letra:
a
Resultado: _ _ _ a
...
```

## 🛠️ Melhorias Futuras

- Adicionar modo interativo sem argumentos.
- Persistência de histórico de partidas.
- Interface gráfica (Swing, JavaFX ou Web).

## 📄 Licença

Distribuído sob a licença MIT. Consulte o arquivo [LICENSE](LICENSE) para mais informações.
