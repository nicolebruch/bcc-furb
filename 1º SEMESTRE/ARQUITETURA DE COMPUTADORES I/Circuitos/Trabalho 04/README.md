# ⏰ Relógio Digital em Assembly (M++) - Simulador M++

📌 **Este repositório contém o código em Assembly de um relógio digital simulável no ambiente M++.**
O relógio realiza a contagem de **segundos e minutos**, iniciando em **57:00** e avançando corretamente até **59:59**, retornando para **00:00**.

---

## 🔍 Sobre o Projeto

Este projeto simula um **relógio digital** utilizando lógica desenvolvida em Assembly (linguagem M++) e contadores operando sobre um simulador digital criado por um aluno do Miguel como parte de um projeto acadêmico.

🕑 **Funcionalidades:**

* Contagem de **segundos (00 a 59)**.
* Contagem de **minutos (00 a 59)**.
* Inicialização configurada para começar em **57 minutos e 0 segundos**.
* Saídas simuladas em displays, representando:

  * Dezena dos minutos
  * Unidade dos minutos
  * Dezena dos segundos
  * Unidade dos segundos

---

## 📜 Organização dos Registradores

| Registrador | Função                    |
| ----------- | ------------------------- |
| **B**       | Unidade dos segundos      |
| **C**       | Dezena dos segundos       |
| **D**       | Unidade dos minutos       |
| **E**       | Dezena dos minutos        |
| **A**       | Acumulador para operações |

---

## 🏗️ Lógica de Funcionamento

✅ O código executa um loop contínuo que:

1. **Incrementa a unidade dos segundos (B).**
   Se atingir 10, zera B e incrementa a dezena dos segundos (C).

2. **Dezena dos segundos (C)** conta até 5.
   Ao atingir 6, zera C e incrementa a unidade dos minutos (D).

3. **Unidade dos minutos (D)** conta até 9.
   Ao chegar em 10, zera D e incrementa a dezena dos minutos (E).

4. **Dezena dos minutos (E)** conta até 5.
   Ao atingir 6, zera E, reiniciando o relógio para 00:00.

---

## 🖥️ Ambiente de Execução

Este projeto **não utiliza SimulIDE.** Foi desenvolvido em um simulador próprio, feito em Java, que conta com:

* Um **Compilador Assembly (M++)** que gera os arquivos de imagem de memória.
* Uma interface gráfica para montagem dos circuitos, baseada no **Logisim**.

---

## 🚀 Como Usar

### 🔧 **Compilar o código Assembly**

1. No terminal (Linux), execute o compilador:

```bash
java -jar CompiladorAssembly.jar
```

2. O compilador irá gerar um arquivo que muda de extensão **`.mmf` para `.mmp`** após a compilação.

---

### 🏗️ **Abrir e rodar o circuito no simulador**

1. No terminal, execute o simulador gráfico (baseado no Logisim):

```bash
java -jar logisim-generic-2.7.1.jar
```

2. Na interface do simulador:

   * **Carregue o circuito** normalmente.
   * No componente de memória (memória ROM ou RAM), **substitua o arquivo antigo pelo arquivo `.mmp` recém-gerado**.
   * **Resete o circuito** (botão de reset no próprio circuito) para carregar a nova imagem de memória.

---

### ▶️ **Iniciar e pausar a simulação**

* Pressione **`Ctrl + K`** no simulador para **iniciar ou pausar** a execução do circuito.

---

## ⚙️ Observações Importantes

* Este simulador foi desenvolvido para fins educacionais, com foco na aprendizagem de lógica digital, arquitetura de computadores e Assembly.
* A execução no Linux requer que você tenha o **Java instalado** para rodar tanto o compilador quanto o simulador gráfico.

