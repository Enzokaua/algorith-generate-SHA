# Algoritmos de Chaves SHA (SHA-1, SHA-2 e SHA-3)

> Este repositório contém a implementação dos algoritmos de geração de chaves criptográficas SHA-1, SHA-2 e SHA-3, com base em strings de entrada. O projeto foi desenvolvido com o objetivo de estudar e compreender os diferentes modelos de hash SHA (Secure Hash Algorithm), amplamente utilizados em segurança digital para verificação de integridade, assinatura digital e autenticação.

## 💻 Pré-requisitos

Para executar este projeto, certifique-se de ter as seguintes ferramentas configuradas no seu ambiente:

- **Java 21** ou superior;
- **Apache Maven** para gerenciamento de dependências e build do projeto;
- Editor ou IDE de sua escolha (IntelliJ IDEA, Eclipse, VS Code, etc.).

## 🚀 Sobre o projeto

O projeto utiliza uma abordagem simples e direta em Java para implementar os algoritmos SHA-1, SHA-2 e SHA-3, permitindo a geração de chaves hash a partir de strings de entrada. Este projeto tem como base conceitos de segurança da informação e foi criado com o intuito de ser reutilizável para outros algoritmos de hash.

### ✨ Funcionalidades

- Geração de chaves hash utilizando os algoritmos SHA-1, SHA-2 e SHA-3;
- Suporte para diferentes tamanhos de hash no SHA-2 (como SHA-256, SHA-384 e SHA-512);
- Entrada customizável para strings de qualquer tamanho;
- Validação da integridade gerando e comparando hashes.

### 🛠️ Tecnologias Utilizadas

- **Java**: Linguagem de programação principal do projeto;
- **Apache Maven**: Ferramenta de build e gerenciamento de dependências;
- **Java Simple**: Estilo direto e simplificado para a implementação dos algoritmos.

## 📚 Como Funciona o Algoritmo

Os algoritmos SHA geram um valor de hash a partir de uma string de entrada. O hash gerado é único para cada entrada e é amplamente utilizado para segurança. A seguir, uma breve descrição de cada modelo:

1. **SHA-1**: 
   - Produz um hash de 160 bits.
   - Embora obsoleto para muitas aplicações devido a vulnerabilidades, ainda é útil para estudos.

2. **SHA-2**:
   - Produz hashes com diferentes tamanhos (256, 384 ou 512 bits).
   - Amplamente utilizado e considerado seguro.

3. **SHA-3**:
   - Modelo mais recente da família SHA.
   - Baseado no algoritmo Keccak, com suporte para hashes de diferentes tamanhos.

### Etapas Gerais:
1. O algoritmo recebe uma string de entrada.
2. A string é processada por meio do modelo SHA escolhido.
3. Um hash (valor hexadecimal) é gerado como saída.

## 🛠️ Configuração e Execução

1. Clone este repositório:
   ```bash
   git clone https://github.com/seu-usuario/algoritmos-sha.git
